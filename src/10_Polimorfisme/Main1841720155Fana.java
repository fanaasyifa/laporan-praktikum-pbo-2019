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
public class Main1841720155Fana {

    public static void main(String[] args) {
          WalkingZombie1841720155Fana wz = new WalkingZombie1841720155Fana(100, 1);
        JumpingZombie1841720155Fana jz = new JumpingZombie1841720155Fana(100, 2);
        Barrier1841720155Fana b = new Barrier1841720155Fana(100);
        Plant1841720155Fana p = new Plant1841720155Fana();
        
        System.out.println(""+wz.getZombieInfo());
        System.out.println(""+jz.getZombieInfo());
        System.out.println(""+b.getBarrierInfo());
        System.out.println("---------------------");
        
        for(int i=0; i<4; i++){
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println(""+wz.getZombieInfo());
        System.out.println(""+jz.getZombieInfo());
        System.out.println(""+b.getBarrierInfo());
    }
}
