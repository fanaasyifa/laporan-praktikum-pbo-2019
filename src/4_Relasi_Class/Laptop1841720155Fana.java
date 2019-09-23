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
public class Laptop1841720155Fana {
    private String merk;
    private Processor1841720155Fana proc;
    public Laptop1841720155Fana(){
}
    public Laptop1841720155Fana(String merk,Processor1841720155Fana proc){
        this.merk=merk;
        this.proc= proc;
    }
     public void setMerk(String merk){
        this.merk=merk;
    }
    public void setProc(Processor1841720155Fana proc){
        this.proc=proc;
    }
    public void info(){
        System.out.println("merk Laptop"+ merk);
        proc.info();
    }
}
