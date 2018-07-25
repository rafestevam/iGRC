package br.com.reliabletech.igrc.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
	
	@Id //@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="guid", length=100)
	private String guid;

	@NotNull
	private String regID;
	
	@NotNull
	private String name;
	
	@Lob
	private String description;
	
	@Basic
	@Temporal(TemporalType.DATE)
	private java.util.Date ruleOfRegulation;
	
	private Boolean obsolete;
	
	private String responsibleArea;
	
	private String affectedProcess;
	
	private String affectedRisks;
	
	private String affectedControls;
	
	private String documents;
	
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})

	@JoinTable(name="jt_reg_risk", joinColumns=@JoinColumn(name="regulation_guid"), inverseJoinColumns=@JoinColumn(name="risk_guid"))
	private List<Risk> risks = new ArrayList<Risk>();
	
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})

	@JoinTable(name="jt_reg_control", joinColumns=@JoinColumn(name="regulation_guid"), inverseJoinColumns=@JoinColumn(name="control_guid"))
	private List<Control> controls = new ArrayList<Control>();

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
		return responsibleArea;
	}

	public void setResponsilbleArea(String responsibleArea) {
		this.responsibleArea = responsibleArea;
	}

	public String getRegID() {
		return regID;
	}

	public void setRegID(String regID) {
		this.regID = regID;
	}

	public Boolean getObsolete() {
		return obsolete;
	}

	public void setObsolete(Boolean obsolete) {
		this.obsolete = obsolete;
	}

	public String getResponsibleArea() {
		return responsibleArea;
	}

	public void setResponsibleArea(String responsibleArea) {
		this.responsibleArea = responsibleArea;
	}

	public List<Risk> getRisks() {
		return risks;
	}

	public void setRisks(List<Risk> risks) {
		this.risks = risks;
	}

	public List<Control> getControls() {
		return controls;
	}

	public void setControls(List<Control> controls) {
		this.controls = controls;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

}
