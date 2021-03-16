package com.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map =new LinkedHashMap<Integer, String>();
		
		map.put(11110, "A");
		map.put(110, "Z");
		map.put(102, "D");
		map.put(103, "C");
		map.put(100, "FF");
		
				
		Set<Integer> keys = map.keySet();
		
		System.out.println(keys);
		
		Collection<String> values = map.values();
		
		System.out.println(values);
		
		Set<Entry<Integer, String>> entry= map.entrySet();
		System.out.println(entry);
		
		/*for(Entry<Integer, String> e: entry) {
			System.out.println(e.getKey() +"\t"+e.getValue());
		}*/
		
		Iterator<Entry<Integer, String>> itr=entry.iterator();
		while(itr.hasNext()) {
			Entry<Integer, String> e= itr.next();
			System.out.println(e.getKey() +"\t "+e.getValue());
		}
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("ABC2");
		list.add("ABC1");
		list.add("ABC3");
		
		ListIterator<String> listItr= list.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
	}

}
