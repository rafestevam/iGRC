package br.com.reliabletech.igrc.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	private String controlID;
	
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

	
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval=true)
	private List<Issue> issues = new ArrayList<Issue>();

	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval=true)
	private List<ControlAssessment> controlassessment = new ArrayList<ControlAssessment>();
	
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval=true)
	private List<Test> tests = new ArrayList<Test>();

	@ManyToMany(mappedBy="controls")
	private List<Risk> risks = new ArrayList<Risk>();
	
	@ManyToMany(mappedBy="controls")
	private List<Regulation> regulations = new ArrayList<Regulation>();

	@ManyToMany(mappedBy="controls")
	private List<OrgUnit> orgunits = new ArrayList<OrgUnit>();
	
	@ManyToMany(mappedBy="controls")
	private List<FinancialAccount> financeaccounts = new ArrayList<FinancialAccount>();
	
	@ManyToMany(mappedBy="controls")
	private List<Product> products = new ArrayList<Product>();
	
	@ManyToMany(mappedBy="controls")
	private List<AppSystem> appsystems = new ArrayList<AppSystem>();	
	
	public Control() {
	}
	
	public Control(String guid) {
		this.guid = guid;
	}

	public String getControlid() {
		return controlID;
	}
	
	public void setControlid(String controlid) {
		this.controlID = controlid;
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
		return controlID;
	}

	public void setControl_id(String control_id) {
		this.controlID = control_id;
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

	public List<Regulation> getRegulations() {
		return regulations;
	}

	public void setRegulations(List<Regulation> regulations) {
		this.regulations = regulations;
	}

	public List<OrgUnit> getOrgunits() {
		return orgunits;
	}

	public void setOrgunits(List<OrgUnit> orgunits) {
		this.orgunits = orgunits;
	}

	public List<FinancialAccount> getFinanceaccounts() {
		return financeaccounts;
	}

	public void setFinanceaccounts(List<FinancialAccount> financeaccounts) {
		this.financeaccounts = financeaccounts;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<AppSystem> getAppsystems() {
		return appsystems;
	}

	public void setAppsystems(List<AppSystem> appsystems) {
		this.appsystems = appsystems;
	}

	public String getControlID() {
		return controlID;
	}

	public void setControlID(String controlID) {
		this.controlID = controlID;
	}

	
}
