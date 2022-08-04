package br.com.carv.drugstore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class State extends AbstractDomain {

	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false, length = 2)
	private String acronym;
	
	@Column(nullable = false, length = 50)
	private String name;
	
	public State( ) {
		
	}
	
	public State(String acronym, String name) {
		this.acronym = acronym; 
		this.name = name;
	}
	
	public String getAcronym() {
		return acronym;
	}
	
	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return getName() + " - " + getAcronym();
	}

}
