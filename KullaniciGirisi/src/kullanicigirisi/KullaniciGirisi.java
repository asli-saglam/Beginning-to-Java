/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kullanicigirisi;

import java.util.Scanner;

/**
 *
 * @author ASLI
 */
public class KullaniciGirisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int girisHakki = 3;
        
        System.out.println("****************");
        System.out.println("Giriş Sayfasına Hoşgeldiniz..");
        System.out.println("****************");
        
        String sys_kullanici_adi = "Aslı Saglam";
        String sys_parola = "45678";
        
        while(true){
            System.out.println("Kullanıcı adınızı giriniz:");
            String kullanici = scanner.nextLine();
            System.out.println("Parolanızı Giriniz:");
            String parola = scanner.nextLine();
            
            if(kullanici.equals(sys_kullanici_adi)&& parola.equals(sys_parola)){
                System.out.println("Giriş Başarılı");
                break;
            }
            else if(kullanici.equals(sys_kullanici_adi)&& !parola.equals(sys_parola)){
                System.out.println("Parola hatalı\nTekrar deneyiniz..");
                girisHakki -=1;
                System.out.println("Kalan Giriş Hakkı:"+ girisHakki);
            }
            else if(!kullanici.equals(sys_kullanici_adi)&& parola.equals(sys_parola)){
                System.out.println("Kullanıcı adı hatalı\nTekrar deneyiniz..");
                girisHakki -=1;
                System.out.println("Kalan Giriş Hakkı:"+ girisHakki);
            }
            else{
                System.out.println("Kullanıcı adı ve parola yanlış!");
                girisHakki -=1;
            }
            if(girisHakki ==0){
                System.out.println("Giriş Hakkınız Bitti..");
                break;
            }
        }
        
        
        
    }
    
}
