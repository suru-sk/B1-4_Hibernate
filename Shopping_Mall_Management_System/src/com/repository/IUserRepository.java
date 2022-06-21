package com.repository;

import com.entity.User;

public interface IUserRepository {
	abstract User addNewUser (User user);
	abstract User updateUser (User user);
	abstract User deleteUser(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
