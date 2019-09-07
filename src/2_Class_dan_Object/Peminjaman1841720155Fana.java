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
public class Peminjaman1841720155Fana {
    
    public int ID;
    public String NamaMember;
    public String NamaGame;
    public int Harga;
    
    public void tampilData(){
        System.out.println("ID          : "+ID);
        System.out.println("Nama Member : "+NamaMember);
        System.out.println("Nama Game   : "+NamaGame);
        System.out.println("Harga       : "+Harga);
    }
    
    public int LamaSewa(int Durasi){
        int Biaya =Durasi*Harga;
        return Biaya;
    }
}
