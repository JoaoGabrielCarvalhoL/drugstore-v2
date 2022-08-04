package br.com.carv.drugstore.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Client extends AbstractDomain {

	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date registrationDate;
	
	@Column(nullable = false)
	private Boolean isActive; 
	
	@JoinColumn(nullable = false)
	@OneToOne
	private Person clientPerson;
	
	
	public Client() {
		
	}
	
	public Client(Date registrationDate, Boolean isActive) {
		this.registrationDate = registrationDate; 
		this.isActive = isActive;
	}
	
	public Date getRegistrationDate() {
		return registrationDate;
	}
	
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;;
	}
	
	public Boolean getIsActive() {
		return isActive;
	}
	
	public void setIsAtive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	public Person getClientPerson() {
		return clientPerson; 
	}
	
	public void setClientPerson(Person clientPerson) {
		this.clientPerson = clientPerson;
	}
	
	
	@Override
	public String toString() {
		return "Client: " + clientPerson.toString() + "\nRegistration Date: " + getRegistrationDate() + "\nProfile is active? " + getIsActive(); 
	}
	
	
	

}
