package br.com.reliabletech.igrc.models;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class ActionPlan {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String name;
	
	@Lob
	private String description;
	
	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date creationDate;
	
	private String apCreator;
	
	private String issueAssigned;
	
	private String riskAssigned;
	
	private String apStatus;

	@Lob
	private String obsCreator;
	
	@Lob
	private String obsReviewer;
	
	@Lob
	private String obsOwner;
	
	private Boolean replanned;
	
	@Basic
	@Temporal(TemporalType.DATE)
	private java.util.Date plannedEndDate;

	@Basic
	@Temporal(TemporalType.DATE)
	private java.util.Date plannedFupDate;
	
	private String endDateStatus;
	
	private String documents;
	
	@ManyToOne(targetEntity = Issue.class, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	private Issue issue;
		
	
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

	public Issue getIssue() {
		return issue;
	}

	public void setIssue(Issue issue) {
		this.issue = issue;
	}

	public java.util.Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getApCreator() {
		return apCreator;
	}

	public void setApCreator(String apCreator) {
		this.apCreator = apCreator;
	}

	public String getIssueAssigned() {
		return issueAssigned;
	}

	public void setIssueAssigned(String issueAssigned) {
		this.issueAssigned = issueAssigned;
	}

	public String getRiskAssigned() {
		return riskAssigned;
	}

	public void setRiskAssigned(String riskAssigned) {
		this.riskAssigned = riskAssigned;
	}

	public String getApStatus() {
		return apStatus;
	}

	public void setApStatus(String apStatus) {
		this.apStatus = apStatus;
	}

	public String getObsCreator() {
		return obsCreator;
	}

	public void setObsCreator(String obsCreator) {
		this.obsCreator = obsCreator;
	}

	public String getObsReviewer() {
		return obsReviewer;
	}

	public void setObsReviewer(String obsReviewer) {
		this.obsReviewer = obsReviewer;
	}

	public String getObsOwner() {
		return obsOwner;
	}

	public void setObsOwner(String obsOwner) {
		this.obsOwner = obsOwner;
	}

	public Boolean getReplanned() {
		return replanned;
	}

	public void setReplanned(Boolean replanned) {
		this.replanned = replanned;
	}

	public java.util.Date getPlannedEndDate() {
		return plannedEndDate;
	}

	public void setPlannedEndDate(java.util.Date plannedEndDate) {
		this.plannedEndDate = plannedEndDate;
	}

	public java.util.Date getPlannedFupDate() {
		return plannedFupDate;
	}

	public void setPlannedFupDate(java.util.Date plannedFupDate) {
		this.plannedFupDate = plannedFupDate;
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

	
}
