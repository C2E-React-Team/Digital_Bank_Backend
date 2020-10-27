package com.training.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.org.model.CarDeal;
import com.training.org.service.CarDealService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController    
public class DealController   
{    
	@Autowired    
	private CarDealService carDealService;     
	@RequestMapping("/cars")    
	public List<CarDeal> getAllDeals()  
	{    
		return carDealService.getAllCarDeals();    
	} 
	
	@RequestMapping(value="/add-deal", method=RequestMethod.POST)    
	public void addDeal(@RequestBody CarDeal carDeal)  
	{    
		carDealService.addCarDeal(carDeal); 
	
}
}
