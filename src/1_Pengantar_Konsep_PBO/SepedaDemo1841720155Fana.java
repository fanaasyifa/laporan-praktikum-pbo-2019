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
public class SepedaDemo1841720155Fana {
    public static void main(String[] args)
    {
        //buat dua buah objek sepeda
        Sepeda1841720155Fana spd1 = new Sepeda1841720155Fana ();
        Sepeda1841720155Fana spd2 = new Sepeda1841720155Fana();
        SepedaGunung1841720155Fana spd3 = new SepedaGunung1841720155Fana();

        //Panggil method didalam objek sepeda
        spd1.setMerek("Polygone");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();
        
        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();
        
        spd3.setMerek("Klinee");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setTipeSuspensi("Gas Suspension");
        spd3.cetakStatus();
    }
}
