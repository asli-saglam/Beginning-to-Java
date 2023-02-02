
package has_tree_set;

import java.util.HashSet;
import java.util.TreeSet;

public class Has_Tree_set {
    public static void main(String[] args) {
        HashSet<String> liste = new HashSet<String>();
        liste.add("aslı");
        liste.add("onur");
        liste.add("duygu");
        liste.add("banu");
        liste.add("duygu");// SET LER TEKRARLANAN ELEMAMAN BULUNDURMAZ..
        
        System.out.println("listenin sırasız hali:");
        System.out.println(liste);
        System.out.println("------------");
        System.out.println("listenin sıralı hali:");
        TreeSet<String> sirali_kume = new TreeSet<String>(liste); // ALFABETİK SIRAYLA YAZDIRIR.//TEKRARLANAN ELEMANA İZİN VERMEZ.(
        System.out.println(sirali_kume);
    }
    
}
