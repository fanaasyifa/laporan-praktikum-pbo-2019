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
public class RamTugas1841720155Fana {
    private String merk;
    private double kecepatan; //GHz
    
    RamTugas1841720155Fana(String newmerk, double newkecepatan)
    {
        this.merk=newmerk;
        this.kecepatan=newkecepatan;
    }
    
    public void setMerk(String newmerk)
    {
        merk=newmerk;
    }
    
    public void setKecepatan(double newkecepatan)
    {
        kecepatan=newkecepatan;
    }
    
    public String getMerk()
    {
        return merk;
    }
    
    public double kecepatan()
    {
        return kecepatan;
    }
    
    public String cetakInfo()
    {
        String info = "";
        info+="Merk Ram: "+this.merk+"\n";
        info+="Kecepatan Ram: "+this.kecepatan+"Mhz"+"\n";
        
        return info;
    }
}