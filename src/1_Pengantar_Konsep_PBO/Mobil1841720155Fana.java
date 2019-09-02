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
public class Mobil1841720155Fana {
    private String Merek;
    private String Tipe;
    private String Warna;
    private int Harga;
    private int HargaService;
    
    public void setMerek(String newValue)
    {
        Merek = newValue;
    }
    
    public void Tipe(String newValue)
    {
        Tipe = newValue;
    }
    public void Warna(String newValue)
    {
        Warna = newValue;
    }
    public void Harga (int uang)
    {
        Harga = uang;
    }
    public void HargaService (int UangService)
    {
        Harga = Harga - UangService;
    }
    public void cetak()
    {
        System.out.println("Merek: " + Merek);
        System.out.println("Tipe: " + Tipe);
        System.out.println("Warna: " + Warna);
        System.out.println("Harga: Rp. " +Harga );
    }
}  