package br.com.reliabletech.igrc.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import br.com.reliabletech.igrc.models.RiskAssessment;

@Transactional
public interface RiskAssessmentService {
	
	public void save(RiskAssessment riskassessment);
	
	public List<RiskAssessment> findAll();
	
	public RiskAssessment findByGuid(String guid);
	
	public void delete(RiskAssessment riskassessment);
	
}
