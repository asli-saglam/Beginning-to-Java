package vectortest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class VectorTest {
    
    public static void main(String[] args) {
        
        Vector <String> isim = new Vector <String>(); // vektörün parametresine boyut atanmadığı için boyu 10 kabul edilir.
        String ilkDizi [] = {"aslı","onur","şura","duygu","zeynep","beyza","ilayda"};// İSİMLERİ VEKTÖRE EKLE..
        
        System.out.println("Vektor boyutu: "+ isim.capacity());// vektörün parametresine boyut atanmadığı için boyu 10 kabul edilir.
        System.out.println("Vektörün eleman sayısı: " + isim.size());
        System.out.println("---------------------");
        System.out.println("vektörün elemanları:");
        for(String i : ilkDizi){
            isim.add(i);
            System.out.println(i);
        }
        System.out.println("Vektörün eleman sayısı: " + isim.size());
        System.out.println("Vektor boyutu: "+ isim.capacity());
        
        isim.set(3, "oğuzhan");// 3. index i oğuzhan ile değiştirdi.
        System.out.println(isim);
        isim.add("nazlı");
        isim.add("gamze");
        isim.add("ada");
        isim.add("atakan");
        isim.add("sıla");
        System.out.println("Vektor boyutu: "+ isim.capacity());
        System.out.println("Vektörün eleman sayısı: " + isim.size());
        System.out.println("vektörün ilk elemanı : "+ isim.firstElement());
        System.out.println("vektörün son elemanı :" + isim.lastElement());
        System.out.println("vektör elemanları: "+isim);
                
        System.out.println("_____________________________________________________");
        
        Vector <Integer> sayilar = new Vector<Integer>();
        
        sayilar.add(600);
        sayilar.add(6);
        sayilar.add(579);
        sayilar.add(10);
        sayilar.add(200);
        sayilar.add(345);
        
        Object [] dizi = sayilar.toArray();// VEKTÖR DİZİYE DÖNÜŞTÜRÜLDÜ.
        for( int i :sayilar){
            System.out.println(i);
        }
        Arrays.sort(dizi);//DİZİ ELEMANLARI SIRALANDI.
        System.out.println("Dizinin en küçük elemanı: "+ dizi[0]);
        ArrayList<String> Ad = new ArrayList<String>();
        Ad.add("Ahmet");
        Ad.add("Ali");
        Ad.add("Bade");
        Ad.add("Ceyda");
        Ad.add( 1, "Vedat");//Araya isim ekle
        System.out.println(Ad);
        
        
    }
    
}
