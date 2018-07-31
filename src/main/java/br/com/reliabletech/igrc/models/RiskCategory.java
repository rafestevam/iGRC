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
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class RiskCategory {
	
	@Id //@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="guid", length=100)
	private String guid;

	private String rcID;
	
	@NotNull
	private String name;
	
	@Lob
	private String description;

	private String resQlPotDamage;		//Potential Qualitative  Damage / Impact
	
	private String resQlNetDamage;		//Net Qualitative  Damage / Impact

	private BigDecimal resQtPotDamage;		//Potential Quantitative Potential Damage / Impact
	
	private BigDecimal resQtNetDamage;		//Net Quantitative Potential Damage / Impact
	
	private String resQlPotOccFreq;		//Potential Qualitative Occurrence Frequency
	
	private String resQlNetOccFreq;	//Net Qualitative Occurrence Frequency
	
	private Integer resQtPotProbability;		//Potential Quantitative Probability
	
	private Integer resQtNetProbability;		//Net Quantitative Probability

	private String resQlPotTrend;		//Potential Trend
	
	private String resQlNetTrend;		//Net Trend
	
	private String documents;
	
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_categ_risk", joinColumns=@JoinColumn(name="RiskCategory_guid"), inverseJoinColumns=@JoinColumn(name="Risk_guid"))
	private List<Risk> risks = new ArrayList<Risk>();

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
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

	public String getResQlPotDamage() {
		return resQlPotDamage;
	}

	public void setResQlPotDamage(String resQlPotDamage) {
		this.resQlPotDamage = resQlPotDamage;
	}

	public String getResQlNetDamage() {
		return resQlNetDamage;
	}

	public void setResQlNetDamage(String resQlNetDamage) {
		this.resQlNetDamage = resQlNetDamage;
	}

	public BigDecimal getResQtPotDamage() {
		return resQtPotDamage;
	}

	public void setResQtPotDamage(BigDecimal resQtPotDamage) {
		this.resQtPotDamage = resQtPotDamage;
	}

	public BigDecimal getResQtNetDamage() {
		return resQtNetDamage;
	}

	public void setResQtNetDamage(BigDecimal resQtNetDamage) {
		this.resQtNetDamage = resQtNetDamage;
	}

	public String getResQlPotOccFreq() {
		return resQlPotOccFreq;
	}

	public void setResQlPotOccFreq(String resQlPotOccFreq) {
		this.resQlPotOccFreq = resQlPotOccFreq;
	}

	public String getResQlNetOccFreq() {
		return resQlNetOccFreq;
	}

	public void setResQlNetOccFreq(String resQlNetOccFreq) {
		this.resQlNetOccFreq = resQlNetOccFreq;
	}

	public Integer getResQtPotProbability() {
		return resQtPotProbability;
	}

	public void setResQtPotProbability(Integer resQtPotProbability) {
		this.resQtPotProbability = resQtPotProbability;
	}

	public Integer getResQtNetProbability() {
		return resQtNetProbability;
	}

	public void setResQtNetProbability(Integer resQtNetProbability) {
		this.resQtNetProbability = resQtNetProbability;
	}

	public String getResQlPotTrend() {
		return resQlPotTrend;
	}

	public void setResQlPotTrend(String resQlPotTrend) {
		this.resQlPotTrend = resQlPotTrend;
	}

	public String getResQlNetTrend() {
		return resQlNetTrend;
	}

	public void setResQlNetTrend(String resQlNetTrend) {
		this.resQlNetTrend = resQlNetTrend;
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

	public String getRcID() {
		return rcID;
	}

	public void setRcID(String rcID) {
		this.rcID = rcID;
	}

	
	
}
