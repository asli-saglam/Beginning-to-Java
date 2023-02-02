
package arraylist1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {
    
    public static void yazdir(ArrayList<String> a){
        
        for(int i=0; i<a.size(); i++){
            System.out.println("eleman "+(i+1)+ ": "+ a.get(i));
        }
    }

    
    public static void main(String[] args) {
        
        ArrayList<String> arraylist = new ArrayList<String>();
        
        arraylist.add("onur");
        arraylist.add("asli");
        arraylist.add("duygu");
        
        System.out.println(arraylist); // bu şekilde arraylist şekilnde verir.for döngüsünde string şeklinde verir.
        System.out.println("-------------");
        
        for(int i=0 ; i<arraylist.size(); i++){
            System.out.println(arraylist.get(i));
        }
        
        
        System.out.println("-------------");
        System.out.println(arraylist.get(0));
        System.out.println("-------------");
        
        
        //System.out.println(arraylist.get(5));// hata!!
        System.out.println(arraylist.size()); // boyunu verir.
        
        System.out.println("--------------");
        
        arraylist.remove(0); //arraylistten siler.
        System.out.println(arraylist);
        System.out.println(arraylist.get(0));
        
        System.out.println("_____________");
        
        System.out.println(arraylist.indexOf("asli"));// kaçıncı index
        System.out.println(arraylist.lastIndexOf("asli")); //dizide 1den fazla "asli"varsa sonuncu "asli"nin yerini gösterir.
        System.out.println("______________");
        System.out.println(arraylist.indexOf("sura")); //array listte olmadığı için -1 döner.
        
        
        
        System.out.println("--------------");
        arraylist.set(1, "nazlı");//arraylisti günceller. (1 de duygu vardı,nazlı ile güncelledi.)
        System.out.println(arraylist);
        System.out.println("--------------");
        yazdir(arraylist);
        
    }
    
}
