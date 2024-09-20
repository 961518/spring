package com.jpaexample.city;

import org.springframework.stereotype.Repository;



import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CityJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public void insert(City city) {
		entityManager.merge(city);
	}
	
	public City findById(long id) {
		return entityManager.find(City.class, id);
	}

	
	public void deleteById(long id) {
		City city = entityManager.find(City.class, id);
		entityManager.remove(city);
		
		
	}
	
}