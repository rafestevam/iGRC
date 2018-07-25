package br.com.reliabletech.igrc.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reliabletech.igrc.models.Regulation;
import br.com.reliabletech.igrc.repositories.RegulationRepository;

@Service
public class RegulationServiceImpl implements RegulationService {

	@Autowired
	private RegulationRepository regulationRepository;
	
	public void save(Regulation regulation) {
		String guid = "";
		if(regulation.getGuid() == null){
			guid = UUID.randomUUID().toString();
			regulation.setGuid(guid);
		}
		regulationRepository.save(regulation);
	}
	
	public List<Regulation> findAll() {
		return regulationRepository.findAll();
	}

	public Regulation findByGuid(String guid) {
		return regulationRepository.findByGuid(guid);
	}

	public void delete(Regulation regulation) {
		regulationRepository.delete(regulation);
	}

}
