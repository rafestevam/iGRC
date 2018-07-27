package br.com.reliabletech.igrc.services;

import java.util.List;

import br.com.reliabletech.igrc.models.Control;

public interface ControlService {

	public void save(Control control);
	
	public List<Control> findAll();
	
	public Control findByGuid(String guid);
	
}
