package com.capg.jpa.p1;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "Course_Table")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int course_code;
	private String course;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Student_Course", joinColumns = @JoinColumn(name = "Course_code"), inverseJoinColumns = @JoinColumn(name = "roll"))
	private List<Student> students;

	public int getCourse_code() {
		return course_code;
	}

	public void setCourse_code(int course_code) {
		this.course_code = course_code;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Course(int course_code, String course, List<Student> students) {
		super();
		this.course_code = course_code;
		this.course = course;
		this.students = students;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + course_code;
		result = prime * result + ((students == null) ? 0 : students.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (course_code != other.course_code)
			return false;
		if (students == null) {
			if (other.students != null)
				return false;
		} else if (!students.equals(other.students))
			return false;
		return true;
	}
	
	
}