/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.percobaan4;

/**
 *
 * @author ASUS
 */
public class Penumpang18417201Fana {
    private String ktp;
    private String nama;
    
    public Penumpang18417201Fana(String ktp,String nama){
       this.ktp=ktp;
       this.nama=nama;
    }
    
    public void setKtp(String ktp){
        this.ktp=ktp;
    }
    
    public String getKtp(){
        return ktp;
    }
    
    public void setNama(String Nama){
        this.nama=nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String info(){
        String info ="";
        info +="Ktp: "+ktp+"\n";
        info +="Nama: "+nama+"\n";
        return info;
    }
}
