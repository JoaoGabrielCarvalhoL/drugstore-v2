package br.com.carv.drugstore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class City extends AbstractDomain {

	private static final long serialVersionUID = 1L;
	
	@Column(length = 50, nullable = false)
	private String name; 
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private State state;
	
	public City() {
		
	}
	
	public City(String name, State state) {
		this.name = name; 
		this.state = state;
	}
	
	public String getName( ) {
		return name; 
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + "State: " + getState().getName() + " - " + getState().getAcronym();
	}

}
