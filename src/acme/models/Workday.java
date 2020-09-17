package acme.models;

public class Workday {
	private String day;
	private String startHour;
	private String endHour;
	
	public Workday(String day, String startHour, String endHour) {
		super();
		this.day = day;
		this.startHour = startHour;
		this.endHour = endHour;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String dia) {
		this.day = dia;
	}

	public String getStartHour() {
		return startHour;
	}

	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}

	public String getEndHour() {
		return endHour;
	}

	public void setEndHour(String endHour) {
		this.endHour = endHour;
	}

	@Override
	public String toString() {
		return "Workday [day=" + day + ", startHour=" + startHour + ", endHour=" + endHour + "]";
	}

	
}
