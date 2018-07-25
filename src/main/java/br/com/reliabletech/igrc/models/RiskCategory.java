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

	@NotNull
	private String name;
	
	@Lob
	private String description;
	
	private BigDecimal resQtPotDamage;
	
	private BigDecimal resQtNetDamage;

	private String resQlPotDamage;
	
	private String resQlNetDamage;
	
	private Integer resQlPotOccFreq; //porcentagem numero
	
	private Integer resQtNetOccFreq; //porcentagem numero
	
	private String resQlPotProbability;
	
	private String resQlNetProbability;
	
	private String resQlPotTrend;
	
	private String resQlNetTrend;
	
	private String documents;
	
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name="jt_categ_risk", joinColumns=@JoinColumn(name="RiskCategory_id"), inverseJoinColumns=@JoinColumn(name="Risk_id"))
	private List<Risk> risks = new ArrayList<Risk>();

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

	public Integer getResQlPotOccFreq() {
		return resQlPotOccFreq;
	}

	public void setResQlPotOccFreq(Integer resQlPotOccFreq) {
		this.resQlPotOccFreq = resQlPotOccFreq;
	}

	public Integer getResQtNetOccFreq() {
		return resQtNetOccFreq;
	}

	public void setResQtNetOccFreq(Integer resQtNetOccFreq) {
		this.resQtNetOccFreq = resQtNetOccFreq;
	}

	public String getResQlPotProbability() {
		return resQlPotProbability;
	}

	public void setResQlPotProbability(String resQlPotProbability) {
		this.resQlPotProbability = resQlPotProbability;
	}

	public String getResQlNetProbability() {
		return resQlNetProbability;
	}

	public void setResQlNetProbability(String resQlNetProbability) {
		this.resQlNetProbability = resQlNetProbability;
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

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}
	
	

}
