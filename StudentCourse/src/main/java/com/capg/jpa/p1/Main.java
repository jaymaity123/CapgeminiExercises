package com.capg.jpa.p1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	public static void main(String[] args) {
		
		Main obj = new Main();
		Configuration cfg = new Configuration();
		SessionFactory fac = cfg.configure().buildSessionFactory();
		Session session = fac.openSession();
		Student std1 = obj.getStudents(); 
		Student std2 = obj.getStudents(); 
		Course course1 = obj.getCourse(); 
		Course course2 = obj.getCourse();
		List<Course> courseList1 = new ArrayList<Course>();  ///----- Creating collections----
		courseList1.add(course1);
		courseList1.add(course2);
		List<Student> student1 = new ArrayList<Student>(); // -------- Creating collections for  Student to Course ---------
		student1.add(std1);
		student1.add(std2);
		std1.setCourseList(courseList1);  // ------------ Adding Collection of Course to student ----- 
		std2.setCourseList(courseList1);			
		course1.setStudents(student1);  // ------------ Adding Collection of Student to Course ----- 
		course2.setStudents(student1);		
		Transaction t = session.beginTransaction();
		session.save(std1);
		session.save(std2);	
		session.save(course1);
		session.save(course2);	
		t.commit();
		System.out.println(" Data Saved");	
	}
	
	public Student getStudents()
	{
		Student std = new Student();
		System.out.println("Enter Student  Name ");
		std.setStudent(new Scanner(System.in).nextLine());
		System.out.println("Enter Roll");
		std.setRoll(new Scanner(System.in).nextInt());
		System.out.println("Name = "+std.getStudent() + "Rollno="+std.getRoll());
		
		return std;
	}
	
	public Course getCourse()
	{
		Course course = new Course();
		System.out.println("Enter Course Name ");
		course.setCourse(new Scanner(System.in).nextLine());
		System.out.println("Enter Course code ");
		course.setCourse_code(new Scanner(System.in).nextInt());
		return course;
	}

}