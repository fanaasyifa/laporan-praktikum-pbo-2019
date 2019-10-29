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
public class Pascasarjana2_1841720155Fana extends Mahasiswa1841720155Fana implements ICumlaude1841720155Fana,IBerprestasi1841720155Fana{
    public Pascasarjana2_1841720155Fana(String nama) {
        super(nama);
    }
    
    @Override
    public void menjuaraiKompetisiFana() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }
    @Override
    public void membuatPublikasiIlmiahFana() {
        System.out.println("Saya telah menerbitkan artikel di jurnal INTERNASIONAL");
    } 

    @Override
    public void lulusFana() {
        super.lulusFana(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void meraihIPKTinggiFana() {
        super.meraihIPKTinggiFana();//To change body of generated methods, choose Tools | Templates.
    }   
}