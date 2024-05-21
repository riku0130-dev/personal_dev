package com.example.demo.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public int add(AccountDataInterface item) {
		System.out.println("Service:add [" + item.getUserid() + "]");
		if (item instanceof Account) {
			Account savedItem = accountRepository.saveAndFlush((Account) item);
			return savedItem.getId();
		}
		return 0;
	}

	public Account findByUserId(String userId) {
		return accountRepository.findByUserId(userId);
	}

}
