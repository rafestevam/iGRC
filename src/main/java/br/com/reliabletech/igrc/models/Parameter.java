package br.com.reliabletech.igrc.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Parameter {
	
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

@NotNull
private String paramid;

@NotNull
private String name;

private String description;

@NotNull
private String paratype;

@NotNull
private String kind;

private Boolean visible=true;

private Boolean enabled=true;

private String language="EN";



public String getKind() {
	return kind;
}

public void setKind(String kind) {
	this.kind = kind;
}

public Boolean getVisible() {
	return visible;
}

public void setVisible(Boolean visible) {
	this.visible = visible;
}

public Boolean getEnabled() {
	return enabled;
}

public void setEnabled(Boolean enabled) {
	this.enabled = enabled;
}

public String getLanguage() {
	return language;
}

public void setLanguage(String language) {
	this.language = language;
}

public String getParatype() {
	return paratype;
}

public void setParatype(String paratype) {
	this.paratype = paratype;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getParamid() {
	return paramid;
}

public void setParamid(String paramid) {
	this.paramid = paramid;
}


public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
