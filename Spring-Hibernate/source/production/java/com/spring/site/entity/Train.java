package com.spring.site.entity;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Train {

	@NotNull
	private String name;
	
	@NotNull
	@Valid
	private Station origin;
	
	@NotNull
	@Valid
	private Station desitionaton;
	
	@NotNull
	@Valid
	private Person enginerr;
	
	@NotNull
	@Valid
	private Person conductor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Station getOrigin() {
		return origin;
	}

	public void setOrigin(Station origin) {
		this.origin = origin;
	}

	public Station getDesitionaton() {
		return desitionaton;
	}

	public void setDesitionaton(Station desitionaton) {
		this.desitionaton = desitionaton;
	}

	public Person getEnginerr() {
		return enginerr;
	}

	public void setEnginerr(Person enginerr) {
		this.enginerr = enginerr;
	}

	public Person getConductor() {
		return conductor;
	}

	public void setConductor(Person conductor) {
		this.conductor = conductor;
	}
	
}
