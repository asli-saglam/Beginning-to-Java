
package dizilerudemy;

public class DizilerUdemy {
    public static void array_bastir(int array[]) {
        int i;
        for(i= 0; i<array.length; i++){
            System.out.println("elaman " + (i+1)+ " = " + array[i]);
        }
        
    }
    public static double ortalamabul(int array[]){
        
        int toplam = 0;
        int i;
        for(i= 0; i<array.length ; i++){
            toplam += array[i];
        }
        
    
        return ((double)toplam / array.length);
        
    }

    

   
    
    public static void main(String[] args) {
        
       /* int i;
         int a[] = new int[6];
         
         Scanner scanner = new Scanner(System.in);
         System.out.println("diziye eklemek isteginiz sayıları giriniz..\n");
         for(i= 0; i<6; i++){
              a[i] = scanner.nextInt();
              
              
          }
         for(i = 0; i <6 ; i++){
         System.out.println("dizinin" + i+". elemani:\n" + a[i]);
         }
        System.out.println("dizinin boyu:" + a.length);*/
       
       
       int b[] = {4,6,3,90,56};
        array_bastir(b);
        System.out.println("elemanlarin ortalamasi: " + ortalamabul(b));
        
        deneme [] array3 = {new deneme("asli"),new deneme("onur"),new deneme("duygu")};
        for (deneme a :array3){
            a.yaz();
        }
    }
    
         
         
    }
