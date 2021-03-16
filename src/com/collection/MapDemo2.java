package com.collection;

import java.util.Map;
import java.util.TreeMap;

class Student implements Comparable<Student>{
	private int stuId;
	private String name;
	public Student(int stuId, String name) {
		this.stuId = stuId;
		this.name = name;
	}
	public int getStuId() {
		return stuId;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		return this.stuId-o.stuId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + stuId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (stuId != other.stuId)
			return false;
		return true;
	}
	
}
/*
 * hashCode & equals method
 */
public class MapDemo2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();
		map.put("abc", 123);
		map.put("xyz", 103);
		map.put("asd", 23);
		map.put("vds", 213);
		map.put("reeqw", 230);
		
		System.out.println(map);
		
		Map<Student, Integer> stuMap=new TreeMap<>();
		
		Student s1=new Student(100, "Rakesh");
		Student s2=new Student(200, "Shayam");
		Student s3=new Student(99, "Abramh");
		
		stuMap.put(s1, 100);
		stuMap.put(s2, 200);
		stuMap.put(s3, 99);
		stuMap.put(s1, 300);
		
		System.out.println(stuMap);

	}

}
