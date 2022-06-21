package com.entity;
	import java.time.LocalDate;

import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;
	@Entity
	@Table(name="Item")
	public class Item {
	@Id
	private long id;
	private String name;
	private LocalDate manufacturing;
	private LocalDate expiry;
	private float price;
	private String category;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getManufacturing() {
		return manufacturing;
	}
	public void setManufacturing(LocalDate manufacturing) {
		this.manufacturing = manufacturing;
	}
	public LocalDate getExpiry() {
		return expiry;
	}
	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	

}
