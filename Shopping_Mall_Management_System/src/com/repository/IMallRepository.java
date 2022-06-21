package com.repository;

import com.entity.Mall;

public interface IMallRepository 
{
	abstract Mall addMall (Mall Mall);
	abstract Mall updateMall(Mall mall);
	abstract Mall searchMall(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
