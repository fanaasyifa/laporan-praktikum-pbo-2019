/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet9.abstractclass;

/**
 *
 * @author ASUS
 */
public class Program1841720155Fana {
    public static void main(String[] args){
        Kucing1841720155Fana kucingKampung = new Kucing1841720155Fana();
        Ikan1841720155Fana lumbaLumba = new Ikan1841720155Fana();
        
        Orang1841720155Fana ani = new Orang1841720155Fana("Ani");
        Orang1841720155Fana budi = new Orang1841720155Fana ("Budi");
        
        ani.peliharaanHewan(kucingKampung);
        budi.peliharaanHewan(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalan();
        budi.ajakPeliharaanJalanJalan();
    }
}




