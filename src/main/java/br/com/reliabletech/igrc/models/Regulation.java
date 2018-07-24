package br.com.reliabletech.igrc.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class Regulation {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String name;
	
	@Lob
	private String description;
	
	@Basic
	@Temporal(TemporalType.DATE)
	private java.util.Date ruleOfRegulation;
	
	private String responsilbleArea;
	
	private String affectedProcess;
	
	private String affectedRisks;
	
	private String affectedControls;
	
	private String documents;
	
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_reg_risk", joinColumns=@JoinColumn(name="regulation_id"), inverseJoinColumns=@JoinColumn(name="risk_id"))
	private List<Risk> risk = new ArrayList<Risk>();
	
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_reg_control", joinColumns=@JoinColumn(name="regulation_id"), inverseJoinColumns=@JoinColumn(name="control_id"))
	private List<Control> control = new ArrayList<Control>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public java.util.Date getRuleOfRegulation() {
		return ruleOfRegulation;
	}

	public void setRuleOfRegulation(java.util.Date ruleOfRegulation) {
		this.ruleOfRegulation = ruleOfRegulation;
	}

	public String getAffectedProcess() {
		return affectedProcess;
	}

	public void setAffectedProcess(String affectedProcess) {
		this.affectedProcess = affectedProcess;
	}

	public String getAffectedRisks() {
		return affectedRisks;
	}

	public void setAffectedRisks(String affectedRisks) {
		this.affectedRisks = affectedRisks;
	}

	public String getAffectedControls() {
		return affectedControls;
	}

	public void setAffectedControls(String affectedControls) {
		this.affectedControls = affectedControls;
	}

	public String getDocuments() {
		return documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}

	public String getResponsilbleArea() {
		return responsilbleArea;
	}

	public void setResponsilbleArea(String responsilbleArea) {
		this.responsilbleArea = responsilbleArea;
	}
	
}
