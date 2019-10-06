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
public class MainTugas1841720155Fana {
  public static void main(String[] args) {
        
        PC1841720155Fana p = new PC1841720155Fana();
        p.merk = "ASUS";
        p.jnsProsesor = "INTEL";
        p.sizeMemory = 800;
        p.kecProsesor = 30;
        p.ukuranMonitor = 15;
        p.tampilPC();
        
        Mac1841720155Fana m = new Mac1841720155Fana();
        m.merk ="MacbookPro";
        m.jnsProsesor ="Intel i5";
        m.sizeMemory = 900;
        m.kecProsesor = 25;
        m.jnsBaterai = "Alkaline";
        m.security = "Norton";
        m.tampilMac();
                
       Windows1841720155Fana w = new Windows1841720155Fana();
       w.merk = "ACER";
       w.jnsProsesor = "INTEL i7";
       w.sizeMemory = 1200;
       w.kecProsesor = 25;
       w.fitur       = "VR support";
       w.tampilWindows();
    }    
}
