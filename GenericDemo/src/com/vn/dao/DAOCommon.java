package com.vn.dao;

import java.io.Serializable;

import com.vn.entity.BaseEntity;

public class DAOCommon<T extends BaseEntity<Serializable>> {
	
	public T entity;
	
	public <T extends BaseEntity<Serializable>> T update(T entity) {
		//update
		//session.save(entity)
		return entity;
	}

}