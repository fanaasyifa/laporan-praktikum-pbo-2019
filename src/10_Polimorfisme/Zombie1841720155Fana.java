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
public abstract class Zombie1841720155Fana implements Destroyable1841720155Fana { 
    
    protected int health, level;
    
    abstract void heal();
    public abstract void destroyed();
    
    public String getZombieInfo(){
        String info = "Health   : "+health+"\nLevel   : "+level;
        return info;
    }
}