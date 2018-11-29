package com.comp4382.ass3.assignment3.exchange;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Exchange {
	@JsonProperty(value = "from")
	private String from;
	@JsonProperty(value = "to")
	private String to;
	@JsonProperty(value = "semesters")
	private int semesters;
	@JsonProperty(value = "year")
	private String year;

	@JsonCreator
	public Exchange(String from, String to, int semesters, String year) {
		super();
		this.from = from;
		this.to = to;
		this.semesters = semesters;
		this.year = year;
	}

	public Exchange() {
		// TODO Auto-generated constructor stub
	}

}