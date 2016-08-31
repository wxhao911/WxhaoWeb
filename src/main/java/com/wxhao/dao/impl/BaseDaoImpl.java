package com.wxhao.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.wxhao.dao.BaseDao;
import com.wxhao.entity.UserEntity;

public class BaseDaoImpl<T, PK extends Serializable>  implements BaseDao<T, PK >{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Class<T> entityClass;
	
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		Type type = getClass().getGenericSuperclass();
		Type[] parameterizedType = ((ParameterizedType) type).getActualTypeArguments();
		entityClass = (Class<T>) parameterizedType[0];
	}
	
	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	
	@SuppressWarnings("unchecked")
	public T load(PK id) {
		return (T) this.getCurrentSession().load(entityClass, id);
	}

	@SuppressWarnings("unchecked")
	public T get(PK id) {
		return (T) this.getCurrentSession().get(entityClass, id);
	}

	public List<T> findAll() {
		List<T> list = this.getCurrentSession().createQuery("from UserEntity").setCacheable(true).list();
		return list;
	}

	public void persist(T entity) {
		this.getCurrentSession().persist(entity);
	}

	@SuppressWarnings("unchecked")
	public PK save(T entity) {
		return (PK) this.getCurrentSession().save(entity);
	}

	public void saveOrUpdate(T entity) {
		this.getCurrentSession().saveOrUpdate(entity);
		
	}

	public void delete(PK id) {
		T entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	public void flush() {
		this.getCurrentSession().flush();
	}

}
