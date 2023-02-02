
package constructor1;


public class Test {
    public static void main(String[] args) {
        Account aslininhesap = new Account("5476329", 500, "aslı", "cdjncsfjk@gmail.com", "056787899");
        
        
        aslininhesap.setBakiye(5000);
        //account2.paraYatirma(600);
        aslininhesap.paracekme(2000);
        
        aslininhesap.getBakiye();
        
    }
    
}
