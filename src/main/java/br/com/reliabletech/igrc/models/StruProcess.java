package br.com.reliabletech.igrc.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;

@Entity
public class StruProcess {
	
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
	
}
