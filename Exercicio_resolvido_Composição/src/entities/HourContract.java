package entities;

import java.util.Date;

public class HourContract {
	
	private Date date;
	private Double valeuPerHour;
	private Integer hour;
	
	public HourContract() {
	}

	public HourContract(Date date, Double valeuPerHour, Integer hour) {
		this.date = date;
		this.valeuPerHour = valeuPerHour;
		this.hour = hour;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValeuPerHour() {
		return valeuPerHour;
	}

	public void setValeuPerHour(Double valeuPerHour) {
		this.valeuPerHour = valeuPerHour;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}
	
	public Double totalValeu() {
		return valeuPerHour * hour;
	}

}
