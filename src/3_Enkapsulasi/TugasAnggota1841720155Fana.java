/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;

/**
 *
 * @author ASUS
 */
public class TugasAnggota1841720155Fana {

     private String noKTP;
    private String nama;
    public int limit;
    public int pinjam;
   
    TugasAnggota1841720155Fana(String noKTP, String nama, int limit){
        this.noKTP = noKTP;
        this.nama = nama;
        this.limit = limit;
    }
    public void setKTP(String noKTP){
        this.noKTP= noKTP;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getnoKTP(){
        return noKTP;
    }
    public String getNama(){
        return nama;
    }
    public int getLimitPinjaman(){
        return limit;
    }
    public void pinjam(int pinjam){
        this.pinjam = pinjam;
        if(pinjam > limit){
            System.out.println("Maaf, jumlah pinjaman anda melebihi limit");
            this.pinjam = 0;
        }
    }
    
    public void angsur( int angsuran){
        double total = 0.2 *pinjam;
        
        if (angsuran >pinjam) {
            System.out.println("jumlah angsuran melebihi limit");
        }
        else if(angsuran<total){
            System.out.println("angsuran harus 10% dari jumlah pinjaman");
        }
        else{
            this.pinjam -= angsuran;
        }
    }
    
    public void angsuran(int angsuran){
        pinjam -= angsuran;
    }
    public int getminimalAngsuran(){
        int minangsur;
        minangsur = pinjam * 20 / 100;
        return minangsur;
    }
    public int getJumlahPinjam(){
        return pinjam;
    }
}