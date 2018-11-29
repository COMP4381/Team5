package com.comp4382.ass3.assignment3.student;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {

	@JsonProperty(value = "number")
	private String number;
	@JsonProperty(value = "fullname")
	private String Fullname;
	@JsonProperty(value = "phone")
	private String phone;

	@JsonCreator
	public Student(String number, String fullname, String phone) {
		super();
		this.number = number;
		Fullname = fullname;
		this.phone = phone;
	}

}