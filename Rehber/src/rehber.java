
import java.util.ArrayList;


public class rehber {
    private ArrayList<String> telefon_rehberi = new ArrayList<String>();
    
    
    public void kisileri_yazdir(){
        
        System.out.println("Rehberde "+ telefon_rehberi.size()+ "kişi var.\n");
        for(int i=0; i<telefon_rehberi.size(); i++){
            System.out.println(i + ". kişi:" + telefon_rehberi.get(i));
        }
        
    }
    
    public void kisi_ekle(String isim){
        telefon_rehberi.add(isim);
        System.out.println(isim +"\n" + "listeye eklendi.\n");
        
    }
    
    public void kisiyiGuncelle(int konum, String yeni_isim){
        telefon_rehberi.set(konum, yeni_isim);
        System.out.println("Kişi Güncellendi.\n");
    }
    
    
    public void KisiSilme(int sira){
        telefon_rehberi.remove(sira);
        System.out.println(sira +". sıradaki kişi silindi\n");
    }
    
    public void kisiBulma(String isim){
        int konum = telefon_rehberi.indexOf(isim);
        if(konum >= 0){
            System.out.println(isim + "isimli kisi "+ konum +".sırada.\n");
        }
        else{
            System.out.println("Rehberde böyle biri bulunamadı.\n");
        }
                
        
    }
            
    
}
