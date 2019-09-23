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
public class Sopir1841720155Fana {
    private String  namatipe;
    private int biaya;
    public Sopir1841720155Fana(){
    }
    
    public int hitungBiayaSopir(int hari){
        return biaya*hari;
    }
    public void setNamaTipe(String namatipe){
        this.namatipe=namatipe;
    }
    public void setBiaya(int biaya){
        this.biaya=biaya;
    }
    public String getNamaTipe(){
        return namatipe;
    }
    public int getBiaya(){
        return biaya;
    }
}
