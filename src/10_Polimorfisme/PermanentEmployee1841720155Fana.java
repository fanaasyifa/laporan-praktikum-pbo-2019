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
public class PermanentEmployee1841720155Fana extends Employee1841720155Fana implements Payable1841720155Fana{
    private int salary;
    
    public PermanentEmployee1841720155Fana(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    
    @Override
    public int getPaymentAmount() {
        return (int) (salary+0.5*salary);
    }
    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as permanent employee with salary " +salary+"\n";
        return info;
    }
}