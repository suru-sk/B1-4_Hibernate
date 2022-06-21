package com.repository;

import com.entity.Item;

public interface IItemRepository {
	abstract Item addItem (Item item);
	abstract Item updateItem(Item item);
	abstract Item searchItem(int id);
	abstract Item deleteItem(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
	abstract Item deleteItem(long id);
	abstract Item searchItem(long id);
}
