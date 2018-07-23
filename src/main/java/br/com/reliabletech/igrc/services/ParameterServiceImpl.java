package br.com.reliabletech.igrc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.repositories.ParameterRepository;

@Service
public class ParameterServiceImpl implements ParameterService {

	@Autowired
	private ParameterRepository parameterRepository;
	
	public void save(Parameter parameter) {
		parameterRepository.save(parameter);
	}

	public Parameter findByParamid(String paramid) {
		return parameterRepository.findByParamid(paramid);
	}

	public List<Parameter> findNonExactParamid(String paramid) {
		return parameterRepository.findNonExactParamid(paramid);
	}

	public List<Parameter> findByParatype(String paratype) {
		return parameterRepository.findByParatype(paratype);
	}

}
