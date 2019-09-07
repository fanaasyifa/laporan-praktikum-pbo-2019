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
public class TestPeminjaman1841720155Fana {
      public static void main (String args[]){
        Peminjaman1841720155Fana p1 = new Peminjaman1841720155Fana();
        p1.ID=123;
        p1.NamaMember="Gideon";
        p1.NamaGame="Pro Evolution Soccer 2019";
        p1.Harga=100000;
        p1.tampilData();
        System.out.println("Harga yang harus dibayar adalah : "+p1.LamaSewa(2));
    }
}