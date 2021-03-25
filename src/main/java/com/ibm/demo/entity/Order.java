package com.ibm.demo.entity;

public class Order {
	private String item;
	private float price;

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		if(price<=0) {
			throw new IllegalArgumentException("Price cannot be negative");
		}
		this.price = price;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

}