/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet7;

/**
 *
 * @author ASUS
 */
public class MainOverriding1841720155Fana {
    public static void main(String[] args) {
        Manusia1841720155Fana m = new Manusia1841720155Fana();
        Dosen1841720155Fana d   = new Dosen1841720155Fana();
        Mahasiswa1841720155Fana mhs = new Mahasiswa1841720155Fana();
        
        m.makan();
        m.bernafas();
        d.makan();
        d.lembur();
        mhs.makan();
        mhs.tidur();
    }
}
