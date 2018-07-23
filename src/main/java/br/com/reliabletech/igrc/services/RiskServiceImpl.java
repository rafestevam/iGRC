package br.com.reliabletech.igrc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reliabletech.igrc.models.Risk;
import br.com.reliabletech.igrc.repositories.RiskRepository;

@Service
public class RiskServiceImpl implements RiskService {

	@Autowired
	private RiskRepository riskRepository;
	
	public void save(Risk risk) {
		riskRepository.save(risk);
	}

}
