/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcase;

import java.util.Scanner;

/**
 *
 * @author ASLI
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen islem griniz");
        int islem = scanner.nextInt();
    
        
        switch(islem){
            case 1:
                System.out.println("1.islem");
                break;
            case 2:
                System.out.println("2.islem");
                break;
            case 3:
                System.out.println("3.islem");
                break;
                
            default:
                System.out.println("gecersiz islem");
        }*/
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz:");
        int a = scanner.nextInt();
        
        System.out.println("İkinnci sayıyı giriniz:");
        int b = scanner.nextInt();
        
        System.out.println("üçüncü sayıyı giriniz:");
        int c = scanner.nextInt();
        
        int maks ;
        
        
        if(a >= b && a >=c){
            maks =a;
        }
        else if(b >= a && b>=c){
            maks =b;
        }
        else {
            maks = c;
        }
        System.out.println("maksimum sayı :"+ maks);
    }
    
}
