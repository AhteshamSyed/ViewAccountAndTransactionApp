package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.AccountListEnquiry;
import com.app.model.AccountTransactionEnquiry;

@Service
public interface IAccountListAndTransactionEnquiryService {

	List<AccountListEnquiry> getAllAccountList();
	AccountListEnquiry getOneAccountTransactionDetail(Long id);
}
