package com.example.demo.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Account;
import com.example.demo.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public int add(Account item) {
		System.out.println("Service:add [" + item.getUserid() + "]");
		Account savedItem = accountRepository.saveAndFlush(item);
		return savedItem.getId();
	}

	public Account findByUserid(String userid) {
		return accountRepository.findByUserid(userid);
	}

}
