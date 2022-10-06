package com.pattern.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {
private List<String>empList;
public Employee(List<String>empList){
	this.empList = empList;
}

public Employee() {
	empList = new ArrayList<>();
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
	List<String>emp = new ArrayList<>();
	for(String temp:this.getEmpList()) {
		emp.add(temp);
	}
		return new Employee(emp);
	}
public void loadData(){
	//read all employees from database and put into the list
	empList.add("Pankaj");
	empList.add("Raj");
	empList.add("David");
	empList.add("Lisa");
}

public List<String>getEmpList(){
	return empList;
}
	
}
