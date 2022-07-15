/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tr.jsfexamples.beans;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ConvertersManagedBean implements Serializable{
    
    private Double urunFiyati;
    private Date sonKullanmaTarihi;
    private String urunUrl;
    private String saticiEposta; 

    public String getUrunUrl() {
        return urunUrl;
    }

    public void setUrunUrl(String urunUrl) {
        this.urunUrl = urunUrl;
    }

    public Date getSonKullanmaTarihi() {
        return sonKullanmaTarihi;
    }

    public void setSonKullanmaTarihi(Date sonKullanmaTarihi) {
        this.sonKullanmaTarihi = sonKullanmaTarihi;
    }

    public Double getUrunFiyati() {
        return urunFiyati;
    }

    public void setUrunFiyati(Double urunFiyati) {
        this.urunFiyati = urunFiyati;
    }

    public String getSaticiEposta() {
        return saticiEposta;
    }

    public void setSaticiEposta(String saticiEposta) {
        this.saticiEposta = saticiEposta;
    }
    
    
}
