package com.training.org.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers", schema="test")
public class Customer {
	@Id
	private String customerId;
	private String sex;
	private String maritalStatus;
	private String dependents;
	private String education;
	private String selfEmployed;
	private double income;
	private double coapplicantIncome;
	private double loanAmount;
	private Integer loanAmountTerm;
	private Integer creditHistory;
	private String propertyArea;
	private String loanStatus;
	
	public Customer() {
		
	}

	public Customer(String customerId, String sex, String maritalStatus, String dependents, String education,
			String selfEmployed, double income, double coapplicantIncome, double loanAmount, Integer loanAmountTerm,
			Integer creditHistory, String propertyArea, String loanStatus) {
		super();
		this.customerId = customerId;
		this.sex = sex;
		this.maritalStatus = maritalStatus;
		this.dependents = dependents;
		this.education = education;
		this.selfEmployed = selfEmployed;
		this.income = income;
		this.coapplicantIncome = coapplicantIncome;
		this.loanAmount = loanAmount;
		this.loanAmountTerm = loanAmountTerm;
		this.creditHistory = creditHistory;
		this.propertyArea = propertyArea;
		this.loanStatus = loanStatus;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getDependents() {
		return dependents;
	}

	public void setDependents(String dependents) {
		this.dependents = dependents;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSelfEmployed() {
		return selfEmployed;
	}

	public void setSelfEmployed(String selfEmployed) {
		this.selfEmployed = selfEmployed;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getCoapplicantIncome() {
		return coapplicantIncome;
	}

	public void setCoapplicantIncome(double coapplicantIncome) {
		this.coapplicantIncome = coapplicantIncome;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Integer getLoanAmountTerm() {
		return loanAmountTerm;
	}

	public void setLoanAmountTerm(Integer loanAmountTerm) {
		this.loanAmountTerm = loanAmountTerm;
	}

	public Integer getCreditHistory() {
		return creditHistory;
	}

	public void setCreditHistory(Integer creditHistory) {
		this.creditHistory = creditHistory;
	}

	public String getPropertyArea() {
		return propertyArea;
	}

	public void setPropertyArea(String propertyArea) {
		this.propertyArea = propertyArea;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", sex=" + sex + ", maritalStatus=" + maritalStatus
				+ ", dependents=" + dependents + ", education=" + education + ", selfEmployed=" + selfEmployed
				+ ", income=" + income + ", coapplicantIncome=" + coapplicantIncome + ", loanAmount=" + loanAmount
				+ ", loanAmountTerm=" + loanAmountTerm + ", creditHistory=" + creditHistory + ", propertyArea="
				+ propertyArea + ", loanStatus=" + loanStatus + "]";
	}
	
}
