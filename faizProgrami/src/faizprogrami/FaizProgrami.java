/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faizprogrami;

import java.util.Scanner;

/**
 *
 * @author ASLI
 */
public class FaizProgrami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz   Faiz oranı %6");
        
        int anapara, vade;
        System.out.println("Yatırmak istedeğiniz tutarı giriniz:");
        anapara = scanner.nextInt();
        System.out.println("Paranızı kaç yıl vadeli yatırmak istiyorsunuz:");
        vade = scanner.nextInt();
        
        double toplampara = anapara;
        double faizorani = 0.06;
        
        for(int i = 1; i<=vade; i++){
            toplampara = ((toplampara * faizorani)+ toplampara);
            System.out.println(i+ ". yılın sonundaki toplam paranız: "+ (int)toplampara);
        }
        
    }
    
    
}
