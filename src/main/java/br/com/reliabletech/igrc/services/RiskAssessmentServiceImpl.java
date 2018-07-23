package br.com.reliabletech.igrc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reliabletech.igrc.models.RiskAssessment;
import br.com.reliabletech.igrc.repositories.RiskAssessmentRepository;

@Service
public class RiskAssessmentServiceImpl implements RiskAssessmentService {

	@Autowired
	private RiskAssessmentRepository riskassessmentRepository;
	
	public void save(RiskAssessment riskassessment) {
		riskassessmentRepository.save(riskassessment);
	}

}
