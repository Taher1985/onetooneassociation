package com.onetoone.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "PASSPORT_SEQ")
	@Column(name = "PASSPORT_ID")
	private int passportId;

	@Column(name = "PASSPORT_NUMBER")
	private String passportNumber;

	@OneToOne(mappedBy = "passport", cascade = CascadeType.REMOVE)
	private Human human;

	public Passport() {
		super();
	}

	public Passport(String passportNumber) {
		super();
		this.passportNumber = passportNumber;
	}

	public int getPassportId() {
		return passportId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Human getHuman() {
		return human;
	}

	public void setHuman(Human human) {
		this.human = human;
	}

	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportNumber=" + passportNumber + "]";
	}

}
