/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodoverloading;

/**
 *
 * @author ASLI
 */
public class MethodOverloading {
    
    
    public static void skorhesaplama(String isim, int puan){
        System.out.println(isim + "adlı oyuncunun " + puan + " puanı var.");
    }
    
    public static void skorhesaplama(int puan){
        System.out.println("isimsiz oyuncunun " + puan + " puanı var.");
    }
    public static void skorhesaplama(String isim){
        System.out.println(isim + " adlı oyuncunun hiç puanı yok.");
    }
    public static void main(String[] args) {
        skorhesaplama("aslı " , 5);
        skorhesaplama(6);
        skorhesaplama("aslı");

    }
    
}
