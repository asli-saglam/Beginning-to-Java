/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package whiledongusu;

import java.util.Scanner;

/**
 *
 * @author ASLI
 */
public class WhileDongusu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* int i = 0;
        
        while(i <20){
            System.out.println("i :"+ i);
            i += 3;
        }*/
       
       Scanner scanner = new Scanner(System.in);
       
        System.out.println("Bir sayı giriniz:");
        int sayi = scanner.nextInt();
        int fakt = 1;
        while(sayi >0){
            fakt *= sayi;
            sayi--;
        }
        System.out.println("Faktöriyel :" + fakt);
    }
    
}
