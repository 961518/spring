package com.jpaexample.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentCommandLineRunner implements CommandLineRunner{


	@Autowired
	private StudentJpaRepository repository;
	
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Student(1, "John", "Taliyya"));
		repository.insert(new Student(2, "Mark", "Budhwara"));
	
		
	repository.deleteById(1);
		
	System.out.println(repository.findById(1));
	System.out.println(repository.findById(2));
		
		

		
	}



}