package br.com.carv.drugstore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User extends AbstractDomain {
	
	
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	private Boolean isActive;
	@Column(nullable = false)
	private Character typeUser;
	@Column(length = 32, nullable = false)
	private String password; 
	
	@JoinColumn(nullable = false)
	@OneToOne
	private Person personUser;
	
	public User(){
		
	}
	
	public User(Boolean isActive, Character typeUser, String password) {
		this.isActive = isActive; 
		this.typeUser = typeUser; 
		this.password = password;
	}
	
	
	public Boolean getIsActive() {
		return isActive;
	}
	
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	public Character getTypeUser() {
		return typeUser;
	}
	
	public void setTypeUser(Character typeUser) {
		this.typeUser = typeUser;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Person getPersonUser() {
		return personUser;
	}
	
	public void setPersonUser(Person personUser) {
		this.personUser = personUser;
	}
	
	
	@Override
	public String toString() {
		return "User: " + getPersonUser().toString() + "Type User: " + getTypeUser() + "\nProfile is active? " + getIsActive();
	}
	

}
