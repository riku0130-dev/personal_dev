package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.AccountService;
import com.example.demo.model.Account;

@RestController
public class AuthController {

	@Autowired
	private AccountService accountService;

	@PostMapping("/add")
	@CrossOrigin
	public int add(@RequestBody Account account) {
		System.out.println("Controller:add(post)");
		return accountService.add(account);
	}

	@PostMapping("/login")
	@CrossOrigin
	public ResponseEntity<?> login(@RequestBody Account account) {
		Account existingAccount = accountService.findByUserId(account.getUserid());
		if (existingAccount == null) {
			return ResponseEntity.status(401).body("Invalid credentials");
		}
		return ResponseEntity.ok("Login successful");
	}

}
