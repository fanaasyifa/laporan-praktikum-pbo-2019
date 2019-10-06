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
public class Laptop1841720155Fana extends Komputer1841720155Fana {
    public String jnsBaterai;
    
    public Laptop1841720155Fana(){
        
    }
    
    public Laptop1841720155Fana(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBaterai = jnsBaterai;
    }
    
       public void tampilLaptop(){
        System.out.println("============LAPTOP============");
        super.tampilData();
        System.out.println("Jenis Baterai         :"+jnsBaterai);
       }
}
