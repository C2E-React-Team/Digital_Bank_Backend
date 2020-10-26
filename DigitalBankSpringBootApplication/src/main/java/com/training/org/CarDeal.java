package com.training.org;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cardeal", schema="test")
public class CarDeal {
	@Id
	private double id;
	private String brand_name;
	private String car_name;
	private double mileage;
	private double engine_displacement;
	private double seating_capacity;
	private String type;
	private String dealer_name;
	private String image;
	private double price;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public double getEngine_displacement() {
		return engine_displacement;
	}
	public void setEngine_displacement(double engine_displacement) {
		this.engine_displacement = engine_displacement;
	}
	public double getSeating_capacity() {
		return seating_capacity;
	}
	public void setSeating_capacity(double seating_capacity) {
		this.seating_capacity = seating_capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDealer_name() {
		return dealer_name;
	}
	public void setDealer_name(String dealer_name) {
		this.dealer_name = dealer_name;
	}
	
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	public CarDeal(double id, String brand_name, String car_name, double mileage, double engine_displacement,
			double seating_capacity, String type, String dealer_name, String image, double price) {
		super();
		this.id = id;
		this.brand_name = brand_name;
		this.car_name = car_name;
		this.mileage = mileage;
		this.engine_displacement = engine_displacement;
		this.seating_capacity = seating_capacity;
		this.type = type;
		this.dealer_name = dealer_name;
		this.image = image;
		this.price = price;
	}
	public CarDeal() {}
	
}