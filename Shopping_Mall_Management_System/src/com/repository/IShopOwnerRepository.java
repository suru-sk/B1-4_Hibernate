package com.repository;

import com.entity.ShopOwner;

public interface IShopOwnerRepository 
{
	abstract ShopOwner addShopOwner (ShopOwner ShopOwner);
	abstract ShopOwner updateShopOwner(ShopOwner ShopOwner);
	abstract ShopOwner searchShopOwner(int id);
	abstract ShopOwner deleteShopOwner(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}
