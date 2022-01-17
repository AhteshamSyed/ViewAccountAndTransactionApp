package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.AccountListEnquiry;


@Repository
public interface AccountListAndTransactionEnquiryRepository extends JpaRepository
<AccountListEnquiry, Long>{

	
	
	
}
