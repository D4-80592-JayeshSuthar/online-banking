package pojos;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer extends BaseEntity{
	
	@Column(length = 25, nullable = false)
	private String firstName;
	@Column(length = 25, nullable = false)
	private String lastName;
	
//	@OneToMany(mappedBy = )
//	private Account accountNo;
	@Column(length = 20, nullable = false)
	private String password;
	@Column(length = 10)
	private String mobileNumber;
	
	@Column(length=11)
	private String phoneNumber;
	@Column(length = 30, nullable = false)
	private String email;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	
	private LocalDate dateOfBirth;
	@Column(length = 200)
	private String address;
	@Column(length = 12)
	private String aadharCardNumber;
	@Column(length = 10)
	private String panCardNumber;
	@Column(length = 16)
	private String drivingLicenseNumber;
	@Column(length = 12)
	private String passportNumber;
	@Column(length = 15)
	private String electionNumber;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAadharCardNumber() {
		return aadharCardNumber;
	}
	public void setAadharCardNumber(String aadharCardNumber) {
		this.aadharCardNumber = aadharCardNumber;
	}
	public String getPanCardNumber() {
		return panCardNumber;
	}
	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}
	public String getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}
	public void setDrivingLicenseNumber(String drivingLicenseNumber) {
		this.drivingLicenseNumber = drivingLicenseNumber;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getElectionNumber() {
		return electionNumber;
	}
	public void setElectionNumber(String electionNumber) {
		this.electionNumber = electionNumber;
	}
	
	
	

}
