package br.com.carv.drugstore.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public abstract class Person extends AbstractDomain implements Comparable<Person>, Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 50)
	private String name; 
	@Column(nullable = false, length = 14)
	private String certificatePerson; 
	@Column(nullable = false, length = 12)
	private String registerPerson; 
	@Column(nullable = false, length = 50)
	private String email;
	@JoinColumn(nullable = false)
	@ManyToOne
	private Address address;
	@JoinColumn
	@ManyToOne
	private Telephone telephone;
	
	public Person() {
		
	}
	
	public Person(String name, String certificatePerson, String registerPerson, String email, Address address, Telephone telephone) {
		this.name = name; 
		this.certificatePerson = certificatePerson;
		this.registerPerson = registerPerson; 
		this.email = email; 
		this.address = address; 
		this.telephone = telephone;
	}
	
	public String getName() {
		return name; 
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCertificatePerson() {
		return certificatePerson;
	}
	
	public void setCertificateperson(String certificatePerson) {
		this.certificatePerson = certificatePerson;
	}
	
	public String getRegisterPerson() {
		return registerPerson;
	}
	
	public void setRegisterPerson(String registerPerson) {
		this.registerPerson = registerPerson;
	}
	
	public String getEmail() {
		return email; 
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Telephone getTelephone() {
		return telephone;
	}
	
	public void setTelephone(Telephone telephone) {
		this.telephone = telephone;
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + "\nCPF: " + getCertificatePerson() + "\nRG: " + getRegisterPerson() + "\nEmail: " + getEmail() + 
				"\nAddress: " + getAddress().toString()  + "\nContact: " + getTelephone().toString();
	}
	
	@Override
	public int compareTo(Person arg0) {
		return this.certificatePerson.compareTo(arg0.getCertificatePerson());
		
	}


	
	

}
