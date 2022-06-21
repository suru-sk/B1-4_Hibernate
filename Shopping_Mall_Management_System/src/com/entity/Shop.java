package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Shop")

public class Shop {
@Id
private int shopID;
private String shopCategory;
private Employee shopEmployeeID;
private String shopName;
private String customers;
private String shopStatus;
private ShopOwner shopOwner;
private String leaseStatus;
public int getShopID() {
	return shopID;
}
public void setShopID(int shopID) {
	this.shopID = shopID;
}
public String getShopCategory() {
	return shopCategory;
}
public void setShopCategory(String shopCategory) {
	this.shopCategory = shopCategory;
}
public Employee getShopEmployeeID() {
	return shopEmployeeID;
}
public void setShopEmployeeID(Employee shopEmployeeID) {
	this.shopEmployeeID = shopEmployeeID;
}
public String getShopName() {
	return shopName;
}
public void setShopName(String shopName) {
	this.shopName = shopName;
}
public String getCustomers() {
	return customers;
}
public void setCustomers(String customers) {
	this.customers = customers;
}
public String getShopStatus() {
	return shopStatus;
}
public void setShopStatus(String shopStatus) {
	this.shopStatus = shopStatus;
}
public ShopOwner getShopOwner() {
	return shopOwner;
}
public void setShopOwner(ShopOwner shopOwner) {
	this.shopOwner = shopOwner;
}
public String getLeaseStatus() {
	return leaseStatus;
}
public void setLeaseStatus(String leaseStatus) {
	this.leaseStatus = leaseStatus;
}
public void setShopOwner(String string) {
	// TODO Auto-generated method stub
	
}

}

