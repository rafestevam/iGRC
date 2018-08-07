package br.com.reliabletech.igrc.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reliabletech.igrc.models.Risk;
import br.com.reliabletech.igrc.repositories.RiskRepository;

@Service
public class RiskServiceImpl implements RiskService {

	@Autowired
	private RiskRepository riskRepository;
	
	public void save(Risk risk) {
		String guid = "";
		if(risk.getGuid() == null){
			guid = UUID.randomUUID().toString();
			risk.setGuid(guid);
		}else {
			if(risk.getGuid().isEmpty()) {
				guid = UUID.randomUUID().toString();
				risk.setGuid(guid);
			}
		}
		riskRepository.save(risk);
	}

	public List<Risk> findAll() {
		return riskRepository.findAll();
	}

	public Risk findByGuid(String guid) {
		return riskRepository.findByGuid(guid);
	}

	public void delete(Risk risk) {
		riskRepository.delete(risk);
	}

	@Override
	public boolean existsByGuid(String guid) {
		return riskRepository.existsByGuid(guid);
	}
	
	

}
