package com.laurence.account.rest;

import org.springframework.laurenceweb.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laurence.account.data.domain.Prize;
import com.laurence.account.service.AccountPrizeService;

@RestController
@RequestMapping("/account")
public class AccountPrizeController {
	private AccountPrizeService service;

	public AccountPrizeController(AccountPrizeService service) {
		super();
		this.service = service;
	}

	@GetMapping("/prize/{accountNumber}")
	public Prize create(@PathVariable String accountNumber) {
		return this.service.decidePrize(accountNumber);
	}

}
