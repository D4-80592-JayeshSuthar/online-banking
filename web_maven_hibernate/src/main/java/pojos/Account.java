package pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "accounts")
public class Account extends BaseEntity{
	
	private Double balance;
//	private AccountType accountType;
	private Long minimumBalance;
	
	
	@Transient
	private Double savingAccountInterestRate;
	
	@Transient
	private Double currentAccountInterestRate;	
}
