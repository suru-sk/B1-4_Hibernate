package com.repository;

import javax.persistence.EntityManager;

import com.entity.Mall;

	public class IMallRepositoryImpl implements IMallRepository 
	{
		private EntityManager entityManager;
		private Mall mall;
			public void IOrderRepositoryimpl() {
				entityManager = JPAUtil.getEntityManager();
			}
			@Override
			public Mall addMall(Mall Mall) {
				// TODO Auto-generated method stub
				entityManager.persist(mall);
				return mall;
			}
			@Override
			public Mall updateMall(Mall mall) {
				// TODO Auto-generated method stub
				entityManager.merge(mall);
				return mall;
			}
			@Override
			public Mall searchMall(int id) {
				// TODO Auto-generated method stub
				@SuppressWarnings("unused")
				Mall mall = entityManager.find(Mall.class, id);
				return mall;
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
