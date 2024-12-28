package com.example.Lesson_16;

import dao.Impl.StudentImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"java", "dao.Impl"})
public class Lesson16Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Lesson16Application.class, args);

		StudentImpl studentDao = context.getBean(StudentImpl.class);

		// Create students
		studentDao.create(new Student(1, "Leon", 23));
		studentDao.create(new Student(2, "Sam", 34));

		// Read all students
		System.out.println("All Students:");
		studentDao.readAll();

		// Read specific student
		System.out.println("Read Student with ID 1:");
		studentDao.read(1);

		// Update a student
		System.out.println("Updating Student with ID 1:");
		studentDao.update(1, new Student(1, "Daniel", 45));

		// Delete a student
		System.out.println("Deleting Student with ID 2:");
		studentDao.delete(2);

		// Read all students after deletion
		System.out.println("All Students after deletion:");
		studentDao.readAll();
	}

}
