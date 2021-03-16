package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Integer> list=new Vector<>();
		list.add(100);
		list.add(10);
		list.add(20);
		list.add(300);
		list.add(500);
		list.add(600);
		list.add(800);
		System.out.println(list);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i);

			//itr.remove();
			//list.remove(i);
			
		}
		
		System.out.println("--------------");
		Enumeration<Integer> enu = list.elements();
		while(enu.hasMoreElements()) {
			Integer i = enu.nextElement();
			list.remove(i);
			
			System.out.println(i);
			
		}
	}

}
