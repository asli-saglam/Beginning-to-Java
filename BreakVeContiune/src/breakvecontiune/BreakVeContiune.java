/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package breakvecontiune;

/**
 *
 * @author ASLI
 */
public class BreakVeContiune {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int i = 0;
        while(i <= 20){
            if(i == 10){
                break;
            }
            System.out.println("i:" + i);
            i++;
        }*/
        
        for(int i = 0; i <10; i++){
            if(i == 3 || i== 6){
                continue; // bu koşullar sağladndığında aşağıdaki sout u çalıştırma
            }
            System.out.println("i: "+ i);
            
        }

    }
    
}
