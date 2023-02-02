package diziıslemleriudemy;

import java.util.Arrays;
import java.util.Scanner;

public class DiziIslemleriUdemy {

    
    public static int [] arrayiDoldur( int sayi){
        Scanner scanner = new Scanner(System.in);
        int dizi [] = new int[sayi];
        int i;
        for(i = 0; i<sayi; i++){
            dizi[i] = scanner.nextInt();   
        }
        
        return dizi;
    }
    
    public static void arrayiBastir(int array[]){
        int i;
        for(i= 0; i<array.length; i++){
            System.out.println("elaman " + (i+1) + " = " + array[i]);
            
        }
    }
    public static int [] array_sort(int array[]){
        Arrays.sort(array);
        arrayiBastir(array);
        
        
        return array;
    }
            
    
    public static void main(String[] args) {
        System.out.println("diziye eklemek istediginiz elemanlari griniz.\n");
        int a [] = arrayiDoldur(5);
        //arrayiBastir(a);
        array_sort(a);
        
       
    }
    
}
