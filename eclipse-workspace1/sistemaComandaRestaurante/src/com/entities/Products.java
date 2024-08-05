package com.entities;

public class Products {
	
	private String nameOfProduct;
	
	public Products(String nameOfProduct) {
		super();
		this.nameOfProduct = nameOfProduct;
		
	}
	public String getNameOfProduct() {
		return nameOfProduct;
	}
	public void setNameOfProduct(String nameOfProduct) {
		this.nameOfProduct = nameOfProduct;
	}

	
	
	@Override
	public String toString() {
		return "[   ] " + nameOfProduct +  "";
	}
	
	
	
	
	
	
	}
	
	

