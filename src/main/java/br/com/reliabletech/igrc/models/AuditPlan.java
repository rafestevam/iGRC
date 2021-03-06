package br.com.reliabletech.igrc.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class AuditPlan {

	@Id //@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="guid", length=100)
	private String guid;

	private String auditID;
	
	@NotNull
	private String name;
	
	@Lob
	private String description;
	
	@Lob
	private String objective;
	
	private String auditType;
	
	@Basic
	@Temporal(TemporalType.DATE)
	private java.util.Date plannedStartDate;
	
	@Basic
	@Temporal(TemporalType.DATE)
	private java.util.Date plannedEndDate;

	private String plannedAuditPeriod;
	
	private String actualAuditPeriod;
	
	private String endDateStatus;
	
	private String auditTeam;
	
	private String responsible;
	
	private String documents;
	
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval=true)
	private List<AuditActivity> auditactivities = new ArrayList<AuditActivity>();

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

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getAuditID() {
		return auditID;
	}

	public void setAuditID(String auditID) {
		this.auditID = auditID;
	}

	public String getObjetive() {
		return objective;
	}

	public void setObjetive(String objetive) {
		this.objective = objetive;
	}

	public java.util.Date getPlannedStartDate() {
		return plannedStartDate;
	}

	public void setPlannedStartDate(java.util.Date plannedStartDate) {
		this.plannedStartDate = plannedStartDate;
	}

	public java.util.Date getPlannedEndDate() {
		return plannedEndDate;
	}

	public void setPlannedEndDate(java.util.Date plannedEndDate) {
		this.plannedEndDate = plannedEndDate;
	}

	public String getPlannedAuditPeriod() {
		return plannedAuditPeriod;
	}

	public void setPlannedAuditPeriod(String plannedAuditPeriod) {
		this.plannedAuditPeriod = plannedAuditPeriod;
	}

	public String getActualAuditPeriod() {
		return actualAuditPeriod;
	}

	public void setActualAuditPeriod(String actualAuditPeriod) {
		this.actualAuditPeriod = actualAuditPeriod;
	}

	public String getEndDateStatus() {
		return endDateStatus;
	}

	public void setEndDateStatus(String endDateStatus) {
		this.endDateStatus = endDateStatus;
	}

	public String getDocuments() {
		return documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}

	public String getAuditTeam() {
		return auditTeam;
	}

	public void setAuditTeam(String auditTeam) {
		this.auditTeam = auditTeam;
	}

	public String getResponsible() {
		return responsible;
	}

	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public List<AuditActivity> getAuditactivities() {
		return auditactivities;
	}

	public void setAuditactivities(List<AuditActivity> auditactivities) {
		this.auditactivities = auditactivities;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

}
