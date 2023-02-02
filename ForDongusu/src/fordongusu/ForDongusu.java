/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fordongusu;

import java.util.Scanner;

/**
 *
 * @author ASLI
 */
public class ForDongusu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       /* for(int i = 2; i<100; i*=2){
            System.out.println("i = " +i);
        }
*/
       
       Scanner scanner = new Scanner(System.in);
       System.out.println("Bir sayı giriniz:");
        
        int sayi = scanner.nextInt();
        int fakt = 1;
        
        for(int i =1; i <= sayi; i++){
        fakt *= i;
        }
        
        System.out.println("Faktöriyel= " + fakt);
        }
}
