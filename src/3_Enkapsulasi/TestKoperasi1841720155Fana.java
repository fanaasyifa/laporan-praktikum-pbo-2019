/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class TestKoperasi1841720155Fana {

    public static void main(String[] args) {
        int newpinjam, newangsuran;
        Scanner sc=new Scanner(System.in);
        TugasAnggota1841720155Fana fana = new TugasAnggota1841720155Fana("111333444", "Fana",
                5000000);
        System.out.println("Nama Anggota : " +fana.getNama());
        System.out.println("Limit Pinjaman : " +fana.getLimitPinjaman());
        do{
            System.out.print("\nJumlah Pinjaman : ");
            newpinjam = sc.nextInt();
            fana.pinjam(newpinjam);
        }while(newpinjam > fana.limit);
        
        System.out.print("Jumlah pinjaman saat ini : " +fana.getJumlahPinjam());
        System.out.println();
    
        do{
            do{
                System.out.print("\nMembayar angsuran sebesar : ");
                newangsuran = sc.nextInt();
                fana.angsuran(newangsuran);
            }while(newangsuran < fana.getminimalAngsuran());
            System.out.print("Jumlah pinjaman saat ini : "+fana.getJumlahPinjam());
            System.out.println();
        }while(fana.getJumlahPinjam() != 0);
    }
}
