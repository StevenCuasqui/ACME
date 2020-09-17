package acme.empleados.controllers;

import java.util.List;

import acme.models.Employee;
import acme.models.Workday;

public class PersonnelController {
	
	//It's important to notice that the work done by an employee in a week 
	//can be represented like a matrix (dayWorked,startHourWork) 
	//Payment will be calculated for each period (hour by hour) worked
	public double calculateEmployeePayment(Employee employee) {
		List<Workday> weekWork = employee.getWeeklyWork(); 
		double payment = 0;
		int a,b,c,remainder;
		
		//Iterate each day of the weekWork
		for(int i = 0; i < weekWork.size(); i++) {
			
			a = transformDay(weekWork.get(i).getDay());
			
			b = Integer.parseInt(weekWork.get(i).getStartHour()); 
			c = Integer.parseInt(weekWork.get(i).getEndHour());
			
			remainder = c - b;
			//Iterate all the periods a person has worked in a day
			for( int j = 0 ; j < remainder ; j++) {
				payment += hourPayment(a,b);
				b++;
			}	

		}
		
		return payment;
	}
	
	//The function receives day transformed as X and startHourWork as Y
	public double hourPayment(int i, int j) {
		double value;
		
		//Business Logic
		if(i <= 4 ) {
			if( j <= 8 ) {
				value = 25;
			}else if( j > 8 && j <=17) {
				value = 15;
			}else {
				value = 20;
			}
		}else {
			if( j <= 8 ) {
				value = 30;
			}else if( j > 8 && j <=17) {
				value = 20;
			}else {
				value = 25;
			}
		}
		return value;
	}
	
	//Assign a numeric value to a day
	public int transformDay(String day){
		int abscissa = 0;
		switch(day) {
		case "MO": abscissa = 0; break;
		case "TU": abscissa = 1; break;
		case "WE": abscissa = 2; break;
		case "TH": abscissa = 3; break;
		case "FR": abscissa = 4; break;
		case "SA": abscissa = 5; break;
		case "SU": abscissa = 6; break;
		}
		return abscissa;
	}
	
}
