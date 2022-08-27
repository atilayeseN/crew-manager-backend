package atisoft.crewmanager.models;

import java.util.Arrays;
import java.util.Objects;

import org.springframework.data.annotation.Id;

public class Crew {
	
	@Id
	private String id;
	
	private String firstName;
	
	private String lastName;
	
	private String nationality;
	
	private String title;
	
	private String certificates[];
	
	private Integer daysOnBoard;
	
    private Integer dailyRate;
	
	private Currency currency;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getCertificates() {
		return certificates;
	}

	public void setCertificates(String[] certificates) {
		this.certificates = certificates;
	}

	public Integer getDaysOnBoard() {
		return daysOnBoard;
	}

	public void setDaysOnBoard(Integer daysOnBoard) {
		this.daysOnBoard = daysOnBoard;
	}

	public Integer getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(Integer dailyRate) {
		this.dailyRate = dailyRate;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Crew other = (Crew) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Crew [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", nationality=" + nationality
				+ ", title=" + title + ", certificates=" + Arrays.toString(certificates) + ", daysOnBoard="
				+ daysOnBoard + ", dailyRate=" + dailyRate + ", currency=" + currency + "]";
	}
	
	
	
}
