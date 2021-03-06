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
import javax.validation.constraints.NotNull;

@Entity
public class OrgUnit {

	@Id //@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="guid", length=100)
	private String guid;

	@NotNull
	private String orgID;
	
	@NotNull
	private String name;
	
	@Lob
	private String description;
	
	private String owner;
	
	private String costCenter;
	
	private Boolean signoff;
	
	private String documents;
	
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_orgunit_risk", joinColumns=@JoinColumn(name="orgunit_guid"), inverseJoinColumns=@JoinColumn(name="risk_guid"))
	private List<Risk> risks = new ArrayList<Risk>();
		
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_orgunit_control", joinColumns=@JoinColumn(name="orgunit_guid"), inverseJoinColumns=@JoinColumn(name="control_guid"))
	private List<Control> controls = new ArrayList<Control>();

	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_orgunit_reg", joinColumns=@JoinColumn(name="orgunit_guid"), inverseJoinColumns=@JoinColumn(name="regulation_guid"))
	private List<Regulation> regulations = new ArrayList<Regulation>();
	
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_orgunit_process", joinColumns=@JoinColumn(name="orgunit_guid"), inverseJoinColumns=@JoinColumn(name="process_guid"))
	private List<ProcessStru> processes = new ArrayList<ProcessStru>();
	
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_orgunit_appsys", joinColumns=@JoinColumn(name="orgunit_guid"), inverseJoinColumns=@JoinColumn(name="appsystem_guid"))
	private List<AppSystem> appsystems = new ArrayList<AppSystem>();
	
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_orgunit_finacc", joinColumns=@JoinColumn(name="orgunit_guid"), inverseJoinColumns=@JoinColumn(name="financialaccount_guid"))
	private List<FinancialAccount> financialaccounts = new ArrayList<FinancialAccount>();
	
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_orgunit_product", joinColumns=@JoinColumn(name="orgunit_guid"), inverseJoinColumns=@JoinColumn(name="product_guid"))
	private List<Product> products = new ArrayList<Product>();

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

	public String getOrgID() {
		return orgID;
	}

	public void setOrgID(String orgID) {
		this.orgID = orgID;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	public Boolean getSignoff() {
		return signoff;
	}

	public void setSignoff(Boolean signoff) {
		this.signoff = signoff;
	}

	public String getDocuments() {
		return documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
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

	public List<Regulation> getRegulations() {
		return regulations;
	}

	public void setRegulations(List<Regulation> regulations) {
		this.regulations = regulations;
	}


	public List<ProcessStru> getProcesses() {
		return processes;
	}

	public void setProcesses(List<ProcessStru> processes) {
		this.processes = processes;
	}

	public List<AppSystem> getAppsystems() {
		return appsystems;
	}

	public void setAppsystems(List<AppSystem> appsystems) {
		this.appsystems = appsystems;
	}

	public List<FinancialAccount> getFinancialaccounts() {
		return financialaccounts;
	}

	public void setFinancialaccounts(List<FinancialAccount> financialaccounts) {
		this.financialaccounts = financialaccounts;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	
}
