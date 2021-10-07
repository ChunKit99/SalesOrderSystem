package uml;

import java.time.LocalDate;

public class Credit extends Payment {
	private String number;
	private String type;
	private LocalDate expiredDate;
	public Credit(double amount, String number, String type, LocalDate expiredDate) {
		super(amount);
		this.number = number;
		this.type = type;
		this.expiredDate = expiredDate;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDate getExpiredDate() {
		return expiredDate;
	}
	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}
	
	
	
}
