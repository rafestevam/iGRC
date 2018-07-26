package br.com.reliabletech.igrc.services;

import org.springframework.transaction.annotation.Transactional;

import br.com.reliabletech.igrc.models.Regulation;

@Transactional
public interface RegulationService {
	public void save(Regulation regulation);
}
