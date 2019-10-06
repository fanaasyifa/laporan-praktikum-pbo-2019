/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6;

/**
 *
 * @author ASUS
 */
public class Manager1841720155Fana extends Karyawan1841720155Fana{
     public int tunjangan;
    
    public Manager1841720155Fana(){
    
    }
    
    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan     : "+tunjangan);
        System.out.println("Total gaji    : "+(super.gaji+tunjangan));
    }
}
