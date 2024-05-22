package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	public ResponseEntity<String> login(@RequestParam String userid, String password) {
		System.out.println("Controller:login(post)");
		Account existingAccount = accountService.findByUserid(userid);
		System.out.println(userid);
		if (existingAccount == null || !existingAccount.getPassword().equals(password)) {
			return ResponseEntity.status(401).body("Invalid credentials");
		}
		return ResponseEntity.ok("Login successful");
	}

}
