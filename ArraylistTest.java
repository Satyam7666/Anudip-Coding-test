package com.test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		//add element to list
        list.add("Stark");
        list.add("Captain");
        list.add("wanda");
        list.add("kiw");
        //peint ellement of list
        for(String str: list) {
       	System.out.println(str+ " Length is "+str.length());
       }
        //remove element having length less than 3
        System.out.println("******************************************************");
        System.out.println("Iterat over list");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.length() <= 3) {
                iterator.remove();
                System.out.println(str +" is removed from list");
            }
        }
        
        //print updated list
        
        System.out.println("******************************************************");
        System.out.println("Iterat over updated list");
        
        
        for(String str: list) {
        	System.out.println(str);
        }
        
	}

}
