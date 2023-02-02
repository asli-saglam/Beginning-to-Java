
package iteratortest;

import java.util.*;

public class iteratorTest {

   
    public static void main(String[] args) {
        HashSet liste = new HashSet();
        liste.add("ordu");
        liste.add("ankara");
        liste.add("izmir");
        liste.add("tekirdag");
        Iterator i = liste.iterator();
        
        
        while(i.hasNext()){
            System.out.println("listenin elemanları:" + i.next());
            i.remove();
            
        }
        System.out.println("elemanlar silindi..");
        System.out.println(liste);
        
    }
    
}
