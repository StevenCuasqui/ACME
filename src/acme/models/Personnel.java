package acme.models;

import java.util.ArrayList;
import java.util.List;

public class Personnel {
	private List<Employee> employees = new ArrayList<Employee>();
	
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Personnel = \n "+employees;
	}

	
	
}
