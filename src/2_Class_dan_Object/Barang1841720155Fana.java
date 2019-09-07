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
public class Barang1841720155Fana {
    public String namaBrg;
    public String jenisBrg;
    public int stock;
    
    public void tampilBarang(){
        System.out.println("Nama Barang :"+namaBrg);
        System.out.println("Jenis Barang :"+jenisBrg);
        System.out.println("Stock :"+stock);
    }
    //method dengan argumen dan nilai balik (return)
    public int tambahStock(int brgMasuk){
        int stockBaru=brgMasuk+stock;
        return stockBaru;
    }
}
