package com.jpaexample.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CityCommandLineRunner implements CommandLineRunner{


	@Autowired
	private CityJpaRepository repository;
	
	City c1=new City(4,"Flutter","Ai Bridge");
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new City(1, "JAVA", "AI Bridge"));
		repository.insert(new City(2, "Angular", "AI Bridge"));
		repository.insert(new City(3, "Python", "AI Bridge"));
		repository.insert(new City(5, "MEAN", "AI Bridge"));
		repository.insert(new City(6, "MERN", "AI Bridge"));
				repository.insert(c1);
		
	repository.deleteById(2);
		
	System.out.println(repository.findById(2));
	System.out.println(repository.findById(5));
		
		

		
	}



}