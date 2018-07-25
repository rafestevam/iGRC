package br.com.reliabletech.igrc.models;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class RiskAssessment {
	
	@Id //@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="guid", length=100)
	private String guid;

	@NotNull
	private String name;
	
	@Lob
	private String description;

	private BigDecimal qtPotDamage;

	private String qlPotDamage;
	
	private Integer qtPotOccFreq;
	
	private String qlPotProbability;
	
	private String potTrend;
	
	@Lob
	private String obsOwner;
	
	private String documents;	
	
		
	@ManyToOne(targetEntity = Risk.class, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	private Risk risk;
	
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

	public Risk getRisk() {
		return risk;
	}

	public void setRisk(Risk risk) {
		this.risk = risk;
	}

	public BigDecimal getQtPotDamage() {
		return qtPotDamage;
	}

	public void setQtPotDamage(BigDecimal qtPotDamage) {
		this.qtPotDamage = qtPotDamage;
	}

	public String getQlPotDamage() {
		return qlPotDamage;
	}

	public void setQlPotDamage(String qlPotDamage) {
		this.qlPotDamage = qlPotDamage;
	}

	public String getDocuments() {
		return documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}

	public String getObsOwner() {
		return obsOwner;
	}

	public void setObsOwner(String obsOwner) {
		this.obsOwner = obsOwner;
	}

	public Integer getQtPotOccFreq() {
		return qtPotOccFreq;
	}

	public void setQtPotOccFreq(Integer qtPotOccFreq) {
		this.qtPotOccFreq = qtPotOccFreq;
	}

	public String getQlPotProbability() {
		return qlPotProbability;
	}

	public void setQlPotProbability(String qlPotProbability) {
		this.qlPotProbability = qlPotProbability;
	}

	public String getPotTrend() {
		return potTrend;
	}

	public void setPotTrend(String potTrend) {
		this.potTrend = potTrend;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

}
