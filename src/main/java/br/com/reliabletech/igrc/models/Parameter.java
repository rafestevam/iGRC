package br.com.reliabletech.igrc.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Parameter {

	@Id // @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "guid", length = 100)
	private String guid;

	@NotNull
	private String paramid;

	@NotNull
	private String name;

	private String description;

	@NotNull
	private String paratype;

	@NotNull
	private String kind;

	private Boolean visible = true;

	private Boolean enabled = true;

	private String language = "EN";

	public Parameter() {
	}

	public Parameter(String key) {
		setParatype(key);
	}

	public void setParamValues(Object key, Object value) {

		switch ((ParameterEnum) key) {
		case DESCRIPTION:
			setDescription((String) value);
			break;
		case ENABLED:
			setEnabled((Boolean) value);
			break;
		case KIND:
			setKind((String) value);
			break;
		case LANGUAGE:
			setLanguage((String) value);
			break;
		case NAME:
			setName((String) value);
			break;
		case PARAMID:
			setParamid((String) value);
			break;
		case VISIBLE:
			setVisible((Boolean) value);
			break;
		}

	}

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

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	@Override
	public String toString() {
		return "Parameter [paramid=" + paramid + ", name=" + name + ", description=" + description + ", paratype="
				+ paratype + ", kind=" + kind + ", visible=" + visible + ", enabled=" + enabled + ", language="
				+ language + "]";
	}

}
