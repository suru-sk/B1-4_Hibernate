package com.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ShopOwner")

public class ShopOwner {
	@Id
	private int id;
	private String name;
	private LocalDate dob;
	private String Shop;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getShop() {
		return Shop;
	}
	public void setShop(String shop) {
		Shop = shop;
	}
	
	

}
