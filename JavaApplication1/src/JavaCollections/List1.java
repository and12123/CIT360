/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Alyssa
 */
public class List1 {
    public static void main(String[] args) {
        
        List gunList = new ArrayList();
        List list2 = new ArrayList();
        
        gunList.add("Glock");
        gunList.add("Remington");
        gunList.add("M&P");
        gunList.add("Springfield");
        gunList.add("Mossberg");
        gunList.add("Taurus");  
        gunList.add("Kel-Tec"); 
        gunList.add("Colt"); 
        
        System.out.println("\t" + gunList);
         
        for(int i = 0; i < gunList.size(); i++) {
            Object obj = gunList.get(i);
            list2.add(obj);
        }
        System.out.println();  
        System.out.println("\t" + list2);
             
        for(int i = 0; i < list2.size(); i++) {
            Object obj = list2.get(i);
            System.out.println(obj);
        }
        
        System.out.println("Remove Kel-Tec from the list");
        
        for (int i = 0; i < gunList.size(); i++) {
            Object obj = gunList.get(i);
            if (obj == "Kel-Tec") {
                gunList.remove("Kel-Tec");
            }
        }
        System.out.println("\t" + gunList);
        
        System.out.println("Add Kel-Tec to the list");
        
        for (int i = 6; i < gunList.size(); i++) {
            Object obj = gunList.get(i);
            if (obj != "Kel-Tec") {
                gunList.add("Kel-Tec");
            }
        }
        System.out.println("\t" + gunList);
        
        List newLinkedList = new LinkedList();
        
        for (int i = 0; i < gunList.size(); i++){
            Object obj = gunList.get(i);
            newLinkedList.add(obj);
        }
        
        System.out.println();
        
        System.out.println("newLinkedList");
        System.out.println("\t" + newLinkedList);
        
        Iterator newList = newLinkedList.iterator();
        
        System.out.println();
        
        System.out.println("newList");
        System.out.println("\t" + newList);
        
        System.out.println();
        
        System.out.println("newList");
        
        System.out.print("      [ ");
        
        while (newList.hasNext()) {
            Object print = newList.next();
            System.out.print(print + " ");
        }
        System.out.print("]");
        System.out.println();
        
    }   
}
