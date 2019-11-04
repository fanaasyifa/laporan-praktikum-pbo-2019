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
public class Plant1841720155Fana {
    public void doDestroy(Destroyable1841720155Fana d){
        if(d instanceof WalkingZombie1841720155Fana){
            ((WalkingZombie1841720155Fana)d).destroyed();
        }
        else if(d instanceof JumpingZombie1841720155Fana){
            ((JumpingZombie1841720155Fana)d).destroyed();
        }
        else if(d instanceof Barrier1841720155Fana){
            ((Barrier1841720155Fana)d).destroyed();
        }
    }
}