/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet7;

/**
 *
 * @author ASUS
 */
public class Manager1841720155Fana extends Karyawan1841720155Fana {

    private double tunjangan;
    private String bagian;
    private Staff1841720155Fana st[];

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public void setStaff(Staff1841720155Fana[] st) {
        this.st = st;
    }

    public void viewStaff() {
        int i;
        System.out.println("---------------------------");
        for (i = 0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("-------------------------------");
    }

    public void lihatInfo() {
        System.out.println("Manager :" + this.getBagian());
        System.out.println("NIP :" + this.getNip());
        System.out.println("Nama :" + this.getNama());
        System.out.println("Golongan :" + this.getGolongan());
        System.out.println("Tunjangan :" + this.getTunjangan());
        System.out.println("Gaji :" + this.getGaji());
        System.out.println("Bgian :" + this.getBagian());
        this.viewStaff();
    }

    public double getGaji() {
        return super.getGaji() + tunjangan;
    }
}
