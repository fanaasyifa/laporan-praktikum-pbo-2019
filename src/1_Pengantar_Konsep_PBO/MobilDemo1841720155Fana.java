/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet1;

/**
 *
 * @author ASUS
 */
public class MobilDemo1841720155Fana {
     public static void main(String[] args)
    {
        //buat dua buah objek sepeda
        Mobil1841720155Fana mb1 = new Mobil1841720155Fana ();
        Mobil1841720155Fana mb2 = new MobilJeep1841720155Fana();
        Mobil1841720155Fana mb3 = new MobilSport1841720155Fana();
        
        //Panggil method didalam objek sepeda
        mb1.setMerek("Daihatsu");
        mb1.Tipe("Luxio");
        mb1.Warna("Putih");
        mb1.Harga(160000000);
        mb1.HargaService(10000000);
        mb1.cetak();
                
        mb2.setMerek("Suzuki");
        mb2.Tipe("jimny");
        mb2.Warna("hijau");
        mb2.Harga(300000000);
        mb2.HargaService(20000000);
        mb2.cetak();
        
        mb3.setMerek("Mazda");
        mb3.Tipe("MX-5Skyactiv");
        mb3.Warna("Merah");
        mb3.Harga(800000000);
        mb3.HargaService(500000000);
        mb3.cetak();
        
    }
}
