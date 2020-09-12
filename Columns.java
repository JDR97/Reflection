package com.plural.reflections;

import java.lang.reflect.Field;

public class Columns {

	private Field f;

	public Columns(Field f) {
		this.f = f;
		
	}

	public String getName() {
		return f.getName();
	}

	public Class<?> getType() {
		return f.getType();
	}

}
