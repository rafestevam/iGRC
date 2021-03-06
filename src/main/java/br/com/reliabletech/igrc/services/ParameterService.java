package br.com.reliabletech.igrc.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import br.com.reliabletech.igrc.models.Parameter;

@Transactional
public interface ParameterService {

	public void save(Parameter parameter);
	
	public Parameter findByParamid(String paramid);
	
	public List<Parameter> findNonExactParamid(String paramid);
	
	public List<Parameter> findByParatype(String paratype);
	
	public List<Parameter> findAll();
	
	public Parameter findByGuid(String guid);
	
	public void delete(Parameter parameter);
	
	public List<Parameter> findTop10();
	
}
