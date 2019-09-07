/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;

/**
 *
 * @author ASUS
 */
public class TugasBarang1841720155Fana {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public int hitungHargaJual(){
        double hargaJual = hargaDasar - (diskon/100*hargaDasar);
        return (int)hargaJual;
    }
    
    public void tampilData(){
        System.out.println("Kode         : " +kode);
        System.out.println("Nama Barang  : " +namaBarang);
        System.out.println("Harga Dasar  : Rp." +hargaDasar);
        System.out.println("Diskon       : " +diskon+"%");
        System.out.println("Harga jual   : " +hitungHargaJual());
    }
}
