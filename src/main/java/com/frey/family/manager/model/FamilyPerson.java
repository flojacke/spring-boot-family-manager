package com.frey.family.manager.model;

import java.util.Objects;

public class FamilyPerson {


	private Long id;
	private String firstName;
	private String LastName;
	private String email;
	
	
	public FamilyPerson() {
	}
	
	public FamilyPerson(Long id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		LastName = lastName;
		this.email = email;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(LastName, email, firstName, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FamilyPerson other = (FamilyPerson) obj;
		return Objects.equals(LastName, other.LastName) && Objects.equals(email, other.email)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "FamilyPerson [id=" + id + ", firstName=" + firstName + ", LastName=" + LastName + ", email=" + email
				+ "]";
	}

	
}
