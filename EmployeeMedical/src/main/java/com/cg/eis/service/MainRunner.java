package com.cg.eis.service;
import java.util.List;
import java.util.Scanner;
import com.cg.eis.bean.Employee;
import com.cg.eis.pl.Service;
import com.cg.eis.pl.EmployeeService;



public class MainRunner {
	
	static Scanner sc = new Scanner(System.in);
	
	static Service ser = new Service();
	static Employee emp = new  Employee();
	
	public static void main(String[] args) {
		
		
		MainRunner obj = new MainRunner();
		
		while(true) {
			System.out.println("Enter your choice: ");
			System.out.println("1. Enter employee"+"\n"+"2. Display employees\n"+"0. Exit");
			int n = Integer.parseInt(sc.nextLine());
			switch(n) {
			case 1: 
				obj.insertEmp();
				break;
			case 2:
				obj.displayEmployees();
				break;
			case 0:
				System.exit(0);
				
			}
			
		}

	}
	
	public static void insertEmp() {
		
		int id = Integer.parseInt(sc.nextLine());
		String name = sc.nextLine();
		int salary = Integer.parseInt(sc.nextLine());
		String designation = sc.nextLine();
		ser.insertEmployee(new Employee(id, name, salary, designation, designation));
		
		
		
	}
	
	public void displayEmployees()
	{
		System.out.println("\n-------------- Employee's Information ----------------\n");
		List<Employee> empList = ser.getAllEmployees();
		
		iterateEmployeeList(empList);
		
			}
	
	public void displayEmployee(Employee e)
	{
		System.out.println("\n____________________________________________________\n");
		System.out.println(" Name : "+e.getName());
		System.out.println(" ID : "+e.getId());
		System.out.println(" Salary : "+e.getSalary());
		System.out.println(" Designation : "+e.getDesignation());
		System.out.println(" Insurance Scheme : "+e.getInsuranceScheme());
		System.out.println("\n____________________________________________________\n");
		
		
	}
	
	
	public void iterateEmployeeList(List<Employee> empList) {
		
		for (Employee employee : empList) {
			displayEmployee(employee);
		}

		
	}

}