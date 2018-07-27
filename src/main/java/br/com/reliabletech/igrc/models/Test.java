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
public class Test {
	
	@Id //@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="guid", length=100)
	private String guid;
	
	@NotNull
	private String testID;	

	@NotNull
	private String name;
	
	@Basic
	@Temporal(TemporalType.DATE)
	private java.util.Date plannedStartDate;

	@Basic
	@Temporal(TemporalType.DATE)
	private java.util.Date plannedEndDate;

	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date actualStartDate;
	
	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date actualEndDate;
	
	private Boolean testDesign;
	
	private Boolean testEffect;
	
	@Lob
	private String walkthrough;

	@Lob
	private String testActivity;
	
	private Boolean techObs;
	
	private Boolean techIndag;
	
	private Boolean techRetest;
	
	private Boolean techInsp;
	
	private Boolean techConf;
	
	@Lob
	private String methodSample;
	
	@Lob
	private String conclusionTester;
	
	@Lob
	private String conclusionReviewer;
	
	private String status;
	
	private String source;
	
	private String process;
	
	private String risk;
	
	private String control;
	
	private String testPlan;
	
	private String testerGroup;
	
	private String responsible;
	
	private String reviewerGroup; 
	
	private String documents;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="control_guid")
	
	public String getMethodSample() {
		return methodSample;
	}

	public void setMethodSample(String methodSample) {
		this.methodSample = methodSample;
	}

	public String getConclusionTester() {
		return conclusionTester;
	}

	public void setConclusionTester(String conclusionTester) {
		this.conclusionTester = conclusionTester;
	}

	public String getConclusionReviewer() {
		return conclusionReviewer;
	}

	public void setConclusionReviewer(String conclusionReviewer) {
		this.conclusionReviewer = conclusionReviewer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getRisk() {
		return risk;
	}

	public void setRisk(String risk) {
		this.risk = risk;
	}

	public String getControl() {
		return control;
	}

	public void setControl(String control) {
		this.control = control;
	}

	public String getTestPlan() {
		return testPlan;
	}

	public void setTestPlan(String testPlan) {
		this.testPlan = testPlan;
	}

	public String getTesterGroup() {
		return testerGroup;
	}

	public void setTesterGroup(String testerGroup) {
		this.testerGroup = testerGroup;
	}

	public String getResponsible() {
		return responsible;
	}

	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}

	public String getReviewerGroup() {
		return reviewerGroup;
	}

	public void setReviewerGroup(String reviewerGroup) {
		this.reviewerGroup = reviewerGroup;
	}

	public String getDocuments() {
		return documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getTechObs() {
		return techObs;
	}

	public void setTechObs(Boolean techObs) {
		this.techObs = techObs;
	}

	public Boolean getTechIndag() {
		return techIndag;
	}

	public void setTechIndag(Boolean techIndag) {
		this.techIndag = techIndag;
	}

	public Boolean getTechRetest() {
		return techRetest;
	}

	public void setTechRetest(Boolean techRetest) {
		this.techRetest = techRetest;
	}

	public Boolean getTechInsp() {
		return techInsp;
	}

	public void setTechInsp(Boolean techInsp) {
		this.techInsp = techInsp;
	}

	public Boolean getTechConf() {
		return techConf;
	}

	public void setTechConf(Boolean techConf) {
		this.techConf = techConf;
	}

	public Boolean getTestDesign() {
		return testDesign;
	}

	public void setTestDesign(Boolean testDesign) {
		this.testDesign = testDesign;
	}

	public Boolean getTestEffect() {
		return testEffect;
	}

	public void setTestEffect(Boolean testEffect) {
		this.testEffect = testEffect;
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

	public String getWalkthrough() {
		return walkthrough;
	}

	public void setWalkthrough(String walkthrough) {
		this.walkthrough = walkthrough;
	}

	public String getTestActivity() {
		return testActivity;
	}

	public void setTestActivity(String testActivity) {
		this.testActivity = testActivity;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getTestID() {
		return testID;
	}

	public void setTestID(String testID) {
		this.testID = testID;
	}

	
	
}
