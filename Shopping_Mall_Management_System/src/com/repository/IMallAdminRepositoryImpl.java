package com.repository;

import javax.persistence.EntityManager;
import com.entity.MallAdmin;

public class IMallAdminRepositoryImpl implements IMallAdminRepository 
{
	private EntityManager entityManager;
	private MallAdmin mallAdmin;
		public void IOrderRepositoryimpl() {
			entityManager = JPAUtil.getEntityManager();
		}
		@Override
		public MallAdmin addMallAdmin(MallAdmin mallAdmin) {
			// TODO Auto-generated method stub
			entityManager.persist(mallAdmin);
			return mallAdmin;
		}
		@Override
		public MallAdmin updateMallAdmin(MallAdmin mallAdmin) {
			// TODO Auto-generated method stub
			entityManager.merge(mallAdmin);
			return mallAdmin;
		}
		
		@Override
		public MallAdmin searchMallAdmin(int id) {
			// TODO Auto-generated method stub
			MallAdmin mallAdmin = entityManager.find(MallAdmin.class, id);
			return mallAdmin;
		}

		@Override
		public MallAdmin deleteMallAdmin(int id) {
			// TODO Auto-generated method stub
			return mallAdmin;
		}
		
		
		@Override
		public void commitTransaction() {
			// TODO Auto-generated method stub
			entityManager.getTransaction().commit();
			
		}
		@Override
		public void beginTransaction() {
			// TODO Auto-generated method stub
			entityManager.getTransaction().begin();
		}

}
