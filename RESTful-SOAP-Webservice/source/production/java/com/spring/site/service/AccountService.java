package com.spring.site.service;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.spring.site.entity.Account;

@Validated
public interface AccountService {
	
	public List<Account> getAllAccounts();
	
	public Account getAccount(long id);
	
	public Account saveAccount(
			@NotNull(message = "{validate.accountService.saveAccount.account}")
			@Valid Account account
	);
	
	public void deleteAccount(long id);
	
}
