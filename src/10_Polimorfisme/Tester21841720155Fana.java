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
public class Tester21841720155Fana {
    public static void main(String[] args) {
        PermanentEmployee1841720155Fana pEmp = new PermanentEmployee1841720155Fana("Dedik", 500);
        Employee1841720155Fana e;
        e = pEmp;
        System.out.println(""+e.getEmployeeInfo());
        System.out.println("----------------------");
        System.out.println("" +pEmp.getEmployeeInfo());
    }
}