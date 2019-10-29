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
public class Sarjana1841720155Fana extends Mahasiswa1841720155Fana implements ICumlaude1841720155Fana{

    public Sarjana1841720155Fana(String nama) {
        super(nama);
    }

    
    @Override
    public void lulusFana() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");  
    }

    @Override
    public void meraihIPKTinggiFana() {
        System.out.println("IPK-ku lebih dari 3,51"); 
    }
    
}
