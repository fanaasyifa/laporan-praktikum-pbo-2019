/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet1;

/**
 *
 * @author ASUS
 */
public class MobilSport1841720155Fana extends Mobil1841720155Fana {
    private String Kapasitas;
    
    public void Kapasitas (String newValue)
    {
        Kapasitas = newValue;
    }
    public void cetak()
    {
        super.cetak();
        System.out.println("Kapasitas Penumpang: "+ Kapasitas);
    }
}