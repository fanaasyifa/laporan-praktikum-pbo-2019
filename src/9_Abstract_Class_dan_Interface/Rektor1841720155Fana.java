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
public class Rektor1841720155Fana {
    public void beriSertifikatCumlaude(ICumlaude1841720155Fana Mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri Anda..");
        
        Mahasiswa.lulusFana();
        Mahasiswa.meraihIPKTinggiFana();
        
        System.out.println("--------------------------------------------");
    }
    public void beriSertifikatMawapresFana(IBerprestasi1841720155Fana Mahasiswa1841720155Fana){
        System.out.println("Saya REKTOR,memberikan sertifikat MAWAPRES");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        
        Mahasiswa1841720155Fana.menjuaraiKompetisiFana();
        Mahasiswa1841720155Fana.membuatPublikasiIlmiahFana();
        
        System.out.println("---------------------------------------------");
    }
}
