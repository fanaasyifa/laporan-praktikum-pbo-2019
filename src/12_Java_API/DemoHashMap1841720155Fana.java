/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet12.percobaan3;
import java.util.HashMap;
/**
 *
 * @author ASUS
 */
public class DemoHashMap1841720155Fana {
    public static void main (String[]args){
        HashMap hMapItem = new HashMap();
        hMapItem.put("1","Biskuit");
        hMapItem.put("2","Shampoo");
        hMapItem.put("3", "Soap");
        System.out.println(hMapItem);
        System.out.format("HashMap Item Total : %d\n\n", hMapItem.size());
        
        Object mObject=hMapItem.remove("1");
        System.out.format("Biskuit remove from Hashmap\n",mObject);
        System.out.format("HashMap Item Total : %d\n", hMapItem.size());
        System.out.println(hMapItem);
        
        hMapItem.clear();
        System.out.format("HasMap Item Total : %d\n",hMapItem.size());
    }
}
