package br.com.reliabletech.igrc.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Control {
	
	@Id //@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="guid", length=100)
	private String guid;
	
	@NotNull
	private String controlid;
	
	@NotNull
	private String name;
	
	@Lob
	private String description;
	
	private boolean keyctrl;
	
	private String ctrlmanager;
	
	private String ctrlfreq;
	
	private String ctrltype;
	
	private String ctrlclass;
	
	private String ctrlactivity;
	
	private String fstcontrolline;
	
	private String sndcontrolline;
	
	private String trdcontrolline;
	
	private String ctrlenvmt;
	
	private String documents;
	
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_control_issue", joinColumns=@JoinColumn(name="control_guid"), inverseJoinColumns=@JoinColumn(name="issue_guid"))
	private List<Issue> issues = new ArrayList<Issue>();

	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_control_control_assess", joinColumns=@JoinColumn(name="control_guid"), inverseJoinColumns=@JoinColumn(name="ControlAssessment_guid"))
	private List<ControlAssessment> controlassessment = new ArrayList<ControlAssessment>();
	
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_control_test", joinColumns=@JoinColumn(name="control_guid"), inverseJoinColumns=@JoinColumn(name="Test_guid"))
	private List<Test> tests = new ArrayList<Test>();

	@ManyToMany(mappedBy="controls")
	private List<Risk> risks = new ArrayList<Risk>();
	
	@ManyToMany(mappedBy="controls")
	private List<Regulation> regulations = new ArrayList<Regulation>();
	
	public String getControlid() {
		return controlid;
	}
	
	public void setControlid(String controlid) {
		this.controlid = controlid;
	}
	
	public boolean isKeyctrl() {
		return keyctrl;
	}
	
	public void setKeyctrl(boolean keyctrl) {
		this.keyctrl = keyctrl;
	}
	
	public String getCtrlmanager() {
		return ctrlmanager;
	}
	
	public void setCtrlmanager(String ctrlmanager) {
		this.ctrlmanager = ctrlmanager;
	}
	
	public String getCtrlfreq() {
		return ctrlfreq;
	}
	
	public void setCtrlfreq(String ctrlfreq) {
		this.ctrlfreq = ctrlfreq;
	}
	
	public String getCtrlactivity() {
		return ctrlactivity;
	}
	
	public void setCtrlactivity(String ctrlactivity) {
		this.ctrlactivity = ctrlactivity;
	}
	
	public String getFstcontrolline() {
		return fstcontrolline;
	}
	
	public void setFstcontrolline(String fstcontrolline) {
		this.fstcontrolline = fstcontrolline;
	}
	
	public String getSndcontrolline() {
		return sndcontrolline;
	}
	
	public void setSndcontrolline(String sndcontrolline) {
		this.sndcontrolline = sndcontrolline;
	}
	
	public String getTrdcontrolline() {
		return trdcontrolline;
	}
	
	public void setTrdcontrolline(String trdcontrolline) {
		this.trdcontrolline = trdcontrolline;
	}
	
	public String getCtrlenvmt() {
		return ctrlenvmt;
	}
	
	public void setCtrlenvmt(String ctrlenvmt) {
		this.ctrlenvmt = ctrlenvmt;
	}
	
	public List<Risk> getRisks() {
		return risks;
	}
	
	public void setRisks(List<Risk> risks) {
		this.risks = risks;
	}
	
	public List<Issue> getIssues() {
		return issues;
	}
	
	public void setIssues(List<Issue> issues) {
		this.issues = issues;
	}
	
	public List<Test> getTests() {
		return tests;
	}
	
	public void setTests(List<Test> tests) {
		this.tests = tests;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String pname) {
		name = pname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getControl_id() {
		return controlid;
	}

	public void setControl_id(String control_id) {
		this.controlid = control_id;
	}

	public String getCtrltype() {
		return ctrltype;
	}

	public void setCtrltype(String ctrltype) {
		this.ctrltype = ctrltype;
	}

	public String getCtrlclass() {
		return ctrlclass;
	}

	public void setCtrlclass(String ctrlclass) {
		this.ctrlclass = ctrlclass;
	}

	public List<ControlAssessment> getControlassessment() {
		return controlassessment;
	}

	public void setControlassessment(List<ControlAssessment> controlassessment) {
		this.controlassessment = controlassessment;
	}

	public String getDocuments() {
		return documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}
	
}
