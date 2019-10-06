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
public class PC1841720155Fana extends Komputer1841720155Fana {
    public int ukuranMonitor;
    
    public PC1841720155Fana(){
        
    }
    
    public PC1841720155Fana(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }
    public void tampilPC(){
        System.out.println("============PC============");
        super.tampilData();
        System.out.println("Ukuran Monitor        :"+ukuranMonitor+"inc");
    }
}
