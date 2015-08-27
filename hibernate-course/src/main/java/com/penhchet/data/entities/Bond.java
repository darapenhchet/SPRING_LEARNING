package com.penhchet.data.entities;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="BOND")
public class Bond extends Investment{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="BOND_ID")
	private Long bondId;
	
/*	
	@Column(name="NAME")
	protected String name;
	
	@Column(name="ISSUER")
	protected String issuer;
	
	@Column(name="PURCHASE_DATE")
	private Date purchaseDate;

*/
	
	@Column(name="VALUE")
	private BigDecimal value;
	
	@Column(name="INTEREST_RATE")
	private BigDecimal interestRate;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	@Column(name="MATURITY_DATE")
	private Date maturityDate;

	public Long getBondId() {
		return bondId;
	}

	public void setBondId(Long bondId) {
		this.bondId = bondId;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	public Date getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}
	
}
