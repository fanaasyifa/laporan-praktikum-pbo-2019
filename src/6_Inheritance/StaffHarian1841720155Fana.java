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
public class StaffHarian1841720155Fana extends Staff1841720155Fana {
 public int jmlJamKerja;
    
    public StaffHarian1841720155Fana(){
    
    }
    public StaffHarian1841720155Fana(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, int jlmJamKerja){
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmlJamKerja=jmlJamKerja;
    }
    
    public void tampilStaffHarian(){
        System.out.println("===============Data Staff Harian===============");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja : "+jmlJamKerja);
        System.out.println("Gaji Bersih      : "+(gaji*jmlJamKerja+lembur-potongan));
    }    
}
