package com.adil.dependency_injection_object_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = context.getBean("std", Student.class);
		student.cheating();

		AnotherStudent otherStd = context.getBean("other", AnotherStudent.class);
		otherStd.cheating();
	}
}
