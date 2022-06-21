package com.service;

import com.entity.Shop;
import com.entity.User;

public interface IAdminService 
{
	abstract Boolean approveNewShop(Shop shop);
	abstract User updateUser(User user);
	abstract User login(User user);
	abstract boolean logOut();

}
