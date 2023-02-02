/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kosulludurumlar;

/**
 *
 * @author ASLI
 */
import java.util.Scanner;
public class KosulluDurumlar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       System.out.println("Lütfen notunuzu giriniz:");
       
       int not = scanner.nextInt();
        if(not >=90){
            System.out.println("AA");
        }
        
        else if(not >= 85){
        System.out.println("AB");
    }
        else if(not>= 75){
        System.out.println("BA");
    }
        else if(not>=70){
            System.out.println("BB");
        }
        else if(not>=60){
            System.out.println("CB");
        }
        
        else{
                System.out.println("Dersten kaldınız!");
                }
       
               
    }
    
}
