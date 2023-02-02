/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ınterfaceler;

/**
 *
 * @author ASLI
 */
public class Interfaceler {

   
    public static void main(String[] args) {
        pcMuhendisi muhendis1 = new pcMuhendisi(true,false);
        
        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_kaydi_sorgula();
        System.out.println(muhendis1.diploma_notu(3.5));
        String tecrube [] = {"havelsan","vestel"};
        muhendis1.is_tecrubesi(tecrube);
    }
    
}
