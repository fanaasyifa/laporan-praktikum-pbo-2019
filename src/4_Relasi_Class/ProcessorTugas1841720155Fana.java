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
public class ProcessorTugas1841720155Fana {
    private String merk;
    private int core; //Cores
    private double kecepatan; //GHz
    
    ProcessorTugas1841720155Fana(String newmerk,int newcore, double newkecepatan)
    {
        this.merk=newmerk;
        this.core=newcore;
        this.kecepatan=newkecepatan;
    }
    
    public void setMerk(String newmerk)
    {
        merk=newmerk;
    }
    
    public void setCore(int newcore)
    {
        core=newcore;
    }
    
    public void setKecepatan(double newkecepatan)
    {
        kecepatan=newkecepatan;
    }
    
    public String getMerk()
    {
        return merk;
    }
    
    public int getcore()
    {
        return core;
    }
    
    public double getkecepatan()
    {
        return kecepatan;
    }
    
    public String cetakInfo()
    {
        String info = "";
        info+="Merk Processor: "+this.merk+"\n";
        info+="Jumlah Core: "+this.core+" Cores\n";
        info+="Kecepatan Processor: "+this.kecepatan+" GHz\n";
        
        return info;
    }
}
