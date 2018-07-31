package br.com.reliabletech.igrc.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import br.com.reliabletech.igrc.models.StruProcess;

@Transactional
public interface ProcessService {

	public void save(StruProcess process);
	
	public List<StruProcess> findAll();
	
	public StruProcess findByGuid(String guid);
	
	public void delete(StruProcess process);	
}
