package br.com.reliabletech.igrc.services;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import br.com.reliabletech.igrc.models.Regulation;

@Transactional
public interface RegulationService {
	public void save(Regulation regulation);
	
	public List<Regulation> findAll();
	
	public Regulation findByGuid(String guid);
	
	public void delete(Regulation regulation);
	
	
}
