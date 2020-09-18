package acme.employees.controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import acme.models.Employee;
import acme.models.Workday;

public class InputController {
	
	//Array to read the Text File
	private List<String> textLines = new ArrayList<String>();
	
	//Array that with save the Actual Employees Info
	private List<Employee> listEmployees = new ArrayList<Employee>();

	public void readFile(File f) {
		
		try {
			BufferedReader b = new BufferedReader(new FileReader(f));
    		String readLine = "";
    		
			while ((readLine = b.readLine()) != null) {
				
				this.textLines.add(readLine);
				
				}
			
				b.close();
				saveTextLinesInEmployeeList();
				
		} catch (IOException e) {
				e.printStackTrace();
		}
	}
	
	public void saveTextLinesInEmployeeList() {
		
		for(int i = 0; i < this.textLines.size() ; i++) {

			String employeeData = this.textLines.get(i);
			
			String[] employeeDataDiv = employeeData.split("=");
			
			String employeeName = employeeDataDiv[0];
			String[] weekWork = employeeDataDiv[1].split(",");
			
			List<Workday> completeWeek = new ArrayList<Workday>();
			
			//Iterate the weekWork StringArray to get the day,workHours of the string and Save it into the array of WorkDays
			for(int j = 0 ; j<weekWork.length ; j++) {
				
				Workday actualWorkDay = saveTextAsDayWork(weekWork[j]);
				completeWeek.add(actualWorkDay);
				
			}
			
			this.listEmployees.add(new Employee(employeeName,completeWeek,0.0));
			
		}	
		
	}
	
	public Workday saveTextAsDayWork(String workDayString) {
		
		Workday workDayActual;
		String day = workDayString.substring(0, 2);
		String startHour = workDayString.substring(2,4);
		String endHour = workDayString.substring(8, 10);
		workDayActual = new Workday(day,startHour,endHour);
		return workDayActual;
		
	}
	
	public List<Employee> getEmployeesListInfo() {
		return this.listEmployees;
	}
	
           
}
