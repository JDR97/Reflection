package com.plural.reflections;

public class WriteObj {

	public static void main(String[] args) {
		
		EntityManager<Person> em = EntityManager.of(Person.class);
		
		Person p1 = new Person("Deb", 26);
		Person p2 = new Person("Sunidhi", 26);
		Person p3 = new Person("Osman", 32);
		Person p4 = new Person("Nani", 27);
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);

	}

}
