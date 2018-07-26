package br.com.reliabletech.igrc.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class ControlAssessment {

	@Id //@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="guid", length=100)
	private String guid;

	@NotNull
	private String name;
	
	@Lob
	private String description;

	//@ManyToOne(targetEntity = Control.class, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="control_guid")
	private Control control;

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
}
