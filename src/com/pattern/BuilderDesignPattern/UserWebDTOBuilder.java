package com.pattern.BuilderDesignPattern;

import java.time.LocalDate;
import java.time.Period;

public class UserWebDTOBuilder implements UserDTOBuilder {
	private String firstName;
	private String lastName;
	private String age;
	private String address;
	private UserWebDTO dto;
	@Override
	public UserDTOBuilder withFirstName(String fname) {
		// TODO Auto-generated method stub
		firstName = fname;
		return this;
	}

	@Override
	public UserDTOBuilder withLastName(String lname) {
		// TODO Auto-generated method stub
		lastName = lname;
		return this;
	}

	@Override
	public UserDTOBuilder withBirthday(LocalDate date) {
		// TODO Auto-generated method stub
		Period ageInYears = Period.between(date, LocalDate.now());
		age = Integer.toString(ageInYears.getYears());
		return this;
	}

	@Override
	public UserDTOBuilder withAddress(Address address) {
		// TODO Auto-generated method stub
		this.address = address.getHouseNumber() +", " + address.getStreet()
		   +"\n" + address.getCity() +"\n"+address.getState()+" "+address.getZipcode();
return this;
		
	}

	@Override
	public UserDTO build() {
		// TODO Auto-generated method stub
		dto = new UserWebDTO(firstName+ " "+lastName, address, age);
		return dto;
	}

	@Override
	public UserDTO getUserDTO() {
		// TODO Auto-generated method stub
		return dto;
	}

}
