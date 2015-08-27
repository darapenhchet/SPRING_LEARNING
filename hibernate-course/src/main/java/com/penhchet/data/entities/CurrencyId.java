package com.penhchet.data.entities;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CurrencyId implements Serializable{

	private String name;
	
	private String countryName;
	
	public CurrencyId(){
		
	}
	
	public CurrencyId(String name, String countryName){
		this.name = name;
		this.countryName = countryName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
}
