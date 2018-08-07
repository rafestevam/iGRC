package br.com.reliabletech.igrc.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;

@Entity
public class FinancialAccount {
	
	@Id //@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="guid", length=100)
	private String guid;
	
	private String accID;

	@NotNull
	private String name;
	
	@Lob
	private String description;
	
	private String owner;
	
	private Boolean signoff;
	
	private String costCenter;
	
	private String documents;
	
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

	public String getDocuments() {
		return documents;
	}

	public void setDocuments(String documents) {
		this.documents = documents;
	}

	public String getAccID() {
		return accID;
	}

	public void setAccID(String accID) {
		this.accID = accID;
	}

	public Boolean getSignoff() {
		return signoff;
	}

	public void setSignoff(Boolean signoff) {
		this.signoff = signoff;
	}
	
	
}
