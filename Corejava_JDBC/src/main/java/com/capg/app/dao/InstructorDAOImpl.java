package com.capg.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capg.app.bean.Instructor;
import com.capg.app.dto.InstructorsLocationCountDTO;
import com.capg.app.exception.InstructorNotFoundException;

public class InstructorDAOImpl implements InstructorDAO {

	Connection con;
	PreparedStatement ps;
	
	public InstructorDAOImpl(){
		con = DatabaseUtil.con; // no need to create Util Class for all users/ one shared class
	}
	
	
	
	public boolean insertInstructor(Instructor instructor)throws SQLException {
		
		boolean isInserted = false;
		
		int code = instructor.getInstructorCode();
		String name = instructor.getName();
		String email = instructor.getEmail();
		String location = instructor.getTrainerLocation();
		int salary = instructor.getSalary();
		int jobStartYear = instructor.getJobStartYear();
		
		
		String query = "insert into Instructor values(?,?,?,?,?,?)";
		
		ps = con.prepareStatement(query);
		ps.setInt(1, code);
		ps.setString(2,name);
		ps.setInt(3, salary);
		ps.setInt(4, jobStartYear);
		ps.setString(5,email);
		ps.setString(6,location);
		
		int i = ps.executeUpdate();
		
		if(i == 1) isInserted = true;
		
		return isInserted;
	}

	public Instructor getInstructorByCode(int code) throws InstructorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Instructor> getInstructors() throws SQLException {
		
		
		String sqlQuery = "select * from instructor";
		ps = con.prepareStatement(sqlQuery);
		
		ResultSet rs = ps.executeQuery();
		List<Instructor> list = new ArrayList<Instructor>();
		
		while(rs.next())
		{
			int code = rs.getInt("instructorCode");
			String name = rs.getString("name");
			String email = rs.getString("email");
			String location = rs.getString("trainerlocation");
			int salary = rs.getInt("salary");
			int jobStartYear = rs.getInt("jobStartYear");
			
		
			list.add(new Instructor(code, name, salary, jobStartYear, email, location));
			
		}
		
		
		return list;
	}

	public List<Instructor> getInstructorsByLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<InstructorsLocationCountDTO> getInstructorsCountByLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Instructor> getInstructorsBySalary() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean delteInstructorByCode(int code) throws InstructorNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	public Instructor updateInstructor(Instructor oldInfoInstructor) {
		// TODO Auto-generated method stub
		return null;
	}

}