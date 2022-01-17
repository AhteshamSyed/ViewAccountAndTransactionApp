package com.app.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class AccountTransactionEnquiry {
	@Id
	private long accountNumber;
	private String accountName;
	private LocalDate valueDate;
	private String currency;
	private long debitAmount;
	private long creditAmount;
	private String action;         //credit or debit
	private String transactionNarrative;
	
	
	
	/*
	 * @ManyToOne(fetch = FetchType.LAZY) private AccountListEnquiry
	 * accountlistEnquiry;
	 */
	 
	 
}
