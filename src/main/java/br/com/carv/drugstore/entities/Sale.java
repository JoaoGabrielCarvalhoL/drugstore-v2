package br.com.carv.drugstore.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Sale extends AbstractDomain {

	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date timeSale; 
	
	@Column(nullable = false, precision = 8, scale = 2)
	private BigDecimal totalSaleValue;
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private Client client; 
	
	@JoinColumn(nullable = false)
	@ManyToOne
	private Employee employee;
	
	public Sale() {
		
	}
	
	public Sale(Date timeSale, BigDecimal totalSaleValue) {
		this.timeSale = timeSale; 
		this.totalSaleValue = totalSaleValue;
	}
	
	public Date getTimeSale() {
		return timeSale;
	}
	
	public void setTimeSale(Date timeSale) {
		this.timeSale = timeSale;
	}
	
	public BigDecimal getTotalSaleValue() {
		return totalSaleValue;
	}
	
	public void setTotalSaleValue(BigDecimal totalSaleValue) {
		this.totalSaleValue = totalSaleValue;
		
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	@Override 
	public String toString() {
		return "Sale: " + "\nTotal purchase amount: " + getTotalSaleValue() + "  - Time of purchase: " + getTimeSale() + "\nClient: " + getClient().toString() + 
				"\nEmployee responsible for the sale: " + getEmployee().toString();
	}
	
	

}
