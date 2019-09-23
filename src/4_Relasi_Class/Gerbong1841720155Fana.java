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
public class Gerbong1841720155Fana {
    private String kode;
    private Kursi1841720155Fana[] arrayKursi;
    
    public Gerbong1841720155Fana(String kode,int jumlah){
        this.kode=kode;
        this.arrayKursi=new Kursi1841720155Fana[jumlah];
        this.initKursi();
    }
    private void initKursi(){
        for (int i = 0; i< arrayKursi.length; i++){
            this.arrayKursi[i]=new Kursi1841720155Fana (String.valueOf(i+1));
        }
    }
//    public void setKursi(Kursi[] kursi){
//        this.arrayKursi= arrayKursi;
//    }
    public void setKode(String kode){
        this.kode=kode;
    }
    
    public String getKode(){
        return kode;
    }
    
    public void setPenumpang(Penumpang18417201Fana penumpang, int nomor){ 
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    } 
    
    public Kursi1841720155Fana[] getArrayKursi(){
        return arrayKursi;
    }
    
    
    
    public String info(){
        String info = ""; 
        info += "Kode: " + kode + "\n"; 
        for (Kursi1841720155Fana kursi : arrayKursi){ 
            info += kursi.info(); 
        } return info;
    } 
    
    
    
}
