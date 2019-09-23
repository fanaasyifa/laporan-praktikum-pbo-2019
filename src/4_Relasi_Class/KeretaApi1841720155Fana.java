/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.percobaan3;

/**
 *
 * @author ASUS
 */
public class KeretaApi1841720155Fana {
    private String nama;
    private String kelas;
    private Pegawai1841720155Fana masinis;
    private Pegawai1841720155Fana asisten;

    public KeretaApi1841720155Fana(String nama,String kelas,Pegawai1841720155Fana masinis) {
        this.nama = nama;
        this.kelas =kelas;
        this.masinis = masinis;
    }
    public KeretaApi1841720155Fana (String nama, String kelas, Pegawai1841720155Fana masinis, Pegawai1841720155Fana asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }
    public String getNama() {
        return nama;
    }
    public void setNama (String nama) {
        this.nama = nama;
    }
    public String getKelas( ){
        return kelas;
    }
    public void setKelas (String kelas) {
        this.kelas = kelas;
    }
    public Pegawai1841720155Fana getMasinis() {
        return masinis;
    }
    public void setMasinis(Pegawai1841720155Fana masinis){
        this.masinis = masinis;
    }
    public Pegawai1841720155Fana getAsisten() {
        return asisten;
    }
    public void setAsisten(Pegawai1841720155Fana asisten) {
        this.asisten = asisten;
    }
    public String info(){
        String info = "";
       info += "Nama: "+ this.nama+ "\n";
       info += "Kelas: "+this.kelas + "\n";
       info += "Masinis: "+this.masinis.info()+ "\n";
       info += "Asisten: \n"+this.asisten.info()+"\n";
       return info;
    }
    }

