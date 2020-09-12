package com.plural.reflections;

public interface EntityManager<T> {

	static <T> EntityManager<T> of(Class<T> class1) {
		return new EntityManagerImpl<>();
	}

	
	void persist(T t);
}
