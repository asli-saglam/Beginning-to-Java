/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refaranslar;

/**
 *
 * @author ASLI
 */
public class Account {

    private String hesapNo;
    private double bakiye;
    private String isim;
    private String telefon;
    private String email;
    
    public Account(){ // constructor
        System.out.println("Kendi yazdığımız condstructor ");
    }
    
    public Account(String isim, String email,String telefon){
        this.email = email;
        this.bakiye = bakiye;
        this.hesapNo = hesapNo;
        this.telefon= telefon;
        this.isim = isim;
                
        
    }

    public void paraYatirma(double miktar){
        bakiye += miktar;
        System.out.println("Yeni bakiyeniz: " + bakiye);
    }
    
    public void paracekme(double miktar){
        if(miktar> 1500){
            System.out.println("Bir günde 1500 tl den fazla para çekemezsiniz..");
        }
        
        if((bakiye - miktar)< 0){
            System.out.println("Yetersiz bakiye");
        }
        else{
            bakiye -= miktar;
            System.out.println("yeni bakiye:"+ bakiye);
        }
    }
    
    
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the telefon
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    

    
}
