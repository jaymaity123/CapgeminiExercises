package com.capg.app.service;

import java.sql.SQLException;
import java.util.List;

import com.capg.app.bean.Instructor;
import com.capg.app.dao.InstructorDAO;
import com.capg.app.dao.InstructorDAOImpl;
import com.capg.app.dto.InstructorsLocationCountDTO;
import com.capg.app.exception.InstructorNotFoundException;

public class InstructorServiceImpl implements InstructorService {

	InstructorDAO dao;
	
	public InstructorServiceImpl() {
		dao = new InstructorDAOImpl();
	}

	public boolean insertInstructor(Instructor instructor)throws SQLException {
		
		boolean isQueryExecuted = false;
		
		// --- call business Server side validations
		
		// call Security layer 
		
		isQueryExecuted = dao.insertInstructor(instructor);
		
		// call Logger task
		
		return isQueryExecuted;
	}

	public Instructor getInstructorByCode(int code) throws InstructorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Instructor> getInstructors() throws SQLException{
		
		return dao.getInstructors();
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