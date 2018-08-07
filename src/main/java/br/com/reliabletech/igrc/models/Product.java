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
public class Product {
	
	@Id //@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="guid", length=100)
	private String guid;

	private String prodID;
	
	@NotNull
	private String name;
	
	@Lob
	private String description;
	
	private String owner;

	private String costCenter;
	
	private String documents;

	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_product_risk", joinColumns=@JoinColumn(name="product_guid"), inverseJoinColumns=@JoinColumn(name="risk_guid"))
	private List<Risk> risks = new ArrayList<Risk>();

	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_product_control", joinColumns=@JoinColumn(name="product_guid"), inverseJoinColumns=@JoinColumn(name="control_guid"))
	private List<Control> controls = new ArrayList<Control>();

	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_product_reg", joinColumns=@JoinColumn(name="product_guid"), inverseJoinColumns=@JoinColumn(name="regulation_guid"))
	private List<Regulation> regulations = new ArrayList<Regulation>();
	
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_product_process", joinColumns=@JoinColumn(name="product_guid"), inverseJoinColumns=@JoinColumn(name="process_guid"))
	private List<ProcessStru> processes = new ArrayList<ProcessStru>();
	
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_product_appsys", joinColumns=@JoinColumn(name="product_guid"), inverseJoinColumns=@JoinColumn(name="appsystem_guid"))
	private List<AppSystem> appsystems = new ArrayList<AppSystem>();
	
	
	@ManyToMany(mappedBy="products")
	private List<OrgUnit> orgunits = new ArrayList<OrgUnit>();
	
	@ManyToMany(mappedBy="products")
	private List<FinancialAccount> financeaccounts = new ArrayList<FinancialAccount>();
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProdID() {
		return prodID;
	}

	public void setProdID(String prodID) {
		this.prodID = prodID;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getDocuments() {
		return documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
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

	public String getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
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

	public List<AppSystem> getAppsystems() {
		return appsystems;
	}

	public void setAppsystems(List<AppSystem> appsystems) {
		this.appsystems = appsystems;
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

	public List<ProcessStru> getProcesses() {
		return processes;
	}

	public void setProcesses(List<ProcessStru> processes) {
		this.processes = processes;
	}
	
}
