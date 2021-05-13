package com.cg.eis.pl;

import com.cg.eis.bean.*;
import com.cg.eis.service.*;

public class EmployeeApp {

	public EmployeeApp() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		EmployeeServiceClass employeeService = new EmployeeServiceClass();
		employeeService.getDetailsAndFindSchema();
	}

}