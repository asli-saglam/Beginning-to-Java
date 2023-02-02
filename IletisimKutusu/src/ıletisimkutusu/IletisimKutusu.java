
package ıletisimkutusu;

import javax.swing.JOptionPane;

public class IletisimKutusu {

  
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Programa hosgeldiniz");
        
       // String isim = JOptionPane.showInputDialog(null,"adınız:", "giris paneli",3);
        int gun;
        gun = Integer.parseInt(JOptionPane.showInputDialog(null,"gün sayısını giriniz", "giriş",1));
        
        int saat;
        long dk;
        saat = gun*24;
        dk = saat* 60;
        
        JOptionPane.showMessageDialog(null,"saat:" + saat +"\ndakika:" + dk, "SONUC", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
        
       
        
    }
    
}
