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
public class InternshipEmployee1841720155Fana extends Employee1841720155Fana{
    private int length;
    
    public InternshipEmployee1841720155Fana(String name, int length){
        this.length =length;
        this.name = name;
    }
    public int getLength(){
       return length;
    }
    public void setLength(int length){
        this.length = length;
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as intership employee for"+length+"month/s\n";
        return info;
    }
}
