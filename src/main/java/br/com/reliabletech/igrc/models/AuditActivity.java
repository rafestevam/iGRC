package br.com.reliabletech.igrc.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class AuditActivity {

	@Id //@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="guid", length=100)
	private String guid;

	private String auditID;
	
	@NotNull
	private String name;
	
	@Lob
	private String description;
	
	private String auditPlan;
	
	private String auditScope;
	
	private String subActivities;
	
	@Basic
	@Temporal(TemporalType.DATE)
	private java.util.Date plannedStartDate;
	
	@Basic
	@Temporal(TemporalType.DATE)
	private java.util.Date plannedEndDate;

	@Basic
	@Temporal(TemporalType.DATE)
	private java.util.Date actualStartDate;
	
	@Basic
	@Temporal(TemporalType.DATE)
	private java.util.Date actualEndDate;

	private String plannedAcvityPeriod;
	
	private String actualAcvityPeriod;
	
	private String status;
	
	private String endDateStatus;
	
	private String responsible;
	
	private String documents;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="auditplan_guid")
	private AuditPlan auditplan;

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

	public String getResponsible() {
		return responsible;
	}

	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}

	public String getAuditPlan() {
		return auditPlan;
	}

	public void setAuditPlan(String auditPlan) {
		this.auditPlan = auditPlan;
	}

	public String getAuditScope() {
		return auditScope;
	}

	public void setAuditScope(String auditScope) {
		this.auditScope = auditScope;
	}

	public String getSubActivities() {
		return subActivities;
	}

	public void setSubActivities(String subActivities) {
		this.subActivities = subActivities;
	}

	public java.util.Date getActualStartDate() {
		return actualStartDate;
	}

	public void setActualStartDate(java.util.Date actualStartDate) {
		this.actualStartDate = actualStartDate;
	}

	public java.util.Date getActualEndDate() {
		return actualEndDate;
	}

	public void setActualEndDate(java.util.Date actualEndDate) {
		this.actualEndDate = actualEndDate;
	}

	public String getPlannedAcvityPeriod() {
		return plannedAcvityPeriod;
	}

	public void setPlannedAcvityPeriod(String plannedAcvityPeriod) {
		this.plannedAcvityPeriod = plannedAcvityPeriod;
	}

	public String getActualAcvityPeriod() {
		return actualAcvityPeriod;
	}

	public void setActualAcvityPeriod(String actualAcvityPeriod) {
		this.actualAcvityPeriod = actualAcvityPeriod;
	}

	public AuditPlan getAuditplan() {
		return auditplan;
	}

	public void setAuditplan(AuditPlan auditplan) {
		this.auditplan = auditplan;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
