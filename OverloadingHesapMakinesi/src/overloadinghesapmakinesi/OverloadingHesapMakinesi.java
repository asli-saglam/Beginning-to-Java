/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloadinghesapmakinesi;

import java.util.Scanner;

/**
 *
 * @author ASLI
 */
public class OverloadingHesapMakinesi {

   public static int toplama(int a, int b){
       return(a+b);
   }
   public static int toplama(int a, int b, int c){
       return(a + b + c);
   }
   public static int cikarma(int a, int b){
       return(a - b);
   }
   public static double bolme(int a, int b){
       return((double) a /b);
   }
   public static int carpma(int a, int b){
       return(a*b);
   }
   public static int carpma(int a, int b, int c){
       return(a* b* c);
   }
   
   
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "1. islem toplama\n"
                         +"2.islem çıkarma\n"
                         +"3.işlem çarpma\n"
                         +"4.işlem bölme\n"
                         +"Çıkış için q'a basınız.";   
        
        System.out.println("********************");
        System.out.println(islemler);
        System.out.println("********************");
        
        while(true){
            System.out.println("İşlemi Seçiniz");
            String islem = scanner.nextLine();
            if(islem.equals(1)){
                System.out.println("Çıkış yapılıyor..");
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Kaç sayı toplamak istediğinizi giriniz (2 veya 3)");
                
                int kacsayi = scanner.nextInt();
                
                if(kacsayi == 2){
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.println("Toplam= " +( toplama(a, b)));
                }
                else if(kacsayi== 3){
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    System.out.println("Toplam = " + (toplama(a, b, c)));
                }
                else{
                    System.out.println("geçersiz işlem");
                }
                      
            }
            else if(islem.equals(2)){
                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b = scanner.nextInt();
                System.out.println("Sonuç: " + (cikarma(a, b)));
            }
            else if(islem.equals(3)){
                System.out.println("Kaç sayı çarpmak istediğinizi giriniz (2 veya 3)");
                
                int kacsayi = scanner.nextInt();
                
                if(kacsayi == 2){
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.println("Sonuç= " +( carpma(a, b)));
                }
                else if(kacsayi== 3){
                    System.out.print("a: ");
                    int a = scanner.nextInt();
                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    System.out.println("Sonuç = " + (carpma(a, b, c)));
                }
                else{
                    System.out.println("geçersiz islem");
                } 
        }
            else if(islem.equals(4)){
                System.out.print("a: ");
                int a = scanner.nextInt();
                System.out.print("b: ");
                int b = scanner.nextInt();
                System.out.println("Sonuç: " + (bolme(a, b)));
            }
            else{
                System.out.println("geçersiz işlem");
            }
    }
    
}
}