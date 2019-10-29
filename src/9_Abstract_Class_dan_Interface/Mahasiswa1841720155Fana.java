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
public class Mahasiswa1841720155Fana implements ICumlaude1841720155Fana{
    protected String nama;

    public Mahasiswa1841720155Fana(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void lulusFana() {
        System.out.println("BISMILLAH TERBAIK"); 
    }

    @Override
    public void meraihIPKTinggiFana() {
        System.out.println("LEBIH DARI 3,5"); 
    }
    
    public void kuliahDikampusFana(){
        System.out.println("Aku mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }
}
