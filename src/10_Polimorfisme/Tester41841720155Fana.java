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
public class Tester41841720155Fana {
    public static void main(String[] args) {
        Owner1841720155Fana ow = new Owner1841720155Fana();
        ElectricityBill1841720155Fana eBill = new ElectricityBill1841720155Fana(5, "R-1");
        ow.pay(eBill);
        System.out.println("-------------------------------");
        
        PermanentEmployee1841720155Fana pEmp = new PermanentEmployee1841720155Fana("Dedik", 500);
        ow.pay(pEmp);
        System.out.println("-------------------------------");
        
        InternshipEmployee1841720155Fana iEmp = new InternshipEmployee1841720155Fana("Sunarto", 5);
        ow.showMyEmployee(pEmp);
        System.out.println("-------------------------------");
        ow.showMyEmployee(iEmp);
}
}





