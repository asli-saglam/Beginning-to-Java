
package refaranslar;


public class Refaranslar {

    
    public static void main(String[] args) {
      
        Account account1 = new Account("aslı","ncdjcks@gmail.com","45677");
        Account account2 = account1;
        Account account3 = new Account();
        
        if(account1 == account2){
            System.out.println("Aynı objeyi gösteriyolar..");
        }
        else{
            System.out.println("aynı obje göstermiyor..");
        }
        
    }
    
}
