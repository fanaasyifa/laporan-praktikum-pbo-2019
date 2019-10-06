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
public class MainPer6Fana1841720155 {
    public static void main(String[] args) {
        StaffTetap1841720155Fana ST = new StaffTetap1841720155Fana("Budi", "Malang", "Laki-laki",20, 2000000, 250000, 200000, "A2", 100000);
        ST.tampilDataStaffTetap();
        
        StaffHarian1841720155Fana SH = new StaffHarian1841720155Fana("Indah", "Malang", "Perempuan", 27, 10000, 100000, 50000,100);
        SH.tampilStaffHarian();
    }
}
