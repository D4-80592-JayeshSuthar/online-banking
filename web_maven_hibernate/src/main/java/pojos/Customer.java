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
	
	@OneToMany(mappedBy = )
	private Account accountNo;
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
	

}
