package br.com.reliabletech.igrc.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class TestPlan {
	
	@Id //@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="guid", length=100)
	private String guid;
	
	private String testID;

	@NotNull
	private String name;
	
	@Lob
	private String description;
	
	@Lob
	private String walkthrough;

	@Lob
	private String testActivity;
	
	@Lob
	private String methodSample;
	
	private String source;
	
	private String mainProcess;
	private String process;
	private String processActivity;
	
	private String risk;
	
	private String control;
	
	private String status;
	
	private String creator;
	
	private String responsible;

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
	
	private String plannedTestPeriod;
	
	private String actualTestPeriod;
	
	private String endDateStatus;
	
	private String frequency;
	
	private Boolean testDesign;
	
	private Boolean testEffect;
	
	private String documents;
	

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

	public String getTestID() {
		return testID;
	}

	public void setTestID(String testID) {
		this.testID = testID;
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

	public String getMethodSample() {
		return methodSample;
	}

	public void setMethodSample(String methodSample) {
		this.methodSample = methodSample;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getResponsible() {
		return responsible;
	}

	public void setResponsible(String responsible) {
		this.responsible = responsible;
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

	public String getPlannedTestPeriod() {
		return plannedTestPeriod;
	}

	public void setPlannedTestPeriod(String plannedTestPeriod) {
		this.plannedTestPeriod = plannedTestPeriod;
	}

	public String getActualTestPeriod() {
		return actualTestPeriod;
	}

	public void setActualTestPeriod(String actualTestPeriod) {
		this.actualTestPeriod = actualTestPeriod;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
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

	public String getDocuments() {
		return documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}

	public String getMainProcess() {
		return mainProcess;
	}

	public void setMainProcess(String mainProcess) {
		this.mainProcess = mainProcess;
	}

	public String getProcessActivity() {
		return processActivity;
	}

	public void setProcessActivity(String processActivity) {
		this.processActivity = processActivity;
	}

	public String getEndDateStatus() {
		return endDateStatus;
	}

	public void setEndDateStatus(String endDateStatus) {
		this.endDateStatus = endDateStatus;
	}
	
	
}
