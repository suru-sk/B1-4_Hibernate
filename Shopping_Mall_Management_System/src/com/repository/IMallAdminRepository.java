package com.repository;

import com.entity.MallAdmin;

public interface IMallAdminRepository {
	abstract MallAdmin addMallAdmin(MallAdmin mallAdmin);
	abstract MallAdmin updateMallAdmin(MallAdmin mallAdmin);
	abstract MallAdmin searchMallAdmin(int id);
	abstract MallAdmin deleteMallAdmin(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();

}
