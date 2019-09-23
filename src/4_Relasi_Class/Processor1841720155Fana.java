/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.percobaan1;

/**
 *
 * @author ASUS
 */
public class Processor1841720155Fana {
    private String merk;
    private double cache;
    public Processor1841720155Fana(){
        
    }
    public Processor1841720155Fana(String merk, double cache){
        this.merk= merk;
        this.cache= cache;
        } 
    public void setMerk(String merk){
        this.merk=merk;
    }
    public void setCache(double cache){
        this.cache=cache;
    }
    public String getMerk(String merk){
        return merk;
    }
    public double getCache(){
        return cache;
    }  
    public void info(){
        System.out.println("Merk Processor = %s\n"+ merk);
        System.out.println("Cache Memory = %.2f\n" + cache);
    }
}
