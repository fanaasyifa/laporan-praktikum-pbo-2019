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
public class Tester31841720155Fana {
    public static void main(String[] args) {
        PermanentEmployee1841720155Fana pEmp = new PermanentEmployee1841720155Fana("Dedik", 500);
        InternshipEmployee1841720155Fana iEmp = new InternshipEmployee1841720155Fana("Sunarto", 5);
        ElectricityBill1841720155Fana eBill = new ElectricityBill1841720155Fana(5, "A-1");
        Employee1841720155Fana e[] = {pEmp, iEmp};
        Payable1841720155Fana p[] = {pEmp, eBill};
       // Employee e2[] = {pEmp, iEmp, eBill};
    }
}