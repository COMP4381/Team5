package com.comp4382.ass3.assignment3.exchange;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exchanges")
public class Exchange {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "from")
	private String from;

	@Column(name = "to")
	private String to;

	@Column(name = "semesters")
	private int semesters;

	@Column(name = "year")
	private String year;

	@Column(name = "deleted")
	private boolean deleted = false;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @return the semesters
	 */
	public int getSemesters() {
		return semesters;
	}

	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @return the deleted
	 */
	public boolean isDeleted() {
		return deleted;
	}

	/**
	 * @param deleted the deleted to set
	 */
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @param semesters the semesters to set
	 */
	public void setSemesters(int semesters) {
		this.semesters = semesters;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}

}