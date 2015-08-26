package com.penhchet.data.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT")
public class Account {

	@Id
	private Long accountId;
	
	private Bank bank;
	
	private List<Transaction> transactions = new ArrayList<Transaction>();
	
	private AccountType accountType;
	
	private String name;
}
