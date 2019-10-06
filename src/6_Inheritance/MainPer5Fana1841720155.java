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
public class MainPer5Fana1841720155 {
    public static void main(String[] args){
    //TODO code applicaion logic here
    Manager1841720155Fana M=new Manager1841720155Fana();
    M.nama="Fana";
    M.alamat="jl.atletik";
    M.umur=19;
    M.jk="Perempuan";
    M.gaji=5000000;
    M.tunjangan=10000000;
    M.tampilDataManager();
    
    Staff1841720155Fana S = new Staff1841720155Fana();
    S.nama="Anik";
    S.alamat="jl.judes";
    S.umur=30;
    S.jk="Perempuan";
    S.gaji=1000000;
    S.lembur=30000000;
    S.potongan=2500000;
    S.tampilDataStaff();
}            
}
