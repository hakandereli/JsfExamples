package com.tr.jsfexamples.beans;

import com.tr.jsfexamples.entities.Personel;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "personelManagedBean")
@SessionScoped
public class PersonelManagedBean implements Serializable {
    
    String numarasi;
    String adi;
    String soyadi;
    BigDecimal maasi;
    int yasi;
    
    private boolean artanSiralama =  true;
    
    public String getNumarasi() {
        return numarasi;
    }

    public void setNumarasi(String numarasi) {
        this.numarasi = numarasi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public BigDecimal getMaasi() {
        return maasi;
    }

    public void setMaasi(BigDecimal maasi) {
        this.maasi = maasi;
    }

    public int getYasi() {
        return yasi;
    }

    public void setYasi(int yasi) {
        this.yasi = yasi;
    }

    public boolean isArtanSiralama() {
        return artanSiralama;
    }

    public void setArtanSiralama(boolean artanSiralama) {
        this.artanSiralama = artanSiralama;
    }
    
    

    private static final ArrayList<Personel> personelListesi = 
            new ArrayList<Personel>(Arrays.asList(
                new Personel("1", "Hakan", "DERELİ", new BigDecimal("1500.50"), 25),
                new Personel("2", "Ali", "UZUN", new BigDecimal("2500.50"), 45),
                new Personel("3", "Atilla", "KARA", new BigDecimal("3800.00"), 35),
                new Personel("4", "Sinan", "YILMAZ", new BigDecimal("4500.00"), 42),
                new Personel("5", "Gökhan", "KIRAÇ", new BigDecimal("9000.50"), 75),
                new Personel("6", "Ahmet", "TELLİ", new BigDecimal("12000.00"), 24),
                new Personel("7", "Kemal", "VELİ", new BigDecimal("9500.00"), 36),
                new Personel("8", "Şoray", "DELİ", new BigDecimal("3850.00"), 42),
                new Personel("9", "Deniz", "KASTIRCI", new BigDecimal("4250.00"), 25),
                new Personel("10", "Veli", "KEMAL", new BigDecimal("6500.00"), 34)
            ));
    
    
    public ArrayList<Personel> getPersonelListesi(){
        return personelListesi;
    }
    
    public void add(){
        Personel personel = new Personel(this.numarasi, this.adi, this.soyadi, this.maasi, this.yasi);
        
        personelListesi.add(personel);
        this.numarasi="";
        this.adi="";
        this.soyadi="";
        this.maasi=null;
        this.yasi=0;
        
    }
    
    public void delete(Personel personel){
        personelListesi.remove(personel);
    }
    
    public void setEditable(Personel personel){
        personel.setEditable(true);
    }
    
    public void update(Personel personel){
        personel.setEditable(false);
    }
    
    public void orderByPersonelAdi(){
        
        if(artanSiralama){
            Collections.sort(personelListesi, (Personel o1, Personel o2) -> o1.getAdi().compareTo(o2.getAdi()));
            this.artanSiralama = false;
        }else{
            Collections.sort(personelListesi, (Personel o1, Personel o2) -> o2.getAdi().compareTo(o1.getAdi()));
            this.artanSiralama = true;
        }
        
    }
}
