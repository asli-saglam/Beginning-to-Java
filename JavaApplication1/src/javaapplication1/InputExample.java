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

public class InputExample {
    public static void main(String[] args) {
        
    /*
    Scanner scanner = new Scanner(System.in);

        System.out.println("kilonuzu giriniz:");
        int kilo = scanner.nextInt();

        System.out.println("boyunuzu giriniz:");
        double boy = scanner.nextDouble();

        double bki = kilo / (boy * boy);

        System.out.println("beden kitle endeksi:" + bki);
    */
    
    Scanner scanner = new Scanner(System.in);
    int a;
    int b;
    System.out.println("Birinci kenarı giriniz:(cm)");
    a = scanner.nextInt();
    System.out.println("ikinici kenarı giriniz:(cm)");
    b = scanner.nextInt();
    
    double h = Math.sqrt(a*a + b*b);
    
        System.out.println("hipotenüs:" + h  +"cm" );
    
        
        
        
  
    
}
}