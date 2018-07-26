package br.com.reliabletech.igrc.services;

import org.springframework.transaction.annotation.Transactional;

import br.com.reliabletech.igrc.models.StruProcess;

@Transactional
public interface ProcessService {

	public void save(StruProcess process);
}
