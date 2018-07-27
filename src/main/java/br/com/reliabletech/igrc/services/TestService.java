package br.com.reliabletech.igrc.services;

import org.springframework.transaction.annotation.Transactional;

import br.com.reliabletech.igrc.models.Test;

@Transactional
public interface TestService {

	public void save(Test test);
}
