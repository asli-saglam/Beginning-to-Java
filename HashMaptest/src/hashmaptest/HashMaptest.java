package hashmaptest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMaptest {
    public static void main(String[] args) {
        
        HashMap ulkeler = new HashMap();
        ulkeler.put("ankara", "türkiye");
        ulkeler.put("bakü", "azerbeycan");
        ulkeler.put("moskova", "rusya");
        ulkeler.put("paris", "fransa");
        ulkeler.put("paris", "fransa");
        ulkeler.put(null, "ülke ismi yok");
        
        
        Set s = ulkeler.keySet();
        Iterator i = s.iterator();
        while(i.hasNext()){
            System.out.println("ülkelerin başkentleri: "+ i.next());
        }
        /*for(Object a:ulkeler.values()){
            System.out.println(a);
        }*/
        
        Collection c = ulkeler.values();
        Iterator ulke = c.iterator();
        while (ulke.hasNext()) {            
            System.out.println("-->" + ulke.next());
        }
        
       
    }
    
}
