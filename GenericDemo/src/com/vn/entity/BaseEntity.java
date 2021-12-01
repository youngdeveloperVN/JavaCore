package com.vn.entity;

import java.io.Serializable;

public class BaseEntity<T extends Serializable> implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaseEntity() {
		
	}
	
	public BaseEntity(Serializable id) {
		this.id = id;
	}
	
	private Serializable id;

	public Serializable getId() {
		return id;
	}

	public void setId(Serializable id) {
		this.id = id;
	}

}
