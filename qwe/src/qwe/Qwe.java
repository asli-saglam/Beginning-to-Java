/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qwe;

/**
 *
 * @author ASLI
 */
public class Qwe {

    
    
    public static void alanHesapla(int kenar,int kenar2){
        
        int alan = kenar * kenar2;
        System.out.println(alan);
        
        
    }
    
    
    public static int alanHesapla2(int kenar,int kenar2){
        
        int alan = kenar * kenar2;
        
        return alan;
        
    }
    public static void main(String[] args) {
        int kenar1 = 5;
        int kenar2 = 15;
        
        
        alanHesapla(kenar1, kenar2);
        
        System.out.println("islem sonucu =" + alanHesapla2(kenar1, kenar2)*2);
       /*  Object dizi[] = new Object[4];
        
        dizi[0] = 1;
        dizi[1] = "onur";
        dizi[2] = 6.8;
        dizi[3] = (int)dizi[0]+2;
        for (Object i: dizi){//dizinin elemanlarını yazdırır
            System.out.println(i);*/    // nesnelerden oluşan dizi
        
    }
    
}
