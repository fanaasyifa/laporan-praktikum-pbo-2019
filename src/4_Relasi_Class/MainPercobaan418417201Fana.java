/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.percobaan4;

/**
 *
 * @author ASUS
 */
public class MainPercobaan418417201Fana {
    public static void main (String [] args){
        Penumpang18417201Fana p=new Penumpang18417201Fana("12345", "Mr. Krab");
        Gerbong1841720155Fana gerbong = new Gerbong1841720155Fana("A",10);
        gerbong.setPenumpang(p,1);
        System.out.println(gerbong.info());
    }
}
