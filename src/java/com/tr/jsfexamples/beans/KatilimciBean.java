/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tr.jsfexamples.beans;

import com.tr.jsfexamples.enums.EnumEgitimDurumu;
import com.tr.jsfexamples.enums.EnumEhliyetTurleri;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = "katilimciBean")
@RequestScoped
public class KatilimciBean implements Serializable{

    private String ad;
    private String soyAd;
    private Long yas;
    private String parola;
    private String aciklama;
    private String gizliBilgi = "Bu bir gizli bilgidir.";
    private Boolean sozlesmeOnay;
    private String[] hobiler;
    private String[] ehliyetTurleri;
    private String cinsiyet;
    private String ders;
    private String egitmen;
    private String sigara;
    private String[] yabanciDil;
    private String egitimDurumu;
    
    
    private static Map<String, Object> dersAdi;
    
    static {
        dersAdi = new LinkedHashMap<String, Object>();
        dersAdi.put("Matematik" , "MAT");//LABEL VALUE
        dersAdi.put("Fen Bilgisi" , "FEN");//LABEL VALUE
        dersAdi.put("İngilizce" , "ING");//LABEL VALUE
    }
    
    public static class Egitmen{
        public String egitmenAdi;
        public String egitmenNo;

        public Egitmen(String egitmenAdi, String egitmenNo) {
            this.egitmenAdi = egitmenAdi;
            this.egitmenNo = egitmenNo;
        }

        public String getEgitmenAdi() {
            return egitmenAdi;
        }

        public String getEgitmenNo() {
            return egitmenNo;
        }
    }   
    
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public Long getYas() {
        return yas;
    }

    public void setYas(Long yas) {
        this.yas = yas;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getGizliBilgi() {
        return gizliBilgi;
    }

    public void setGizliBilgi(String gizliBilgi) {
        this.gizliBilgi = gizliBilgi;
    }

    public Boolean getSozlesmeOnay() {
        return sozlesmeOnay;
    }

    public void setSozlesmeOnay(Boolean sozlesmeOnay) {
        this.sozlesmeOnay = sozlesmeOnay;
    }

    public String[] getHobiler() {
        return hobiler;
    }

    public void setHobiler(String[] hobiler) {
        this.hobiler = hobiler;
    }
    
     public String getHobilerString(){
         return Arrays.toString(hobiler);
     }

    public String[] getEhliyetTurleri() {
        return ehliyetTurleri;
    }

    public void setEhliyetTurleri(String[] ehliyetTurleri) {
        this.ehliyetTurleri = ehliyetTurleri;
    }

    public EnumEhliyetTurleri[] getEhliyetTurleriValues(){
        return EnumEhliyetTurleri.values();
    }
    
    public String getEhliyetTurleriStrings(){
       return Arrays.toString(ehliyetTurleri);
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getDers() {
        return ders;
    }

    public void setDers(String ders) {
        this.ders = ders;
    }

    public static Map<String, Object> getDersAdi() {
        return dersAdi;
    }

    public static void setDersAdi(Map<String, Object> dersAdi) {
        KatilimciBean.dersAdi = dersAdi;
    }
    
    public Map<String, Object> dersAdlariniAl(){
        return dersAdi;
    }

    public String getEgitmen() {
        return egitmen;
    }

    public void setEgitmen(String egitmen) {
        this.egitmen = egitmen;
    }
    
    public Egitmen[] getEgitmenBilgileriAl(){
        Egitmen[] egitmenBilgisi =  new Egitmen[3];
        egitmenBilgisi[0] = new  Egitmen("Hakan Dereli", "1");
        egitmenBilgisi[1] = new  Egitmen("Ali Veli", "2");
        egitmenBilgisi[2] = new  Egitmen("Hasan Yüce", "3");
        
        return egitmenBilgisi;
    }

    public String getSigara() {
        return sigara;
    }

    public void setSigara(String sigara) {
        this.sigara = sigara;
    }

    public String[] getYabanciDil() {
        return yabanciDil;
    }

    public void setYabanciDil(String[] yabanciDil) {
        this.yabanciDil = yabanciDil;
    }

    public String dilDegerleriniAl(){
       return Arrays.toString(yabanciDil);
    }

    public String getEgitimDurumu() {
        return egitimDurumu;
    }

    public void setEgitimDurumu(String egitimDurumu) {
        this.egitimDurumu = egitimDurumu;
    }
    
    public EnumEgitimDurumu[] egitimDurumlariGetir(){
        return EnumEgitimDurumu.values();
    }
    
    public void egitimDurumuChanged(ValueChangeEvent e){
        egitimDurumu = e.getNewValue().toString();
    }
}
