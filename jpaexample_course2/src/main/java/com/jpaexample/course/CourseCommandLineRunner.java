package com.jpaexample.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{


	@Autowired
	private CourseJpaRepository repository;
	
	Course c1=new Course(4,"Flutter","Ai Bridge");
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "JAVA", "AI Bridge"));
		repository.insert(new Course(2, "Angular", "AI Bridge"));
		repository.insert(new Course(3, "Python", "AI Bridge"));
		repository.insert(new Course(5, "MEAN", "AI Bridge"));
		repository.insert(new Course(6, "MERN", "AI Bridge"));
				repository.insert(c1);
		
	repository.deleteById(2);
		
	System.out.println(repository.findById(2));
	System.out.println(repository.findById(5));
		
		

		
	}



}