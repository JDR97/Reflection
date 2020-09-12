package com.plural.reflections;

public class Person {
	
	@PrimaryCol
	private long id;
	
	@Column
	private String name;
	
	@Column
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
	public long getId() {
		return id;
	}

	
	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person: "+getId()+", "+getName()+", "+getAge();
	}
	
	
}
