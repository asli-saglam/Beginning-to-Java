/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author ASLI
 */
import java.util.Scanner;
public class InputAlma {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("yas ve isim giriniz");
        
        int yas = scanner.nextInt();
        String isim = scanner.nextLine();
         System.out.println("yas:" + yas);
         System.out.println("isim:" + isim);
    }

    
}
