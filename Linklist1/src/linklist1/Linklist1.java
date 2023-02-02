
package linklist1;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linklist1 {
    public static void listeyi_yazdir(LinkedList<String> malzemeler){
        /*for(String s: malzemeler){
            System.out.println(s);
        }*/
        
        
        ListIterator<String> iterator = malzemeler.listIterator();
        while(iterator.hasNext()){ // iteratörün next i olduğu sürece
             System.out.println(iterator.next());// iteratörün nextini bastır.
            
            
        }
        
    }
    public static void sirali_ekle(LinkedList<String> malzemeler,String yeni){
        ListIterator<String> iterator = malzemeler.listIterator();
        
        while(iterator.hasNext()){ // iteratörün next i olduğu sürece
       
            
            int karsilastir =iterator.next().compareTo(yeni);//alfabetik sıralar.
            
            if(karsilastir== 0){
                //iki değer eşit
                System.out.println("listede bu eleman zaten var.");
                return;
            }
            else if(karsilastir<0){
                //yeni değer iteratör.next ten daha büyük.
                
            }
            else if(karsilastir>0){
                iterator.previous();//bir geri gider
                iterator.add(yeni);
                return;
                
            }
    }
        iterator.add(yeni);
       
                
 }
    
    public static void main(String[] args) {
        
        LinkedList<String> malzemeler = new LinkedList<String>();
        
       /* malzemeler.add("bardak");
        malzemeler.add("çatal");
        malzemeler.add("bıçak");
        malzemeler.add("makas");
        listeyi_yazdir(malzemeler);
        System.out.println("______________");*/
        
        /*malzemeler.add(3,"kalem");
        listeyi_yazdir(malzemeler);*/
        
        sirali_ekle(malzemeler, "kapı");
        sirali_ekle(malzemeler, "ev");
        sirali_ekle(malzemeler, "araba");
        sirali_ekle(malzemeler, "tekerlek");
        listeyi_yazdir(malzemeler);

    }
    
}
