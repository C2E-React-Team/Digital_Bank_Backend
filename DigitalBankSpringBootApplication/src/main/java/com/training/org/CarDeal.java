package com.training.org;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cardeal", schema="test")
public class CarDeal {
	@Id
	private Integer id;
	private String brand_name;
	private String model;
	private String type;
	private String dealer_name;
	private String image;
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}


	public CarDeal(Integer id, String brand_name, String model, String type, String dealer_name, String image,
			Float price) {
		super();
		this.id = id;
		this.brand_name = brand_name;
		this.model = model;
		this.type = type;
		this.dealer_name = dealer_name;
		this.image = image;
		this.price = price;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getDealer_name() {
		return dealer_name;
	}

	public void setDealer_name(String dealer_name) {
		this.dealer_name = dealer_name;
	}

	private Float price;
	
	public CarDeal() {
		
	}
	


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CarDeal [id=" + id + ", brand_name=" + brand_name + ", model=" + model + ", type=" + type
				+ ", dealer_name=" + dealer_name + ", image=" + image + ", price=" + price + "]";
	}

	

	

}
