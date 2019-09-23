/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.percobaan2;

/**
 *
 * @author ASUS
 */
public class Mobil1841720155Fana {
    private String merk;
    private int biaya;
    public Mobil1841720155Fana(){
        
    }
    
    public void setMerk(String merk){
        this.merk=merk;
    }
    public void setBiaya(int biaya){
        this.biaya=biaya;
    }
    public String getMerk(){
        return merk;
    }
    public int getBiaya(){
        return biaya;
    }
    public int hitungBiayaMobil(int hari){
        return biaya*hari;
    }
}
