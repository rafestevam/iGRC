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
public class AppSystem {
	
	@Id //@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="guid", length=100)
	private String guid;
	
	private String sysID;

	@NotNull
	private String name;
	
	@Lob
	private String description;
	
	private String owner;
	
	private String version;
	
	private String manufacturer;
	
	private String costCenter;
	
	private String status;

	private String documents;
	
	
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_system_risk", joinColumns=@JoinColumn(name="appsystem_guid"), inverseJoinColumns=@JoinColumn(name="risk_guid"))
	private List<Risk> risks = new ArrayList<Risk>();

	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_system_control", joinColumns=@JoinColumn(name="appsystem_guid"), inverseJoinColumns=@JoinColumn(name="control_guid"))
	private List<Control> controls = new ArrayList<Control>();

	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_system_reg", joinColumns=@JoinColumn(name="appsystem_guid"), inverseJoinColumns=@JoinColumn(name="regulation_guid"))
	private List<Regulation> regulations = new ArrayList<Regulation>();
	
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_system_process", joinColumns=@JoinColumn(name="appsystem_guid"), inverseJoinColumns=@JoinColumn(name="process_guid"))
	private List<Process> processes = new ArrayList<Process>();
	
	
	@ManyToMany(mappedBy="appsystems")
	private List<OrgUnit> orgunits = new ArrayList<OrgUnit>();
	
	@ManyToMany(mappedBy="appsystems")
	private List<FinancialAccount> financeaccounts = new ArrayList<FinancialAccount>();
	
	@ManyToMany(mappedBy="appsystems")
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

	public String getSysID() {
		return sysID;
	}

	public void setSysID(String sysID) {
		this.sysID = sysID;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
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

	public List<Process> getProcesses() {
		return processes;
	}

	public void setProcesses(List<Process> processes) {
		this.processes = processes;
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
	
	
	
}
