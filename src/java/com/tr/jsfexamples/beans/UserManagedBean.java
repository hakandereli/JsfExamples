package com.tr.jsfexamples.beans;

import java.io.Serializable;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class UserManagedBean implements Serializable {

    String name;
    String lastName;
    Long telephoneNumber;
    Long age = 0L;
    String unvan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getTelephoneNumber() {
        return telephoneNumber;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
    
    

    public void setTelephoneNumber(Long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String checkLoginControl() {
        
        Parameters();

        if(name != null || lastName != null || telephoneNumber != null || age != null){
            
             if ("hakan".equals(name) && "dereli".equals(lastName) && telephoneNumber == 123 && age >= 18) {
            
                 return "ProfilePage";
            
            } else {

                 return "PanelExampleLoginPage";

            }
        
        }else{
            return "PanelExampleLoginPage";
        }
        
       
    }

    private void Parameters() {
        FacesContext context = FacesContext.getCurrentInstance();
        this.unvan =  UnvanParametresiniAl(context);
    }

    private String UnvanParametresiniAl(FacesContext context) {
        
        Map<String, String> params = context.getExternalContext().getRequestParameterMap();
        
        return params.get("unvan");
        
    }
    
    public void ageUp(){
        age += 1L;
    }
    
    public void ageDown(){
        age -= 1L;
    }
}
