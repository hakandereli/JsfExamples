package com.tr.jsfexamples.entities;

import java.math.BigDecimal;

public class Personel {
    
    String numarasi;
    String adi;
    String soyadi;
    BigDecimal maasi;
    int yasi;
    
    boolean editable;

    public Personel(String numarasi, String adi, String soyadi, BigDecimal maasi, int yasi) {
        this.numarasi = numarasi;
        this.adi = adi;
        this.soyadi = soyadi;
        this.maasi = maasi;
        this.yasi = yasi;
    }

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

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }


    
}
