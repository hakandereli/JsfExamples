/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tr.jsfexamples.enums;

public enum EnumEgitimDurumu {
    ILK_OKUL("İLK OKUL"),
    ORTA_OKUL("ORTA OKUL"),
    LISE("LİSE"),
    UNIVERSITE("ÜNİVERSİTE"),
    YUKSEK_LISANS("YÜKSEK LİSANS");
    
    private String value;

    private EnumEgitimDurumu(String value) {
        this.value = value;
    }
    
    public String getValue(){
        return this.value;
    }
    
}
