package com.ty.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.beans.Student;

public class Driver {
	public static void main(String[] args) 
	{
		String config_file_loc ="/com/ty/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(config_file_loc);
		Student student = (Student) context.getBean("studId");
				student.Display();
	}

}
