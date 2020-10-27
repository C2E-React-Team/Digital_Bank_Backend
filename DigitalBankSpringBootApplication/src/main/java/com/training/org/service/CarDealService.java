package com.training.org.service;
import com.training.org.model.CarDeal;
import com.training.org.repository.CarDealRepository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class CarDealService {
	@Autowired
	private CarDealRepository carDealRepository;
	
	public List<CarDeal> getAllCarDeals()  
	{    
		List<CarDeal> carDeals = new ArrayList<>();    
		carDealRepository.findAll().forEach(deal->carDeals.add(deal));  
		return carDeals;    
	}    
	public void addCarDeal(CarDeal carDeal)  
	{    
		carDealRepository.save(carDeal);
	
	}
}
