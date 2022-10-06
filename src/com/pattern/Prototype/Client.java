package com.pattern.Prototype;

import java.util.List;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee();
		emp.loadData();
		Employee emp1 = (Employee)emp.clone();
		Employee emp2 = (Employee)emp.clone();
		List<String>list = emp2.getEmpList();
		System.out.println("original List"+list);
		list.add("Prashant");
		System.out.println("List list of employee1"+list);
		List<String>list1 = emp1.getEmpList();
		list1.remove("Pankaj");
		System.out.println("emp2"+list1);
		
	}

}
