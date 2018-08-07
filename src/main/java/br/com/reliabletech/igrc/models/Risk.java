package br.com.reliabletech.igrc.models;

import java.math.BigDecimal;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Risk {
	
	@Id //@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="guid", length=100)
	private String guid;

	@NotNull
	private String name;
	
	@Lob
	private String description;
	
	@NotNull
	private String riskID;
	
	@Lob
	private String cause;
	
	@Lob
	private String consequence;
	
	private String process;
	
	private String rule;
	
	private String riskCateg;

	@NotNull
	private String riskManager;
	
	private String assessActiv;
	
	private String assessFreq;
	
	private BigDecimal resQTPotDamage; 

	private String resQLPotDamage;
	
	private Integer resQTOccFreq; //porcentagem
	
	private String resQLProbability; 
	
	private Boolean rtFinReport;
	private Boolean rtCompliance;
	private Boolean rtOperations;
	private Boolean rtStrategic;
	
	private Boolean asserExistOcc; 
	private Boolean asserComplete; 
	private Boolean asserOblgRight; 
	private Boolean asserEvaluation; 
	private Boolean asserDisclosure; 
	private Boolean asserNA; 
	
	private String documents;
	
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_risk_controls", joinColumns=@JoinColumn(name="risk_guid"), inverseJoinColumns=@JoinColumn(name="control_guid"))
	private List<Control> controls = new ArrayList<Control>();
	
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval=true)
	private List<Issue> issues = new ArrayList<Issue>();
	
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval=true)
	private List<RiskAssessment> riskassessments = new ArrayList<RiskAssessment>();
	
	@ManyToOne(targetEntity = RiskCategory.class, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	private RiskCategory riskcategory;

	
	@ManyToMany(mappedBy="risks")
	private List<Regulation> regulations = new ArrayList<Regulation>();
	
	@ManyToMany(mappedBy="risks")
	private List<OrgUnit> orgunits = new ArrayList<OrgUnit>();

	@ManyToMany(mappedBy="risks")
	private List<FinancialAccount> financeaccounts = new ArrayList<FinancialAccount>();
	
	@ManyToMany(mappedBy="risks")
	private List<Product> products = new ArrayList<Product>();
	
	@ManyToMany(mappedBy="risks")
	private List<AppSystem> appsystems = new ArrayList<AppSystem>();
	
	
	public List<RiskAssessment> getRiskassessments() {
		return riskassessments;
	}
	public void setRiskassessments(List<RiskAssessment> riskassessments) {
		this.riskassessments = riskassessments;
	}
	public String getDocuments() {
		return documents;
	}
	public void setDocuments(String documents) {
		this.documents = documents;
	}

	public String getRiskid() {
		return riskID;
	}
	public void setRiskid(String riskid) {
		this.riskID = riskid;
	}
	public String getProcess() {
		return process;
	}
	public void setProcess(String process) {
		this.process = process;
	}
	public String getRule() {
		return rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}
	public List<Issue> getIssues() {
		return issues;
	}
	public void setIssues(List<Issue> issues) {
		this.issues = issues;
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
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public String getConsequence() {
		return consequence;
	}
	public void setConsequence(String consequence) {
		this.consequence = consequence;
	}
	public String getRisk_id() {
		return riskID;
	}
	public void setRisk_id(String risk_id) {
		this.riskID = risk_id;
	}
	public List<Control> getControls() {
		return controls;
	}
	public void setControls(List<Control> controls) {
		this.controls = controls;
	}

	public BigDecimal getResQTPotDamage() {
		return resQTPotDamage;
	}
	public void setResQTPotDamage(BigDecimal resQTPotDamage) {
		this.resQTPotDamage = resQTPotDamage;
	}
	public String getResQLPotDamage() {
		return resQLPotDamage;
	}
	public void setResQLPotDamage(String resQLPotDamage) {
		this.resQLPotDamage = resQLPotDamage;
	}
	public String getAssessFreq() {
		return assessFreq;
	}
	public void setAssessFreq(String assessFreq) {
		this.assessFreq = assessFreq;
	}
	public String getAssessActiv() {
		return assessActiv;
	}
	public void setAssessActiv(String assessActiv) {
		this.assessActiv = assessActiv;
	}
	public Integer getResQTOccFreq() {
		return resQTOccFreq;
	}
	public void setResQTOccFreq(Integer resQTOccFreq) {
		this.resQTOccFreq = resQTOccFreq;
	}

	public String getRiskManager() {
		return riskManager;
	}
	public void setRiskManager(String riskManager) {
		this.riskManager = riskManager;
	}
	public Boolean getRtFinReport() {
		return rtFinReport;
	}
	public void setRtFinReport(Boolean rtFinReport) {
		this.rtFinReport = rtFinReport;
	}
	public Boolean getRtCompliance() {
		return rtCompliance;
	}
	public void setRtCompliance(Boolean rtCompliance) {
		this.rtCompliance = rtCompliance;
	}
	public Boolean getRtOperations() {
		return rtOperations;
	}
	public void setRtOperations(Boolean rtOperations) {
		this.rtOperations = rtOperations;
	}
	public Boolean getRtStrategic() {
		return rtStrategic;
	}
	public void setRtStrategic(Boolean rtStrategic) {
		this.rtStrategic = rtStrategic;
	}
	public Boolean getAsserExistOcc() {
		return asserExistOcc;
	}
	public void setAsserExistOcc(Boolean asserExistOcc) {
		this.asserExistOcc = asserExistOcc;
	}
	public Boolean getAsserComplete() {
		return asserComplete;
	}
	public void setAsserComplete(Boolean asserComplete) {
		this.asserComplete = asserComplete;
	}
	public Boolean getAsserOblgRight() {
		return asserOblgRight;
	}
	public void setAsserOblgRight(Boolean asserOblgRight) {
		this.asserOblgRight = asserOblgRight;
	}
	public Boolean getAsserEvaluation() {
		return asserEvaluation;
	}
	public void setAsserEvaluation(Boolean asserEvaluation) {
		this.asserEvaluation = asserEvaluation;
	}
	public Boolean getAsserDisclosure() {
		return asserDisclosure;
	}
	public void setAsserDisclosure(Boolean asserDisclosure) {
		this.asserDisclosure = asserDisclosure;
	}
	public Boolean getAsserNA() {
		return asserNA;
	}
	public void setAsserNA(Boolean asserNA) {
		this.asserNA = asserNA;
	}
	public String getRiskCateg() {
		return riskCateg;
	}
	public void setRiskCateg(String riskCateg) {
		this.riskCateg = riskCateg;
	}
	public String getResQLPropability() {
		return resQLProbability;
	}
	public void setResQLPropability(String resQLPropability) {
		this.resQLProbability = resQLPropability;
	}
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String getResQLProbability() {
		return resQLProbability;
	}
	public void setResQLProbability(String resQLProbability) {
		this.resQLProbability = resQLProbability;
	}
	public List<Regulation> getRegulations() {
		return regulations;
	}
	public void setRegulations(List<Regulation> regulations) {
		this.regulations = regulations;
	}
	public RiskCategory getRiskcategory() {
		return riskcategory;
	}
	public void setRiskcategory(RiskCategory riskcategory) {
		this.riskcategory = riskcategory;
	}
	public String getRiskID() {
		return riskID;
	}
	public void setRiskID(String riskID) {
		this.riskID = riskID;
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
