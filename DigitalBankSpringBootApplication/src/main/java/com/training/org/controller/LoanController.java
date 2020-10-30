package com.training.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.org.model.Customer;
import com.training.org.model.Loan;
import com.training.org.service.LoanService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController   
public class LoanController {

	@Autowired
	LoanService loanService;
	
	@GetMapping("/loans")
	public List<Loan> getLoans(){
		return loanService.getAllLoans();
	}
	
	@PostMapping("/loans/add")
	public Loan createLoans(@RequestBody Loan loan) throws Exception {
		loan = loanService.createLoan(loan);
		System.out.println("called");
		return loan;
	}
	
	@GetMapping("/loans/get/{id}")    
	public List<Loan> getCustomerLoansById(@PathVariable("id") String customerId)  
	{    
		List<Loan> loans = loanService.getCustomerLoans(customerId); 
		
		return loans;
	}
	
	@DeleteMapping("/loans/delete/{refId}")    
	public Loan deleteLoanByRef(@PathVariable("refId") String refId) throws Exception  
	{    
		//List<Loan> loans = 
		Loan loan = loanService.deleteLoan(refId); 
		
		return loan;
	}
	
}
