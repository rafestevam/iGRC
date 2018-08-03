package br.com.reliabletech.igrc.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@ConfigurationProperties
public class RiskAssessment {
	
	@Id //@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="guid", length=100)
	private String guid;
	
	private String raID;

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
	
	//private String documents;
	@ElementCollection
	private List<File> files = new ArrayList<File>();
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private java.util.Date assessDate;
		
	//@ManyToOne(targetEntity = Risk.class, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="risk_guid")
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

	public String getRaID() {
		return raID;
	}

	public void setRaID(String raID) {
		this.raID = raID;
	}

	public java.util.Date getAssessDate() {
		return assessDate;
	}

	public void setAssessDate(java.util.Date assessDate) {
		this.assessDate = assessDate;
	}

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}
	
}
