package com.qio.report.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Casee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "case_id")
	private Long caseId;
	
	@Column(name = "case_reason")
	private String caseReason;

	@OneToOne(mappedBy = "casee")
	private Thief thief;

	public Casee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Casee(Long caseId, String caseReason, Thief thief) {
		super();
		this.caseId = caseId;
		this.caseReason = caseReason;
		this.thief = thief;
	}

	public Long getCaseId() {
		return caseId;
	}

	public void setCaseId(Long caseId) {
		this.caseId = caseId;
	}

	public String getCaseReason() {
		return caseReason;
	}

	public void setCaseReason(String caseReason) {
		this.caseReason = caseReason;
	}

	public Thief getThief() {
		return thief;
	}

	public void setThief(Thief thief) {
		this.thief = thief;
	}

	@Override
	public String toString() {
		return "Casee [caseId=" + caseId + ", caseReason=" + caseReason + ", thief=" + thief + "]";
	}
	
	
	


}
