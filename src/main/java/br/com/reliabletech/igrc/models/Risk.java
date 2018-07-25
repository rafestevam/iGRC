package br.com.reliabletech.igrc.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Risk {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String name;
	
	@Lob
	private String description;
	
	@NotNull
	private String riskid;
	
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
	
	private String guid;
	
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_risk_controls", joinColumns=@JoinColumn(name="risk_id"), inverseJoinColumns=@JoinColumn(name="control_id"))
	private List<Control> controls = new ArrayList<Control>();
	
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_risk_issue", joinColumns=@JoinColumn(name="risk_id"), inverseJoinColumns=@JoinColumn(name="issue_id"))
	private List<Issue> issues = new ArrayList<Issue>();
	
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_risk_risk_assess", joinColumns=@JoinColumn(name="risk_id"), inverseJoinColumns=@JoinColumn(name="RiskAssessment_id"))
	private List<RiskAssessment> riskassessments = new ArrayList<RiskAssessment>();
	
	@ManyToMany(mappedBy="risks")
	private List<Regulation> regulations = new ArrayList<Regulation>();
	
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
		return riskid;
	}
	public void setRiskid(String riskid) {
		this.riskid = riskid;
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
		return riskid;
	}
	public void setRisk_id(String risk_id) {
		this.riskid = risk_id;
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
	
	
}
