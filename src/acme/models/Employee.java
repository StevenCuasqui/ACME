package acme.models;

import java.util.List;

public class Employee {
	private String name;
	private List<Workday> weeklyWork;
	private double payment;

	public Employee(String name, List<Workday> weeklyWork, double payment) {
		super();
		this.name = name;
		this.weeklyWork = weeklyWork;
		this.payment = payment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public List<Workday> getWeeklyWork() {
		return weeklyWork;
	}

	public void setWeeklyWork(List<Workday> weeklyWork) {
		this.weeklyWork = weeklyWork;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", weeklyWork=" + weeklyWork + ", payment=" + payment+"\n";
	}

	
}
