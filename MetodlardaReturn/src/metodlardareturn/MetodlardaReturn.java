/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodlardareturn;

/**
 *
 * @author ASLI
 */
public class MetodlardaReturn {
    public static int ikiilecarp( int a){
        return a*2;
    }
    public static int ikiiletopla(int a){
        return a+2;
    }
    public static int dortilecarp(int a){
        return a*4;
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(dortilecarp(ikiiletopla(ikiilecarp(5))));
    }
    
}
