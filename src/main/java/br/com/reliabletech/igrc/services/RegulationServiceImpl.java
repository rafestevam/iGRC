package br.com.reliabletech.igrc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reliabletech.igrc.models.Regulation;
import br.com.reliabletech.igrc.repositories.RegulationRepository;

@Service
public class RegulationServiceImpl implements RegulationService {

	@Autowired
	private RegulationRepository regulationRepository;
	
	public void save(Regulation regulation) {
		regulationRepository.save(regulation);
	}

}
