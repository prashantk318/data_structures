package com.pattern.BuilderDesignPattern;

import java.time.LocalDate;

public class Client {
	public static void main(String[] args) {
		// Typically, you will be getting this object from your persistence layer or from a service.
		User user = createUser();

		UserDTOBuilder builder = new UserWebDTOBuilder();

		//Client has to provide director with concrete builder
		UserDTO dto = directBuild(builder, user);
		System.out.println(dto);
	}
	
	/**
	 * This method serves the role of director in builder pattern. 
	 */
	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName())
			.withLastName(user.getLastname())
			.withAddress(user.getAddress())
			.withBirthday(user.getBirthDate())
			.build();
	}
	
	/**
	 * Returns a sample user. 
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthDate(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastname("Swanson");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		user.setAddress(address);
		return user;
	}

}
