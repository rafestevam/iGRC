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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class Issue {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String issueID;
	
	@NotNull
	private String name;
	
	@Lob
	private String description;
	
	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date creationDate;
	
	private String issueCreator;
	
	private String riskAssigned;
	
	private String riskPotAssess;
	
	private String riskResAssess;
	
	private String processAssigned;
	
	private String systemAffected;
	
	private String rootCause;
	
	private String issueStatus;
	
	@Lob
	private String situationFound;
	
	private Boolean recurrent;
	
	@Lob
	private String obsCreator;
	
	@Lob
	private String obsReviewer;
	
	@Lob
	private String obsOwner;
	
	@Lob
	private String recommendation;
	
	private Boolean replanned;
	
	private String issueOwner;
	
	private String issueSource;
	
	@Basic
	@Temporal(TemporalType.DATE)
	private java.util.Date plannedEndDate;

	@Basic
	@Temporal(TemporalType.DATE)
	private java.util.Date plannedFupDate;
	
	private String endDateStatus;
	
	private String documents;

	
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_issue_actplan", joinColumns=@JoinColumn(name="issue_id"), inverseJoinColumns=@JoinColumn(name="ActionPlan_id"))
	private List<ActionPlan> actionplans = new ArrayList<ActionPlan>();

	@ManyToOne(targetEntity = Risk.class, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	private Risk risk;
	
	@ManyToOne(targetEntity = Control.class, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	private Control control;
	
	
	
	
	public String getSystemAffected() {
		return systemAffected;
	}

	public void setSystemAffected(String systemAffected) {
		this.systemAffected = systemAffected;
	}

	public String getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

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

	public Risk getRisk() {
		return risk;
	}

	public void setRisk(Risk risk) {
		this.risk = risk;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	public String getIssueID() {
		return issueID;
	}

	public void setIssueID(String issueID) {
		this.issueID = issueID;
	}

	public java.util.Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getIssueCreator() {
		return issueCreator;
	}

	public void setIssueCreator(String issueCreator) {
		this.issueCreator = issueCreator;
	}

	public String getRiskAssigned() {
		return riskAssigned;
	}

	public void setRiskAssigned(String riskAssigned) {
		this.riskAssigned = riskAssigned;
	}

	public String getRiskPotAssess() {
		return riskPotAssess;
	}

	public void setRiskPotAssess(String riskPotAssess) {
		this.riskPotAssess = riskPotAssess;
	}

	public String getRiskResAssess() {
		return riskResAssess;
	}

	public void setRiskResAssess(String riskResAssess) {
		this.riskResAssess = riskResAssess;
	}

	public String getProcessAssigned() {
		return processAssigned;
	}

	public void setProcessAssigned(String processAssigned) {
		this.processAssigned = processAssigned;
	}

	public String getSystemAfected() {
		return systemAffected;
	}

	public void setSystemAfected(String systemAfected) {
		this.systemAffected = systemAfected;
	}

	public String getRootCause() {
		return rootCause;
	}

	public void setRootCause(String rootCause) {
		this.rootCause = rootCause;
	}

	public String getIssueStatus() {
		return issueStatus;
	}

	public void setIssueStatus(String issueStatus) {
		this.issueStatus = issueStatus;
	}

	public String getSituationFound() {
		return situationFound;
	}

	public void setSituationFound(String situationFound) {
		this.situationFound = situationFound;
	}

	public Boolean getRecurrent() {
		return recurrent;
	}

	public void setRecurrent(Boolean recurrent) {
		this.recurrent = recurrent;
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

	public String getRecomendation() {
		return recommendation;
	}

	public void setRecomendation(String recomendation) {
		this.recommendation = recomendation;
	}

	public Boolean getReplanned() {
		return replanned;
	}

	public void setReplanned(Boolean replanned) {
		this.replanned = replanned;
	}

	public String getIssueOwner() {
		return issueOwner;
	}

	public void setIssueOwner(String issueOwner) {
		this.issueOwner = issueOwner;
	}

	public String getIssueSource() {
		return issueSource;
	}

	public void setIssueSource(String issueSource) {
		this.issueSource = issueSource;
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

	public List<ActionPlan> getActionplans() {
		return actionplans;
	}

	public void setActionplans(List<ActionPlan> actionplans) {
		this.actionplans = actionplans;
	}

	public String getDocuments() {
		return documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}
	
	
	
	
}
