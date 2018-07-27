package br.com.reliabletech.igrc.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import br.com.reliabletech.igrc.models.Test;

@Transactional
public interface TestService {

	public void save(Test test);
	
	public List<Test> findAll();
	
	public Test findByGuid(String guid);
	
	public void delete(Test test);
	
}
