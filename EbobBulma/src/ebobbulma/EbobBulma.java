/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ebobbulma;

import java.util.Scanner;

/**
 *
 * @author ASLI
 */
public class EbobBulma {
    public static int ebobBulma(int sayi1, int sayi2){
        int ebob = 1;
        for(int i = 1; i<=sayi1 && i<=sayi2; i++){
            if((sayi1 % i == 0)&& (sayi2 % i == 0)){
                ebob = i;
            } 
            
        }
        return ebob;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("birinci sayı: ");
        int birinciSayi = scanner.nextInt();
        
        System.out.print("ikinci sayı: ");
        int ikinciSayi = scanner.nextInt();
        
        System.out.println("ebob: "+ ebobBulma(birinciSayi, ikinciSayi));
        
        
    }
    
}
