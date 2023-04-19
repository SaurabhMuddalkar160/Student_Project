package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.configure.MyConfiguration;
import com.model.Student;

import dao.StudentDao;


public class App {
	
	
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		StudentDao sd = context.getBean(StudentDao.class);
		
				/*
				Student s = new Student();
				s.setSname("Sagar Bhople");
				s.setScity("Akola");
				s.setSpercentage(86.56);
				System.out.println(sd.insertStudent(s));
				*/
		//System.out.println(sd.deleteStudent(3));
		//System.out.println(sd.findStudentFromSid(4));
		Student s= sd.findStudentFromSid(5);
		s.setSname("Kusha Deshmikh");
		System.out.println(sd.updateStudent(s));
			
	
	}
	
  
}
