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
public class WalkingZombie1841720155Fana extends Zombie1841720155Fana {
    WalkingZombie1841720155Fana(int health, int level){
        this.health = health;
        this.level = level;
    }
    
    @Override
    void heal() {
        if(level == 1){
            health = (int) (health+(health*20/100));
        }
        else if(level == 2){
            health = (int) (health+(health*30/100));
        }
        else if(level == 3){
            health = (int) (health+(health*10/100));
        }
    }

    @Override
    public void destroyed() {
        health = (int) (health-(health*20/100));
    }
    public String getZombieInfo(){
        System.out.println("Walking Zombie Data :");
        return super.getZombieInfo(); 
    }
    
}

