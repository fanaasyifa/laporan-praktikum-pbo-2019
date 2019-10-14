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
public class Ikan1841720155Fana {
  public void swim(){
      System.out.println("Ikan bisa berenang");
  }  
}
class Piranha extends Ikan1841720155Fana{
    public void swim(){
        System.out.println("Piranha bisa makan daging");
    }
}
public class Fish{
    public static void main(String[]args){
        Ikan1841720155Fana a = new Ikan1841720155Fana();
        Ikan1841720155Fana b = new Piranha();
        a.swim();
        b.swim();
    }
}
