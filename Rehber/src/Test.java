import java.util.Scanner;
public class Test {

public class Rehber {
    private static rehber telefon_rehberi = new rehber();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void islemleri_bastir(){
        System.out.println("0 - işlemleri görüntüle");
        System.out.println("1 - rehberi görüntüle");
        System.out.println("2 - kişiyi bul");
        System.out.println("3 - kişi ekle");
        System.out.println("4 - kişiyi güncelle");
        System.out.println("5 - kişi sil");
        System.out.println("6 - çıkış");
       
    }
    public static void rehberi_goruntule(){
        telefon_rehberi.kisileri_yazdir();
                
    }
    public static void kisiyi_bul(){
        System.out.println("Bulmak istediğiniz kişinin ismini giriniz");
        String kisi = scanner.nextLine();
        telefon_rehberi.kisiBulma(kisi);
        
    }
    public static void kisi_ekle(){
        System.out.println("Eklemek istediğiniz kişinin adını giriniz.");
        String isim = scanner.nextLine();
        telefon_rehberi.kisi_ekle(isim);
    }
    public static void kisiyi_guncelle(){
        System.out.println("Güncellemek istediğiniz kişinin sırasını giriniz..");
        int sira = scanner.nextInt();
        scanner.nextLine();
        
        String yeni_isim = scanner.nextLine();
        telefon_rehberi.kisiyiGuncelle(sira-1 ,yeni_isim);
        System.out.println("Kişi güncellendi.");
    }
    public static void kisiyi_sil(){
        System.out.println("silmek istediğiniz sırayı giriniz");
        int sira = scanner.nextInt();
        scanner.nextLine();
        telefon_rehberi.KisiSilme(sira-1);
        
    }
    
    public static void main(String[] args) {
        System.out.println("rehbere hoşgeldiniz..\n");
        islemleri_bastir();
        
        int islem;
        boolean cikis = false;
        while(!cikis){
            System.out.println("Bir işlem seçiniz.");
            islem = scanner.nextInt();
            
            scanner.nextLine();
            
            switch(islem){
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    rehberi_goruntule();
                    break;
                    
                case 2:
                    kisiyi_bul();
                    break;
                case 3:
                    kisi_ekle();
                    break;
                case 4:
                    kisiyi_guncelle();
                    break;
                case 5:
                    kisiyi_sil();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Rehberden çıkılıyor..\n");
                    
                    break;
               
            }
                
        }
    }
}

}
        
        
        
    
    

