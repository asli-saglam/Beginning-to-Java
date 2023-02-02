package com.mycompany.ogrencilistesi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class OgrenciListesi {

    public static void main(String[] args) {
        
       Student ogrenci1 = new Student();
       Student ogrenci2 = new Student();
       Student ogrenci3= new Student();
       
       ogrenci1.isim ="onur";
       ogrenci1.soyisim = "gonullu";
       ogrenci1.yas = 21;
       ogrenci1.ogrenciNo = 498;
       
       ogrenci2.isim ="aslı";
       ogrenci2.soyisim = "sağlam";
       ogrenci2.yas = 20;
       ogrenci2.ogrenciNo = 55555;
       
       ogrenci3.isim ="duygu";
       ogrenci3.soyisim = "gaya";
       ogrenci3.yas = 22;
       ogrenci3.ogrenciNo = 4567;
       
        HashMap<Integer,Student > liste = new HashMap<>();
        
        liste.put(ogrenci3.ogrenciNo,ogrenci3);
        liste.put(ogrenci2.ogrenciNo,ogrenci2);
        liste.put(ogrenci1.ogrenciNo,ogrenci1);
        
        Set s = liste.entrySet();
        Iterator i = s.iterator();
            
        while (i.hasNext()){
            Map.Entry entry = (Map.Entry) i.next();
                    
            Student value = (Student) entry.getValue();
            
            System.out.println(entry.getKey() +" =" +value.isim);
            
        }
        
        
        /*
        for (Map.Entry<Integer, Student> entry : liste.entrySet()) {
            Integer key = entry.getKey();
            Student value = entry.getValue();
            
            System.out.println("anahtar: " + key+ " ->"+ value.isim +" "+ value.soyisim +" "+ value.yas+ " " + value.ogrenciNo);
            
        }*/
       
       
       
       
       
       
       
  
        
    }
}
