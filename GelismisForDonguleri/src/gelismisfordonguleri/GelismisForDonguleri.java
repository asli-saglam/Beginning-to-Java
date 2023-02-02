
package gelismisfordonguleri;


public class GelismisForDonguleri {
    
    public static void main(String[] args) {
        int a [] = {3,5,7};
       /* 
        for(int i : a){
            System.out.println(i);
       
        }*/
       
       int sum1 = 0 , sum2 = 0;
        System.out.println("for dongusu ciktisi:");
        
        for(int i = 0; i<a.length; i++){
            sum1 += a[i];
            System.out.println("toplam:"+sum1);
            
            
        }
        System.out.println("ozellesmis for dongusu ciktisi:");
            for(int i : a){
                sum2 += i;
                System.out.println("toplam: "+sum2);
            }
       
    }
    
}
