package br.com.reliabletech.igrc.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.reliabletech.igrc.models.OrgUnit;
import br.com.reliabletech.igrc.repositories.OrgUnitRepository;

@Service
public class OrgUnitServiceImpl implements OrgUnitService {

	@Autowired
	private OrgUnitRepository orgunitRepository;
	
	public void save(OrgUnit orgunit) {
		
		String guid = "";
		if(orgunit.getGuid() == null){
			guid = UUID.randomUUID().toString();
			orgunit.setGuid(guid);
		}
		orgunitRepository.save(orgunit);
	}
	
	public List<OrgUnit> findAll() {
		return orgunitRepository.findAll();
	}

	public OrgUnit findByGuid(String guid) {
		return orgunitRepository.findByGuid(guid);
	}

	public void delete(OrgUnit orgunit) {
		orgunitRepository.delete(orgunit);
	}	

}
