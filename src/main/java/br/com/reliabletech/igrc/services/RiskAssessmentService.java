package br.com.reliabletech.igrc.services;

import org.springframework.transaction.annotation.Transactional;

import br.com.reliabletech.igrc.models.RiskAssessment;

@Transactional
public interface RiskAssessmentService {
	
	public void save(RiskAssessment riskassessment);
	
}
