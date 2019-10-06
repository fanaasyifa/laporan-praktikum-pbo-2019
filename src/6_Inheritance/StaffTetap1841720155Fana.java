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
public class StaffTetap1841720155Fana extends Staff1841720155Fana {
    public String golongan;
    public int asuransi;
    
    public StaffTetap1841720155Fana(){
    
    }
    
    public StaffTetap1841720155Fana(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, String golongan, int asuransi){
        super(nama,alamat,jk,umur,gaji,potongan,lembur);
        this.golongan=golongan;
        this.asuransi=asuransi;
    }
    
    public void tampilDataStaffTetap(){
        System.out.println("===============Data Staff Tetap===============");
        super.tampilDataStaff();
        System.out.println("Golongan        : "+golongan);
        System.out.println("Jumlah Asuransi : "+asuransi);
        System.out.println("Gaji Bersih     : "+(gaji+lembur-potongan-asuransi));
    }
}
