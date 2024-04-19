package beans;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Account;
import pojos.Customer;
import pojos.Gender;
import utils.HibernateUtils;

public class CustomerRegristrationBean {
	private String firstName;
	private String lastName;
	private Account accountNo;
	private String password;
	private String mobileNumber;
	private String phoneNumber;
	private String email;
	private Gender gender;
	private LocalDate dateOfBirth;
	private String address;
	private String aadharCardNumber;
	private String panCardNumber;
	private String drivingLicenseNumber;
	private String passportNumber;
	private String electionNumber;
	
	
	
	public CustomerRegristrationBean() {
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
	public Account getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Account accountNo) {
		this.accountNo = accountNo;
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
	public void registerCandidate()
	{
		Session session=HibernateUtils.getFactory().getCurrentSession();
		Transaction tx=session.beginTransaction();
		try {
			Customer customer=new Customer();
			customer.setFirstName(firstName);
			customer.setLastName(lastName);
			customer.setMobileNumber(mobileNumber);
			customer.setPhoneNumber(phoneNumber);
			customer.setAddress(address);
			customer.setDateOfBirth(dateOfBirth);
			customer.setDrivingLicenseNumber(drivingLicenseNumber);
			customer.setElectionNumber(electionNumber);
			customer.setEmail(email);
			customer.setDrivingLicenseNumber(drivingLicenseNumber);
			customer.setGender(gender);
			System.out.println("Regristration Successful");
			session.save(customer);
			
			tx.commit();
		}catch (Exception e) {
			System.out.println("Regristration not Successful");
			tx.rollback();
		}
	}

}
