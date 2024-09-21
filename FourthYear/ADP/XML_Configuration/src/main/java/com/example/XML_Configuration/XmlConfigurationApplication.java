package com.example.XML_Configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;


@SpringBootApplication
public class XmlConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlConfigurationApplication.class, args);
		System.out.println("Student Details");
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resources/config.xml");
		Student student1 = (Student)context.getBean("student1");
		System.out.println(student1.getStudentId());
		System.out.println(student1.getStudentName());
		System.out.println(student1.getStudentId());
		
	}

}
