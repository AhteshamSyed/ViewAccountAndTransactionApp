package com.app.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class AccountListEnquiry {


   @Id
   private long accountNumber;
   private String accountName;
   private String accountType;
   private LocalDate date;
   private String currency;
   private long openingBalanceAvailable;
	
	  @OneToMany(//mappedBy = "accountlistEnquiry",
			  cascade = CascadeType.ALL,
	  orphanRemoval = true) @JoinColumn(name="accountNumber")  
	  private Set<AccountTransactionEnquiry>
	  accountTransactionEnquiries= new HashSet<>();
	 
}
