package com.plural.reflections;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class MetaPerson<T> {

	private Class<? extends Object> clss;
	
	public MetaPerson(Class<? extends Object> class1) {
		this.clss = class1;
	}

	public static <T> MetaPerson<T> of(Class<T> clss){
		return new MetaPerson<T>(clss);
	}

	public PrimaryKey getPrimaryKey() {
		
		Field[] field = clss.getDeclaredFields();
		for(Field f:field){
			PrimaryCol primaryCol = f.getAnnotation(PrimaryCol.class);
			if(primaryCol != null){
				PrimaryKey primaryKey = new PrimaryKey(f);
				return primaryKey;
			}
		}
		
		throw new IllegalArgumentException("No Primary Key Found in class "+clss.getSimpleName());
		
	}

	public List<Columns> getColumns() {
		
		List<Columns> lclmns = new ArrayList<Columns>();
		
		Field[] field = clss.getDeclaredFields();
		for(Field f:field){
			Column clmn = f.getAnnotation(Column.class);
			if(clmn != null){
				Columns clmns = new Columns(f);
				lclmns.add(clmns);
			}
		}
		
		return lclmns;
		
	}

	public String buildInsertReq() {
		return null;
		
	}

}
