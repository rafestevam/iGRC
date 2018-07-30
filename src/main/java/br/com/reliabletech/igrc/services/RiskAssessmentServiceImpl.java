package br.com.reliabletech.igrc.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reliabletech.igrc.models.RiskAssessment;
import br.com.reliabletech.igrc.repositories.RiskAssessmentRepository;

@Service
public class RiskAssessmentServiceImpl implements RiskAssessmentService {

	@Autowired
	private RiskAssessmentRepository riskassessmentRepository;
	
	public void save(RiskAssessment riskassessment) {
		String guid = "";
		if(riskassessment.getGuid() == null){
			guid = UUID.randomUUID().toString();
			riskassessment.setGuid(guid);
		}
		riskassessmentRepository.save(riskassessment);
	}
	
	public List<RiskAssessment> findAll() {
		return riskassessmentRepository.findAll();
	}

	public RiskAssessment findByGuid(String guid) {
		return riskassessmentRepository.findByGuid(guid);
	}

	public void delete(RiskAssessment riskassessment) {
		riskassessmentRepository.delete(riskassessment);
	}


}
