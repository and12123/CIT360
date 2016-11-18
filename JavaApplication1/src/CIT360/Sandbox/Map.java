/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT360.Sandbox;
import java.util.*;
/**
 *
 * @author Alyssa
 */
public class Map {

    public static void main(String[] args) {
	        HashMap<String, Integer> guns = new HashMap();
	         
	        guns.put("Glock", 10);
	        guns.put("Remmington", 6);
	        guns.put("M&P", 7);
	        guns.put("Springfield", 5);
	         
	        System.out.println("Total guns: " + guns.size());
	     
	        for(String key: guns.keySet())
	            System.out.println(key + " - " + guns.get(key));
	        System.out.println();
	         
	        String searchKey = "Glock";
	        if(guns.containsKey(searchKey))
	            System.out.println("Found total " + guns.get(searchKey) + " "
	                    + searchKey + " guns!\n");
	         
	        guns.clear();
	         
	        System.out.println("After clear operation, size: " + guns.size());
	    }
}