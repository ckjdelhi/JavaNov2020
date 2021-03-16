package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * keySet() -> all the keys
 * values() -> all the values
 * entrySet() -> all key-values
 */
public class MapDemo3 {

	public static void main(String[] args) {
		Map<Integer, List<String>> mapOfList =new LinkedHashMap<>();
		List<String> list1 =new ArrayList<>();
		list1.add("Abc");
		list1.add("zyx");
		
		mapOfList.put(100, list1);
		
		List<String> list2 = Arrays.asList("A", "B","C");
		mapOfList.put(101, list2);
		
		System.out.println(mapOfList.size());
		System.out.println(mapOfList);
		
		Set<Entry<Integer, List<String>>> obj= mapOfList.entrySet();
		for(Entry<Integer, List<String>> obj1:obj) {
			Integer key = obj1.getKey();
			List<String> val = obj1.getValue();
			for(String s: val) {
				System.out.println("Key ="+key +" value= "+s);
			}
		}
		
		
		Map<List<String>, Map<String, List<Integer>>> mapOfListAndMap=new HashMap<>();
		
	}

}
