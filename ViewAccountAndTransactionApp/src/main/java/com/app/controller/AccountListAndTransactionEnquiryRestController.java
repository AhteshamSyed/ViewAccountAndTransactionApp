package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.AccountListEnquiry;
//import com.app.model.AccountTransactionEnquiry;
import com.app.service.IAccountListAndTransactionEnquiryService;

@RestController
@RequestMapping("/accountListAndTransactionEnquiry")
public class AccountListAndTransactionEnquiryRestController {
	//IAccountListAndTransactionEnquiryService
	
	@Autowired
	IAccountListAndTransactionEnquiryService service;

	@GetMapping("/all")
	public ResponseEntity<List<AccountListEnquiry>>getAllAccount(){
		List<AccountListEnquiry>list=service.getAllAccountList();
		return new ResponseEntity<List<AccountListEnquiry>>
		(list,HttpStatus.OK);

	}


	@GetMapping("/one/{id}") public ResponseEntity<AccountListEnquiry>
	getOneAccountTransactionDetails(

			@PathVariable Long id){ AccountListEnquiry ate =
			service.getOneAccountTransactionDetail(id);

			return new ResponseEntity<AccountListEnquiry> (ate,HttpStatus.OK);

	}

}
