package com.comp4382.ass3.assignment3.course;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Course {
	@JsonProperty(value = "code")
	private String code;
	@JsonProperty(value = "name")
	private String name;
	@JsonProperty(value = "university")
	private int universityId;

	@JsonCreator
	public Course() {
	}

	@JsonCreator
	public Course(String code, String name, int universityId) {
		super();
		this.code = code;
		this.name = name;
		this.universityId = universityId;
	}

}