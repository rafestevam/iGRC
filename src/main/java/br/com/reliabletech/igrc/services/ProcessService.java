package br.com.reliabletech.igrc.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import br.com.reliabletech.igrc.models.ProcessStru;

@Transactional
public interface ProcessService {

	public void save(ProcessStru process);
	
	public List<ProcessStru> findAll();
	
	public ProcessStru findByGuid(String guid);
	
	public void delete(ProcessStru process);	
}
