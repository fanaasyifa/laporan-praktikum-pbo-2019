/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.tugas;

/**
 *
 * @author ASUS
 */
public class HarddiskTugas1841720155Fana {
    private String merk;
    private int kapasitas; //Gb
    
    HarddiskTugas1841720155Fana(String newmerk,int newkapasitas)
    {
        this.merk=newmerk;
        this.kapasitas=newkapasitas;
    }
    
    public void setMerk(String newmerk)
    {
        merk=newmerk;
    }
    
    public void setKapasitas(int newkapasitas)
    {
        kapasitas=newkapasitas;
    }
    
    public String getMerk()
    {
        return merk;
    }
    
    public int getKapasitas()
    {
        return kapasitas;
    }
    
    public String cetakInfo()
    {
        String info = "";
        info+="Merk Harddisk: "+this.merk+"\n";
        info+="Kapasitas Harddisk: "+this.kapasitas+" Gb\n";
        
        return info;
    }
}
