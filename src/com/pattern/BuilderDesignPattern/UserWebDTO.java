package com.pattern.BuilderDesignPattern;

public class UserWebDTO implements UserDTO {

private String name;
	
	private String address;
	
	private String age;
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public UserWebDTO(String name, String address, String age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}

	@Override
	public String toString() {
		return "UserWebDTo [name=" + name + ", address=" + address + ", age=" + age + "]";
	}

	@Override
	public String getAge() {
		// TODO Auto-generated method stub
		return age;
	}

}
