/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.percobaan1;

/**
 *
 * @author ASUS
 */
public class MainProcessor1841720155Fana {
     public static void main(String args[]){
         Processor1841720155Fana p = new Processor1841720155Fana ("Intel i5",3);
         Laptop1841720155Fana l= new Laptop1841720155Fana("Thinkpad",p);
         l.info();
     
     Processor1841720155Fana p1 = new Processor1841720155Fana();
     p1.setMerk("intel i5");
     p1.setCache(4);
     Laptop1841720155Fana L1=new Laptop1841720155Fana();
     L1.setMerk("Thinkpad");
     L1.setProc(p1);
     L1.info();
}
}







