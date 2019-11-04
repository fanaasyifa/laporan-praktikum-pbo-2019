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
public class Owner1841720155Fana {
    public void pay(Payable1841720155Fana p){
        System.out.println("Total payment ="+p.getPaymentAmount());
        if(p instanceof ElectricityBill1841720155Fana){
            ElectricityBill1841720155Fana eb=(ElectricityBill1841720155Fana)p;
            System.out.println(""+eb.getBillInfo());
        }else if(p instanceof PermanentEmployee1841720155Fana){
            PermanentEmployee1841720155Fana pe = (PermanentEmployee1841720155Fana)p;
            pe.getEmployeeInfo();
            System.out.println(""+pe.getEmployeeInfo());
        }
    }
    public void showMyEmployee(Employee1841720155Fana e){
        System.out.println(""+e.getEmployeeInfo());
        if(e instanceof PermanentEmployee1841720155Fana)
            System.out.println("You have to pay her/him monthly!!!");
        else
            System.out.println("No need to pay him/her :)");
    }
}