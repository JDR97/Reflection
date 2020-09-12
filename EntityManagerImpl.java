package com.plural.reflections;

import java.sql.PreparedStatement;

public class EntityManagerImpl<T> implements EntityManager<T> {

	@Override
	public void persist(T t) {
		
		
		MetaPerson<Person> metaPerson = new MetaPerson<Person>(t.getClass());
		String sql = metaPerson.buildInsertReq();
		//PreparedStatement preparedStatement = prepareStatementWith().andParameters(t);
		
		//preparedStatement.executeUpdate();
		
	}

	
}
