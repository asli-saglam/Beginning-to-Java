/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bedenkitleendeksi;

import java.util.Scanner;

/**
 *
 * @author ASLI
 */
public class BedenKitleEndeksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz:");
        int kilo = scanner.nextInt();
        
        System.out.println("Boyunuzu giriniz.. (örn:1,72)");
        double boy = scanner.nextDouble();
        
        double bki = (kilo / (boy* boy));
        System.out.println("beden kitle endeksi:"+ bki);
        
        if(bki<18.5){
            System.out.println("zayıf");
            
        }
        else if(bki>=18 && bki<25){
            System.out.println("Normal");
        }
        else if(bki>=25 && bki<30){
            System.out.println("Fazla kilolu");
        }
        else{
        System.out.println("Obez");
        
    }
    }
    
}
