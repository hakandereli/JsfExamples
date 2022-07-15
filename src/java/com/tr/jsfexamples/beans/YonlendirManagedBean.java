package com.tr.jsfexamples.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class YonlendirManagedBean implements Serializable {
    
    private String yonlendirilecekSayfa;

    public YonlendirManagedBean() {
        
    }
    
    public String anketeYonlendir(){
        return "/pages/anket/Anket";
    }

}
