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
public class TestBarang1841720155Fana {
    public static void main (String args []){
        Barang1841720155Fana brg1=new Barang1841720155Fana();
        brg1.namaBrg="Pensil";
        brg1.jenisBrg="ATK";
        brg1.stock=10;
        brg1.tampilBarang();
        //menampilkan dan mengisi argumen untuk menambahkan stock barang
        System.out.println("Stock Baru adalah "+brg1.tambahStock(20));
    }
}
