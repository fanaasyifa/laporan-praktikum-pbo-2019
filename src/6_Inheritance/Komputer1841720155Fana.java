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
public class Komputer1841720155Fana {
   public String merk,jnsProsesor;
    public int kecProsesor, sizeMemory;
    
   public Komputer1841720155Fana(){
       
   } 
   
   public Komputer1841720155Fana(String merk, int kecProsesor, int sizeMemory, String jnsProsesor){
       this.merk = merk;
       this.kecProsesor= kecProsesor;
       this.sizeMemory= sizeMemory;
       this.jnsProsesor= jnsProsesor;
       
   }
   
   public void tampilData(){
       System.out.println("Nama Merk            :"+merk);
       System.out.println("Kecepatan Prosesor   :"+kecProsesor+"Ghz");
       System.out.println("Ukuran Memory        :"+sizeMemory+"GB");
       System.out.println("Jenis Prosesor       :"+jnsProsesor);
   } 
}
