package hashmapentry;

import java.util.*;

public class HashMapEntry {
    public static void main(String[] args) {
        /*HashMap<Integer, String> map = new HashMap<Integer, String>();
        
        map.put(1, "çicek");
        map.put(54, "pc");
        map.put(76, "silgi");
        map.put(9, "kalem");
        System.out.println(map);// DİSPİLAYİNG THE HASHMAP
        
        
        Set s =map.entrySet();// enrtrySet map in anahtar-değer çiftini verir.
        
        System.out.println(s);
        System.out.println("-------------------------");
        
        Iterator it = s.iterator();
        while (it.hasNext()) {
            HashMap.Entry urunler =(HashMap.Entry) it.next();
            int key = (Integer) urunler.getKey();
            String value = (String) urunler.getValue();
            System.out.println("anahtar->"+ key+ " değeri-> "+ value);
        }*/
        
        
        Map<String, String> bilgiler = new TreeMap<>();
        
        bilgiler.put("21060654", "Aslı");
        bilgiler.put("21060665", "zeynep");
        bilgiler.put("21060645", "şura");
        bilgiler.put("21060609", "onur");
        
        Set s = bilgiler.entrySet(); // set e atadıklarımı key value şeklinde
        Iterator i = s.iterator();
        while (i.hasNext()) {            
           Map.Entry no =(Map.Entry) i.next();// tekrar map şekline dönüştüp sırdaki key value yi map e atamak
            System.out.println(no.getKey()+ ": " + no.getValue());// getkey getValue mapenrty nin bi fonksiyonu.
            //TreeMap olduğu için keyleri sıralayarak yazdırdı (küçükten büyüğe)
        }
    }
    
}
