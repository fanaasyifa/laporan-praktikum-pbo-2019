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
public class MainPercobaan31841720155Fana {
    public static void main (String [] args){
    Pegawai1841720155Fana masinis = new Pegawai1841720155Fana("123","Spongebob Squarepants");
    Pegawai1841720155Fana asisten = new Pegawai1841720155Fana("4567","Patrick Star");
    KeretaApi1841720155Fana keretaApi=new KeretaApi1841720155Fana("Gaya Baru","Bisnis",masinis,asisten);
    
        System.out.println(keretaApi.info());
    }
    }
