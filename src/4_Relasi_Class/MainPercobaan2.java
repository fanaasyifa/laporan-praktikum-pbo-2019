/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.percobaan2;

/**
 *
 * @author ASUS
 */
public class MainPercobaan2 {
    public static void main(String[] args){
        Mobil1841720155Fana m = new Mobil1841720155Fana();
        m.setMerk("Avanza");
        Sopir1841720155Fana s = new Sopir1841720155Fana();
        s.setNamaTipe("John Doe");
        s.setBiaya(200000);
        Pelanggan1841720155Fana p= new Pelanggan1841720155Fana();
        p.setNama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Biaya Total="+ p.hitungBiayaTatal());
    }
    
}
