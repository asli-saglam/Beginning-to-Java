/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atmprogrami;

import java.util.Scanner;

/**
 *
 * @author ASLI
 */
public class ATMprogrami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bakiye= 1000;
        String islemler = "1. islem: Bakiye Sorgulama\n"
                        + "2. islem: Para Çekme\n"
                        + "3. islem:Para Yatırma\n"
                        + "Çıkış için q'a basınız.. ";
        System.out.println("***************");
        System.out.println(islemler);
        System.out.println("***************");
        
        while(true){
            System.out.println("işlem seçiniz:");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Çıkış yapılıyor..");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz: " + bakiye);
            }
            else if(islem.equals("2")){
                System.out.println("Çekmek istediğiniz tutarı giriniz:");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                if((bakiye - tutar) < 0){
                    System.out.println("Yetersiz bakiye");
                }
                else{
                    System.out.println("Kalan bakiye:"+ (bakiye - tutar));
                 }
                 }
            else if(islem.equals("3")){
                System.out.println("Yatrımak istedeğiniz miktarı giriniz:");
                int miktar = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Mevcut bakiyeniz:"+ (bakiye+ miktar));
            }
            else{
                System.out.println("Geçersiz işlem girdiniz.");
             
            }
                    
        }
    }
    
}
