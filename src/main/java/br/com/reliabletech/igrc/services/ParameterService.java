package br.com.reliabletech.igrc.services;

import java.util.List;

import br.com.reliabletech.igrc.models.Parameter;

public interface ParameterService {

	public void save(Parameter parameter);
	
	public Parameter findByParamid(String paramid);
	
	public List<Parameter> findNonExactParamid(String paramid);
	
	public List<Parameter> findByParatype(String paratype);
}
