package com.qa.defsspringboot.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supplyer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long id;
	
	@Column(name="firstname", nullable = false) // this annotation takes control of the naming of the column
	private String firstName; // this produce a column called first_name by default
	
	@Column(nullable = false)
	private String lastName; //produces a column called last_name
	
	@Column(nullable = false, unique=true)
	private String email;
	
	// Default constructor 
	public Supplyer() {}
	
	// No ID constructor - used for inserting
	public Supplyer(String firstName, String lastName, String email) {
		super();
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
	}
	
	// All args - used for reading
	public Supplyer(long id, String firstName, String lastName, String email) {
		super();
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, firstName, id, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Supplyer other = (Supplyer) obj;
		return Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName) && id == other.id
				&& Objects.equals(lastName, other.lastName);
	}
	
	
}
