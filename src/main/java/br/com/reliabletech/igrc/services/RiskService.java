package br.com.reliabletech.igrc.services;

import java.util.List;

import br.com.reliabletech.igrc.models.Risk;

public interface RiskService {

	public void save(Risk risk);
	
	public List<Risk> findAll();
	
	public Risk findByGuid(String guid);
	
	public void delete(Risk risk);
	
	public boolean existsByGuid(String guid);
	
}
