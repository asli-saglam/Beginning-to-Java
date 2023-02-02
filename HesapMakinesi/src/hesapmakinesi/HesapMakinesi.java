/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hesapmakinesi;

import java.util.Scanner;

/**
 *
 * @author ASLI
 */
public class HesapMakinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************");
        
        String islemler = "1. Toplama işlemi\n"
                         +"2. Çıkarma işlemi\n"
                         +"3. Çarpma işlemi\n"
                         +"4. Bölme işlemi";
        System.out.println(islemler);
        System.out.println("*******************");
        System.out.println("Yapmak istediğiniz işlem numarasını giriniz:");
        
        String islem = scanner.nextLine();
        double a;
        double b;
        
        switch(islem){
            case "1":
                System.out.print("Birinci sayıyı giriniz:");
                a = scanner.nextInt();
                System.out.print("İkinci sayıyı giriniz:");
                b = scanner.nextInt();
                System.out.print("Sonuç:" + (a+b));
                break;
                
            case "2":
                System.out.print("Birinci sayıyı giriniz:");
                a = scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz:");
                b = scanner.nextInt();
                System.out.print("Sonuç:" + (a - b));
                break;
            case "3":
                System.out.print("Birinci sayıyı giriniz:");
                a = scanner.nextDouble();
                System.out.print("İkinci sayıyı giriniz:");
                b= scanner.nextDouble();
                System.out.print("Sonuç:" + (a *b));
                break;
            case "4":  
                System.out.print("Birinci sayıyı giriniz.");
                a = scanner.nextDouble();
                System.out.print("İkinci sayıyı giriniz.");
                b = scanner.nextDouble();
                System.out.print("Sonuç:" + (a/b));
                
            default:
                System.out.println("Geçersiz işlem");
        }
        
    }
   
    
}
