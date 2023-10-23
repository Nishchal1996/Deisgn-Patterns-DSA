package com.test.codes.compares;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableOperation {
	public static void main(String[] args) {
       
		List<Integer> integerList=Arrays.asList(12,13,15,76,54,2,68,62,27);
		Collections.sort(integerList);
		System.out.println(integerList);
		
		List<String> stringList=Arrays.asList("How","are","you","?");
		Collections.sort(stringList);
		System.out.println(stringList);
		List<Student> studentList=new ArrayList<Student>();
		studentList.add(new Student(121, "xyz", "Jacksonville"));
		studentList.add(new Student(124, "pqr", "Dc"));
		studentList.add(new Student(126, "qwerty", "LA"));
		studentList.add(new Student(122, "anonymous", "Texas"));
		Collections.sort(studentList);
		System.out.println(studentList);
		
		
		List<Employee> employeeList=new ArrayList<Employee>();
		employeeList.add(new Employee(121, "xyz", "Jacksonville"));
		employeeList.add(new Employee(124, "ram", "Dc"));
		employeeList.add(new Employee(126, "shyam", "LA"));
		employeeList.add(new Employee(122, "anant", "Texas"));
	
		
       Collections.sort(employeeList, new EmpIdComparator());
       System.out.println(employeeList);
       
       System.out.println("Name Compartor");
       Collections.sort(employeeList,new EmpNameComparator());
       System.out.println(employeeList);
	}
}
