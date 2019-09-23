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
public class Pelanggan1841720155Fana {
    private String nama;
    private Mobil1841720155Fana mobil;
    private Sopir1841720155Fana sopir;
    private int hari;
    public Pelanggan1841720155Fana(){
        
    }
    public String getNama(){
        return nama;
    }
    public Mobil1841720155Fana getMobil(){
        return mobil;
    }
    public Sopir1841720155Fana getSopir(){
        return sopir;
    }
    public int getHari(){
        return hari;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setMobil(Mobil1841720155Fana mobil){
        this.mobil=mobil;
    }
    public void setSopir(Sopir1841720155Fana sopir ){
        this.sopir=sopir;
    }
    public void setHari(int hari){
        this.hari=hari;
    }
    public int hitungBiayaTatal(){
        return mobil.hitungBiayaMobil(hari)+sopir.hitungBiayaSopir(hari);
    }
}
  