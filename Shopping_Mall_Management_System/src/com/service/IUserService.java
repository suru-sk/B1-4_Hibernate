package com.service;

import com.entity.User;

public interface IUserService 
{
	abstract User addNewUser(User user);
	abstract User updateUser(User user);
	abstract User login(User user);
	abstract boolean logOut();

}
