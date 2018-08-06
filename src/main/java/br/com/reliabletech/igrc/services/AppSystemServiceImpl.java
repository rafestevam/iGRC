package br.com.reliabletech.igrc.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.reliabletech.igrc.models.AppSystem;
import br.com.reliabletech.igrc.repositories.AppSystemRepository;

@Service
public class AppSystemServiceImpl implements AppSystemService {

	@Autowired
	private AppSystemRepository appsystemRepository;
	
	public void save(AppSystem appsystem) {
		
		String guid = "";
		if(appsystem.getGuid() == null){
			guid = UUID.randomUUID().toString();
			appsystem.setGuid(guid);
		}
		appsystemRepository.save(appsystem);
	}
	
	public List<AppSystem> findAll() {
		return appsystemRepository.findAll();
	}

	public AppSystem findByGuid(String guid) {
		return appsystemRepository.findByGuid(guid);
	}

	public void delete(AppSystem appsystem) {
		appsystemRepository.delete(appsystem);
	}	

}
