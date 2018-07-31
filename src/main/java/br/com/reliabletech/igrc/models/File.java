package br.com.reliabletech.igrc.models;

import javax.persistence.Embeddable;

@Embeddable
public class File {
	
	private String name;
	private String address;
	
	public File() {
	}
	public File(String key, String value) {
		name = key;
		address = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
