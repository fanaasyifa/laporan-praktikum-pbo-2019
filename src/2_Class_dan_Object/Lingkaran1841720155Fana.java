/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;

/**
 *
 * @author ASUS
 */
public class Lingkaran1841720155Fana {
    public double phi;
    public double r;
    
    public double hitungLuas(){
        return phi*r*r;
    }
    
    public double hitungKeliling(){
        return 2*phi*r;
    }
    
    public void tampilInfo(){
        System.out.println("R        : "+r);
        System.out.println("Luas     : "+hitungLuas());
        System.out.println("Keliling : "+hitungKeliling());
    }
}