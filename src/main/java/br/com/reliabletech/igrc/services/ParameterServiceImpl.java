package br.com.reliabletech.igrc.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.repositories.ParameterRepository;

@Service
public class ParameterServiceImpl implements ParameterService {

	@Autowired
	private ParameterRepository parameterRepository;
	
	public void save(Parameter parameter) {
		String guid = "";
		if(parameter.getGuid() == null){
			guid = UUID.randomUUID().toString();
			parameter.setGuid(guid);
		}
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
	
	public List<Parameter> findAll() {
		return parameterRepository.findAll();
	}
	
	public Parameter findByGuid(String guid) {
		return parameterRepository.findByGuid(guid);
	}
		
	public void delete(Parameter parameter) {
		parameterRepository.delete(parameter);
	}

	public List<Parameter> findTop10() {
		return parameterRepository.findTop10();
	}

}
