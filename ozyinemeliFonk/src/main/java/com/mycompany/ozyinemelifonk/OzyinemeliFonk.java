
package com.mycompany.ozyinemelifonk;

import java.util.Scanner;

public class OzyinemeliFonk {
    
    public static int faktor(int sayi){
        
        if(sayi >= 1){
            return sayi* faktor(sayi-1);
        }
        else
            return 1;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("faköriyelini hesaplamak istedğiniz sayıyı giriniz:");
        int num = scanner.nextInt();
        
        System.out.println("Faktöriyel"+ num + " = " + faktor(num) );
    }
}
