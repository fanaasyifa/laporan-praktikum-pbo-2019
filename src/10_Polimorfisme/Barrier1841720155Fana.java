/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet10;

/**
 *
 * @author ASUS
 */
public class Barrier1841720155Fana implements Destroyable1841720155Fana {
   private int strength;
    
    public Barrier1841720155Fana(int strength){
        this.strength = strength;
    }
    public void setStrength(int strength){
        this.strength = strength;
    }
    public int getStrength(){
        return strength;
    }
    
    @Override
    public void destroyed() {
        strength = strength-9;
    }
    public String getBarrierInfo(){
        System.out.println("");
        return "Barrier Strength : "+this.strength;
    } 
}
