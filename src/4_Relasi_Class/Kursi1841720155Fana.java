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
public class Kursi1841720155Fana {
    private String nomor;
    private Penumpang18417201Fana penumpang;
    
    public Kursi1841720155Fana (String nomor){
        this.nomor=nomor;
    }
    
    public void setNomor(String nomor){
        this.nomor=nomor;
    }
    
    public String getNomor(){
        return nomor;
    }
    public void setPenumpang(Penumpang18417201Fana penumpang){
        this.penumpang=penumpang;
    }
    
    public Penumpang18417201Fana getPenumpang(){
        return penumpang;
    }
    public String info(){
        String info="";
        info +="Nomer : "+nomor+"\n";
        if (this.penumpang!=null){
            info +="Penumpang : \n"+penumpang.info()+"\n";
        }
        return info;
    }
}