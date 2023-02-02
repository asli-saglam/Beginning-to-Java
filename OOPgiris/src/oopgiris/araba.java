
package oopgiris;

/**
 *
 * @author ASLI
 */
public class araba {
    
    private String renk = "imsiztan";
    private String model = "reno";
    private int kapilar;
    private int tekerlek;
    private String motor;


    
   
    
    
    
    public void setModel(String model){
        this.model = model;
    }
    
    public String getModel(){
        return this.model;
    }

    /**
     * @return the renk
     */
    public String getRenk() {
        System.out.println(this.renk);
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the kapilar
     */
    public int getKapilar() {
        return kapilar;
    }

    /**
     * @param kapilar the kapilar to set
     */
    public void setKapilar(int kapilar) {
        if(kapilar <0 ){
            System.out.println("kapı sayısı 0'dan küçük olamaz");
        }
        else{
            this.kapilar = kapilar;
        }
    }

    
    public int getTekerlek() {
        return tekerlek;
    }

    /**
     * @param tekerlek the tekerlek to set
     */
    public void setTekerlek(int tekerlek) {
        this.tekerlek = tekerlek;
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }
}

