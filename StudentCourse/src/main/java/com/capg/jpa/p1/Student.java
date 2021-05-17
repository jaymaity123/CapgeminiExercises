package com.capg.jpa.p1;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Table")
public class Student {

	@Id
	private int roll;
	private String student;
	

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Student_Course", joinColumns = @JoinColumn(name = "roll"), inverseJoinColumns = @JoinColumn(name = "course_code"))
	private List<Course> courseList;

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		courseList = courseList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseList == null) ? 0 : courseList.hashCode());
		result = prime * result + roll;
		result = prime * result + ((student == null) ? 0 : student.hashCode());
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
		Student other = (Student) obj;
		if (courseList == null) {
			if (other.courseList != null)
				return false;
		} else if (!courseList.equals(other.courseList))
			return false;
		if (roll != other.roll)
			return false;
		if (student == null) {
			if (other.student != null)
				return false;
		} else if (!student.equals(other.student))
			return false;
		return true;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String student, List<Course> courseList) {
		super();
		this.roll = roll;
		this.student = student;
		this.courseList = courseList;
	}
	
	
	
	

}