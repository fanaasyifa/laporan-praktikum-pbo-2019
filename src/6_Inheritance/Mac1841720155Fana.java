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
public class Mac1841720155Fana extends Laptop1841720155Fana {
    public String security;
       
       public Mac1841720155Fana(){
           
       }
       
       public Mac1841720155Fana(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String security){
          super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
          this.security = security;
       }
       
       public void tampilMac(){
        System.out.println("============MAC============");
        super.tampilData();
        System.out.println("Security         :"+security);
       }
}
