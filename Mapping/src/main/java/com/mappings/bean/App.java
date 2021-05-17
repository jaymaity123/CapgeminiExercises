package com.mappings.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	
	public static void main(String[] args) {
		
		Laptop laptop = new Laptop();
		laptop.setLid(101);
		laptop.setLname("Dell");
		
		Laptop laptop1 = new Laptop();
		laptop1.setLid(102);
		laptop1.setLname("HP");
		
		Student s = new Student();
		s.setRollno(1);
		s.setName("Jaydeep");
		s.setMarks(98);
		laptop.setStd(s);
		laptop1.setStd(s);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
		SessionFactory sf = con.buildSessionFactory();
		Session sesion = sf.openSession();
		
		sesion.beginTransaction();
		
		sesion.save(laptop);
		sesion.save(laptop1);
		
		sesion.save(s);
		
		sesion.getTransaction().commit();
		System.out.println(s);
		System.out.println(laptop);
	}

}
