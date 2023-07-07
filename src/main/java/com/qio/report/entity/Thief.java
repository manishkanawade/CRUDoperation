package com.qio.report.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Thief {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "thief_id")
	private Long thiefId;
	
	@Column(name = "thief_name")
	private String thiefName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "casee_id")
	private Casee casee;

	public Thief() {
		super();
		
	}

	public Thief(Long thiefId, String thiefName, Casee casee) {
		super();
		this.thiefId = thiefId;
		this.thiefName = thiefName;
		this.casee = casee;
	}

	public Long getThiefId() {
		return thiefId;
	}

	public void setThiefId(Long thiefId) {
		this.thiefId = thiefId;
	}

	public String getThiefName() {
		return thiefName;
	}

	public void setThiefName(String thiefName) {
		this.thiefName = thiefName;
	}

	public Casee getCasee() {
		return casee;
	}

	public void setCasee(Casee casee) {
		this.casee = casee;
	}

	@Override
	public String toString() {
		return "Thief [thiefId=" + thiefId + ", thiefName=" + thiefName + ", casee=" + casee + "]";
	}

	
		

}
