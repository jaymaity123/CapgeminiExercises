package com.map.manymany.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.capg.jpa.p1.Student;
import com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase;

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
		
		Student s1 = new Student();
		s1.setRollno(2);
		s1.setName("Stuti");
		s1.setMarks(99);
		
		/*s.getLaptop().add(laptop1);
		s.getLaptop().add(laptop);
		
		s1.getLaptop().add(laptop);
		s1.getLaptop().add(laptop1);
		*/
		List<Student> student1 = new ArrayList<Student>();
		student1.add(s1);
		student1.add(s);
		
		List<Laptop> lap = new ArrayList<Laptop>();
		lap.add(laptop);
		lap.add(laptop1);
		
		s.setLaptop(lap);
		s1.setLaptop(lap);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
		SessionFactory sf = con.buildSessionFactory();
		Session sesion = sf.openSession();
		
		sesion.beginTransaction();
		
		sesion.save(laptop);
		sesion.save(laptop1);
		
		sesion.save(s);
		sesion.save(s1);
		
		sesion.getTransaction().commit();
		System.out.println(s);
		System.out.println(laptop);
	}

}
