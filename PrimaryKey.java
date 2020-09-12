package com.plural.reflections;

import java.lang.reflect.Field;

public class PrimaryKey {

	
	private Field f;

	public PrimaryKey(Field f) {
		this.f = f;
		
		
	}

	public String getName() {
		return f.getName();
	}

	public Class<?> getType() {
		return f.getType();
	}

}
