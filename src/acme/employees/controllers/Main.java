package acme.employees.controllers;

import java.io.File;
import java.util.Scanner;

import acme.models.Personnel;

public class Main {
	
	private static Personnel staff;

	public static void main(String[] args) {
		
		System.out.println("Welcome to ACME payroll system");
		readTextFile();
		calculateSalaryOfStaff();
		searchEmployee();
		
		
	}

	private static void readTextFile() {
		File f = new File("data.txt");
		InputController data = new InputController();
		System.out.println("Reading the file...");
		data.readFile(f);
		System.out.println("Data read with success!");
		setStaffInfo(data);		
	}
	
	private static void setStaffInfo(InputController listOfEmployees) {
		staff = new Personnel();
		//To assign the info read from Text File to my Staff 
		staff.setEmployees(listOfEmployees.getEmployeesListInfo());
	}
	
	private static void calculateSalaryOfStaff() {
		double a;
		PersonnelController cont = new PersonnelController();
		
		//Send each employee of the Staff in order to calculate his/her salary
		for(int i = 0 ; i < staff.getEmployees().size() ; i++) {
			
			a = cont.calculateEmployeePayment(staff.getEmployees().get(i));
			staff.getEmployees().get(i).setPayment(a);
			
		}
		
	}
	
	private static void searchEmployee() {
		
		Scanner input,input2; 
    	String name="",nameComparison;
    	String check="";
    	do {
	    	System.out.println("Please, enter the name of the employee to search: ");
	       	input = new Scanner(System.in);
	        name = input.next();
	        //input.close();
	        
	        for (int i = 0; i < staff.getEmployees().size() ; i++ ) {
	        	nameComparison = staff.getEmployees().get(i).getName();
	        	
	        	if(nameComparison.equalsIgnoreCase(name)) {
	        		System.out.println("The amount to pay "+name+" is: "+staff.getEmployees().get(i).getPayment());
	        		break;
	        	}
	        	
	        	if(i == staff.getEmployees().size() - 1) {
	        		System.out.println("The employee doesn't exists");
	        	}
	        	
	        }
	        
	        System.out.println("Do you want to search again? (Press Y for confirmation, Press any key to exit )");
	        input2 = new Scanner(System.in);
	        check = input2.next();
	        
    	}while(check.equalsIgnoreCase("Y"));
    	System.out.println("Come back soon!");
    	input.close();
    	input2.close();
       	
        
        
	}
}