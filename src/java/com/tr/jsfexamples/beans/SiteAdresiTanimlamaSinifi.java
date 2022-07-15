/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tr.jsfexamples.beans;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import org.apache.commons.validator.UrlValidator;

@FacesConverter("com.tr.jsfexamples.beans.SiteAdresiTanimlamaSinifi")
public class SiteAdresiTanimlamaSinifi implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uıc, String value) {
        String http = "http://";
        StringBuilder url = new StringBuilder();
        
        if(!value.startsWith(http, 0)){
            url.append(http);
        }
        
        url.append(value);
        
        UrlValidator urlValidator = new UrlValidator();
        
        if(!urlValidator.isValid(url.toString())){
            FacesMessage mesaj = new FacesMessage("URL tanımlama hatası","Geçersiz URL girildi.");
            mesaj.setSeverity(FacesMessage.SEVERITY_ERROR);
            
            throw new ConverterException(mesaj);
        }
        
        return url.toString();
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uıc, Object value) {
        
        return value.toString();
    }
    
}
