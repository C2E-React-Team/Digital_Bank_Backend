package com.training.org.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loans", schema="test")
public class Loan {

	@Id
	@Column(name="ref_id")
	private String refId;
	
	@Column(name="selected_file")
	private String selected_file;
	
	@Column(name="car_name")
	private String car_name;
	
	@Column(name="loan_amount")
	private double loan_amount;
	
	@Column(name="customer_id")
	private String customerId;
	
	@Column(name="emi")
	private double emi;
	
	@Column(name="car_cost")
	private double car_cost;
	
	@Column(name="tenure")
	private double tenure;

	public Loan() {}
	
	public Loan(String refId, String selected_file, String car_name, double loan_amount, String customerId,
			double emi, double car_cost, double tenure) {
		super();
		this.refId = refId;
		this.selected_file = selected_file;
		this.car_name = car_name;
		this.loan_amount = loan_amount;
		this.customerId = customerId;
		this.emi = emi;
		this.car_cost = car_cost;
		this.tenure = tenure;
	}

	@Override
	public String toString() {
		return "Loan [refId=" + refId + ", selectedFile=" + selected_file + ", carName=" + car_name
				+ ", loanAmount=" + loan_amount + ", customerId=" + customerId + ", emi=" + emi + ", carCost="
				+ car_cost + ", tenure=" + tenure + "]";
	}

	public String getRefId() {
		return refId;
	}

	public void setRefId(String ref_id) {
		this.refId = ref_id;
	}

	public String getSelectedFile() {
		return selected_file;
	}

	public void setSelectedFile(String selected_file) {
		this.selected_file = selected_file;
	}

	public String getCarName() {
		return car_name;
	}

	public void setCarName(String car_name) {
		this.car_name = car_name;
	}

	public double getLoanAmount() {
		return loan_amount;
	}

	public void setLoanAmount(double loan_amount) {
		this.loan_amount = loan_amount;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public double getEmi() {
		return emi;
	}

	public void setEmi(double emi) {
		this.emi = emi;
	}

	public double getCarCost() {
		return car_cost;
	}

	public void setCarCost(double car_cost) {
		this.car_cost = car_cost;
	}

	public double getTenure() {
		return tenure;
	}

	public void setTenure(double tenure) {
		this.tenure = tenure;
	}
	
	
}
