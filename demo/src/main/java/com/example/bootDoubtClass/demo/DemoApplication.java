package com.example.bootDoubtClass.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ac =SpringApplication.run(DemoApplication.class, args);

		A a1 = ac.getBean(A.class);
		A a2 = ac.getBean(A.class);

		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a1.b.hashCode());
		System.out.println(a2.b.hashCode());

	}

}
