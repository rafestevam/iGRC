package br.com.reliabletech.igrc.services;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import br.com.reliabletech.igrc.models.OrgUnit;

@Transactional
public interface OrgUnitService {

	public void save(OrgUnit orgunit);

	public List<OrgUnit> findAll();
	
	public OrgUnit findByGuid(String guid);
	
	public void delete(OrgUnit orgunit);	
	
}
