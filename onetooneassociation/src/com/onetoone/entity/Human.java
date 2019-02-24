package com.onetoone.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Human {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "HUMAN_SEQ")
	@Column(name = "HUMAN_ID")
	private int humanId;

	@Column(name = "HUMAN_NAME")
	private String humanName;

	@OneToOne(cascade = { CascadeType.PERSIST})
	@JoinColumn(name = "PASSPORT_ID")
	private Passport passport;

	public Human() {
		super();
	}

	public Human(String humanName, Passport passport) {
		super();
		this.humanName = humanName;
		this.passport = passport;
	}

	public int getHumanId() {
		return humanId;
	}

	public void setHumanId(int humanId) {
		this.humanId = humanId;
	}

	public String getHumanName() {
		return humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "Human [humanId=" + humanId + ", humanName=" + humanName + ", passport=" + passport + "]";
	}

}
