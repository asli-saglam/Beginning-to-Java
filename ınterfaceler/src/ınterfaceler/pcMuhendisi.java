
package ınterfaceler;


public class pcMuhendisi implements Imuhendis {
    private boolean askerlik;
    private boolean adli_sicil;

    public pcMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void askerlik_durumu_sorgula() {
        if(askerlik){
            System.out.println("askerlik yapıldı.");
        }
        else{
            System.out.println("askerlik yapılmadı.");
        }
    }

    @Override
    public void adli_sicil_kaydi_sorgula() {
        if(adli_sicil){
            System.out.println("adli sicil kaydı var.");
        }
        else{
            System.out.println("sicil temiz değil.");
        }
        
    }

    @Override
    public String diploma_notu(double not) {
        
        return "ortalama : "+ not;
        
    }

    @Override
    public void is_tecrubesi(String[] array) {
        System.out.println("Bilgisayar mühendisi olarak şu şirketlerde çalıştım:");
        for(String i :array){
            System.out.println(i);
        }
        
    }
    
}
