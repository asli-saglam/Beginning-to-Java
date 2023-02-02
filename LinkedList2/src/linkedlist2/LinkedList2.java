
package linkedlist2;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedList2 {
    
    public static void islemleri_bastir(){
        System.out.println("0- İşlemleri görüntüle");
        System.out.println("1- Bir sonraki şehre git");
        System.out.println("2- bir önceki şehre git");
        System.out.println("3- çıkış yap.");
        
    }
    public static void sehirleri_turla( LinkedList <String> sehirler){
        ListIterator <String> iterator = sehirler.listIterator();
        
       islemleri_bastir();
        int islem;
        
        Scanner scanner = new Scanner(System.in);
        if(!iterator.hasNext()){
            System.out.println("herhangi bir şehir bulunmuyor.");
        }
        
        boolean cikis = false;
        boolean ileri = true;
        while(!cikis){
            
            System.out.println("Bir işlem seçiniz:");
            
            islem = scanner.nextInt();
            switch(islem){
                case 0:
                    System.out.println("yapılacak işlemler:\n");
                    islemleri_bastir();
                    break;
                case 1:
                    if(!ileri){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        ileri = true;
                    }
                    if(iterator.hasNext()){
                        System.out.println("Bir sonraki şehre gidiliyor: "+ iterator.next());
                        
                    }
                    else{
                        System.out.println("Gidilecek şehir kalmadı");
                        ileri = true;
                    }
                    
                    break;
                case 2:
                    if(ileri){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri = false;
                    if(iterator.hasPrevious()){
                        System.out.println("Bir önceki şehre gidiliyor: "+ iterator.previous());
                    }
                    else{
                        System.out.println("başlangıç noktasındasınız.Lütfen ilerleyin.");
                    }
                    break;
                case 3:
                    cikis = true;
                    System.out.println("Çıkış yapılıyor.");
                    break;
                default:
                    break;
                }
            }
        }
        
    }

    
    public static void main(String[] args) {
        LinkedList <String> sehirler = new LinkedList<String>();
        
        sehirler.add("ordu");
        sehirler.add("samsun");
        sehirler.add("ankara");
        sehirleri_turla(sehirler);
        
    
    }
    
}
