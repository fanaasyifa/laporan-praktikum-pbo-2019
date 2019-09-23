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
public class LaptopTugas1841720155Fana {
    private String merk;
    private int harga; //rupiah
    private int berat; //kg
    private int layar; //inch
    private RamTugas1841720155Fana ram;
    private ProcessorTugas1841720155Fana processor;
    private HarddiskTugas1841720155Fana hdd;
    
    LaptopTugas1841720155Fana(String newmerk,int newharga,int newberat,int newlayar,RamTugas1841720155Fana newram, ProcessorTugas1841720155Fana newprocessor, HarddiskTugas1841720155Fana newhdd)
    {
        this.merk=newmerk;
        this.harga=newharga;
        this.berat=newberat;
        this.layar=newlayar;        
        this.ram=newram;
        this.processor=newprocessor;
        this.hdd=newhdd;
    }
    
    public void setMerk(String newmerk)
    {
        merk=newmerk;
    }
    
    public void setHarga(int newharga)
    {
        harga=newharga;
    }
    
    public void setBerat(int newberat)
    {
        berat=newberat;
    }
    
    public void setLayar(int newlayar)
    {
        layar=newlayar;
    }
    
    public String getMerk()
    {
        return merk;
    }
    
    public int getHarga()
    {
        return harga;
    }
    
    public int getBerat()
    {
        return berat;
    }
    
    public int getlayar()
    {
        return layar;
    }
    
    public String cetakInfo()
    {
        String info = "";
        info+="Merk Laptop: "+this.merk+"\n";
        info+="Berat Laptop: "+this.berat+" Kg"+"\n";
        info+="Layar Laptop: "+this.layar+" Inch"+"\n";
        info+="Harga Laptop: "+this.harga+" Rupiah"+"\n\n";
        info+="Processor:\n"+this.processor.cetakInfo()+"\n";
        info+="Ram:\n"+this.ram.cetakInfo()+"\n";
        info+="Harddisk:\n"+this.hdd.cetakInfo()+"\n";
        
        return info;
    }
}
