/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet9.abstractclass;

/**
 *
 * @author ASUS
 */
public class Orang1841720155Fana {
   private String nama;
   private Hewan1841720155Fana hewanPeliharaan;
   
   public Orang1841720155Fana(String nama){
       this.nama = nama;
   }
   public void peliharaanHewan(Hewan1841720155Fana hewanPeliharaan){
       this.hewanPeliharaan = hewanPeliharaan;
   }
   public void ajakPeliharaanJalanJalan(){
       System.out.println("Namaku " + this.nama);
       System.out.println("Hewan peliharaanku berjalan dengan cara: ");
       this.hewanPeliharaan.bergerak();
       System.out.println("---------------------------------------------");
   }
}
