/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carpimtablosufor;

/**
 *
 * @author ASLI
 */
public class CarpimTablosuFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i =1; i<= 10; i++){
            System.out.println("*******************");
            for(int j= 1; j<=10; j++){
                System.out.println(i + "x" + j + "="+ (i*j));
            }
            System.out.println("*******************");
        }
    }
    
}
