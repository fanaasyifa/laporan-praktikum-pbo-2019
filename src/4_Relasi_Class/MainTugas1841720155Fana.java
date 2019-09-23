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
public class MainTugas1841720155Fana {
    public static void main(String[] args) {
      ProcessorTugas1841720155Fana proc1=new ProcessorTugas1841720155Fana("AMD Ryzen™ 5 2600 Processor", 4, 3.6);
        RamTugas1841720155Fana ram1=new RamTugas1841720155Fana("CORSAIR VENGEANCE LPX",2666);
        HarddiskTugas1841720155Fana hdd1=new HarddiskTugas1841720155Fana("SAMSUNG 850",500);
        LaptopTugas1841720155Fana laptop1= new LaptopTugas1841720155Fana("Axioo yoo",15000000,3,15,ram1,proc1,hdd1);
        
        System.out.println(laptop1.cetakInfo());
    }
}
