package com.penhchet.data.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction {

	@Id
	private Long transactionId;
	
	private Account account;
	
	private String transactionType;
	
	private BigDecimal amount;
	
	private BigDecimal initialBalance;
	
	private BigDecimal closingBalanace;

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(BigDecimal initialBalance) {
		this.initialBalance = initialBalance;
	}

	public BigDecimal getClosingBalanace() {
		return closingBalanace;
	}

	public void setClosingBalanace(BigDecimal closingBalanace) {
		this.closingBalanace = closingBalanace;
	}
	
	
}
