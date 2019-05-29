package com.acme.ex3.model.entity.reference;

import javax.persistence.Cacheable;
import javax.persistence.Entity;

import com.acme.ex3.model.entity.AbstractPersistentEntity;

@Entity
@Cacheable
public class Category extends AbstractPersistentEntity<Integer> {

    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
