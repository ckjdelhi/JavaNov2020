package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.oops.Employee;

/*
 * Wrapper classes: 
 * int => Integer
 * float => Float
 * double => Double
 * long => Long
 * ...
 * ...
 */
public class CollectionDemo {

	public static void main(String[] args) {
		//List<Integer> list4 = Arrays.asList(1,2,3,4,5);
				
		//List<Integer> list1= new ArrayList<>();
		/*TreeSet<Integer> list1 = new TreeSet<>();
		list1.add(10);
		list1.add(20);
		list1.add(13);
		list1.add(14);
		list1.add(50);
		list1.add(50);
		
		System.out.println(list1);*/
		
		/*for(int i=0;i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}*/
		
		/*for(Integer i : list1) {
			System.out.println(i);
		}*/
		
		/*list1.forEach(obj -> {
			System.out.println(obj);
		});*/
		//list1.forEach(System.out :: println);
		
		String s1=new String();
		String s2=new String();
		
		//TreeSet<Employee> list = new TreeSet<>();
		List<Employee> list =new ArrayList<>();
		
		list.add(new Employee("Amit", "Singh", 100, 5000));
		list.add(new Employee("Yogesh", "Kumar", 99, 150000));
		list.add(new Employee("chandan", "Jha", 101, 30000));
		list.add(new Employee("Abc", "XYZ", 106, 130000));
		list.add(new Employee("Zbc", "bad", 107, 210000));
		
		Employee e1=new Employee("Deepak", "Singh", 200, 20000);
		list.add(e1);
		list.add(e1);
		
		list.forEach(v -> System.out.println(v.getFirstName() +"\t"+v.getLastName()+"\t"+v.getEmpId()+"\t"+v.getSalary()));
		
		Collections.sort(list);
		
		System.out.println("-------Default Sort by EmpID ASC--------");
		list.forEach(v -> System.out.println(v.getFirstName() +"\t"+v.getLastName()+"\t"+v.getEmpId()+"\t"+v.getSalary()));
		
		//Sort by firstName ASC
		System.out.println("-------Sort by firstName ASC--------");
		Collections.sort(list, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
			}
		});
		list.forEach(v -> System.out.println(v.getFirstName() +"\t"+v.getLastName()+"\t"+v.getEmpId()+"\t"+v.getSalary()));
		
		System.out.println("-------Sort by firstName DESC--------");
		Collections.sort(list, new SortByFirstNameDESC());
		list.forEach(v -> System.out.println(v.getFirstName() +"\t"+v.getLastName()+"\t"+v.getEmpId()+"\t"+v.getSalary()));
		
		System.out.println("-------Sort by LastName ASC--------");
		//Java 8
		list.sort((a, b) -> a.getLastName().compareToIgnoreCase(b.getLastName()));
		list.forEach(v -> System.out.println(v.getFirstName() +"\t"+v.getLastName()+"\t"+v.getEmpId()+"\t"+v.getSalary()));
		
		System.out.println("-------Sort by LastName DESC--------");
		list.stream()
		.sorted((a,b) -> b.getLastName().compareToIgnoreCase(a.getLastName()))
		.forEach(v -> System.out.println(v.getFirstName() +"\t"+v.getLastName()+"\t"+v.getEmpId()+"\t"+v.getSalary()));
		
		System.out.println("get list of employees those salary is greater than 1L and sort the list based on FirstName ASC");
		list.stream()
		.filter(v -> v.getSalary() > 100000)
		.filter(v -> v.getFirstName().startsWith("A"))
		.sorted((a,b) -> a.getFirstName().compareToIgnoreCase(b.getFirstName()))
		.forEach(v -> System.out.println(v.getFirstName() +"\t"+v.getLastName()+"\t"+v.getEmpId()+"\t"+v.getSalary()));
		
	}

}
