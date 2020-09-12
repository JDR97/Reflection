package com.plural.reflections;

import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		
		MetaPerson<Person> metaPerson = MetaPerson.of(Person.class);

		PrimaryKey primaryKey = metaPerson.getPrimaryKey();
		List<Columns> columns = metaPerson.getColumns();
		
		System.out.println("Primary Key = "+primaryKey.getName()+ ", type = "+primaryKey.getType().getSimpleName());
		
		
		columns.forEach(c -> System.out.println("Other cols = "+c.getName()+", type = "+c.getType().getSimpleName()));
		
	}

}
