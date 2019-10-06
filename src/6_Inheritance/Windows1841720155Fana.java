/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6;

/**
 *
 * @author ASUS
 */
public class Windows1841720155Fana extends Laptop1841720155Fana {
   public String fitur;
    
    public Windows1841720155Fana(){
        
    }
    
    public Windows1841720155Fana(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String fitur){
    super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
    this.fitur = fitur;
}
    
      public void tampilWindows(){
      System.out.println("============Windows============");
      super.tampilData();
      System.out.println("Fitur             :"+fitur);
       } 
}
