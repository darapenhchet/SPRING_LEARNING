package com.penhchet.data.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="BUDGET")
public class Budget {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BUDGET_ID")
	private Long budgetId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="GOAL_AMOUNT")
	private BigDecimal goalAmount;
	
	@Column(name="PERIOD")
	private String peroid;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name="BUDGET_TRANSACTION",
			   joinColumns = @JoinColumn(name="BUDGET_ID"),
			   inverseJoinColumns = @JoinColumn(name="TRANSACTION_ID"))
	private List<Transaction> transactions = new ArrayList<Transaction>();

	public Long getBudgetId() {
		return budgetId;
	}

	public void setBudgetId(Long budgetId) {
		this.budgetId = budgetId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getGoalAmount() {
		return goalAmount;
	}

	public void setGoalAmount(BigDecimal goalAmount) {
		this.goalAmount = goalAmount;
	}

	public String getPeroid() {
		return peroid;
	}

	public void setPeroid(String peroid) {
		this.peroid = peroid;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	
	
}
