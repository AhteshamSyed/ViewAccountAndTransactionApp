package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.exception.AccountNotFoundException;
import com.app.model.AccountListEnquiry;
import com.app.model.AccountTransactionEnquiry;
import com.app.repository.AccountListAndTransactionEnquiryRepository;



public class AccountListAndTransactionEnquiryServiceImpl implements 
IAccountListAndTransactionEnquiryService {
	@Autowired
	AccountListAndTransactionEnquiryRepository repo;
	@Override
	public List<AccountListEnquiry> getAllAccountList() {

		List<AccountListEnquiry>list= repo.findAll();
		return list;

	}

	@Override
	public AccountListEnquiry getOneAccountTransactionDetail(Long id) {
		{
			Optional<AccountListEnquiry>opt= repo.findById(id);
			AccountListEnquiry ale= opt.orElseThrow(
					()-> new AccountNotFoundException("Account Not Exist")
					);
			return ale;
		}

	}
}
