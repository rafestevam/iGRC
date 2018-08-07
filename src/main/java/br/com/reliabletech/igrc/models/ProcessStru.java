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
public class ProcessStru {
	
	@Id //@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="guid", length=100)
	private String guid;

	@NotNull
	private String processID;
	
	@NotNull
	private String name;
	
	@Lob
	private String description;
	
	private String mainProcess;
	
	private String subProcess;
	
	private String owner;		
	
	private String documents;
	
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_process_risk", joinColumns=@JoinColumn(name="process_guid"), inverseJoinColumns=@JoinColumn(name="risk_guid"))
	private List<Risk> risks = new ArrayList<Risk>();

	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_process_control", joinColumns=@JoinColumn(name="process_guid"), inverseJoinColumns=@JoinColumn(name="control_guid"))
	private List<Control> controls = new ArrayList<Control>();

	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_process_reg", joinColumns=@JoinColumn(name="process_guid"), inverseJoinColumns=@JoinColumn(name="regulation_guid"))
	private List<Regulation> regulations = new ArrayList<Regulation>();
	
	@ManyToMany(mappedBy="processes")
	private List<OrgUnit> orgunits = new ArrayList<OrgUnit>();
	
	@ManyToMany(mappedBy="processes")
	private List<FinancialAccount> financeaccounts = new ArrayList<FinancialAccount>();
	
	@ManyToMany(mappedBy="processes")
	private List<Product> products = new ArrayList<Product>();

	@ManyToMany(mappedBy="processes")
	private List<AppSystem> appsystems = new ArrayList<AppSystem>();	
	
	
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

	public String getProcessID() {
		return processID;
	}

	public void setProcessID(String processID) {
		this.processID = processID;
	}

	public String getMainProcess() {
		return mainProcess;
	}

	public void setMainProcess(String mainProcess) {
		this.mainProcess = mainProcess;
	}

	public String getSubProcess() {
		return subProcess;
	}

	public void setSubProcess(String subProcess) {
		this.subProcess = subProcess;
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

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
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
	
	
	
}
