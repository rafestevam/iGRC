package br.com.reliabletech.igrc.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import br.com.reliabletech.igrc.models.Control;

@Transactional
public interface ControlService {

	public void save(Control control);
	
	public List<Control> findAll();
	
	public Control findByGuid(String guid);
	
	public void delete(Control control);
	
}
