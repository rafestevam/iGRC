package br.com.reliabletech.igrc.services;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import br.com.reliabletech.igrc.models.AppSystem;

@Transactional
public interface AppSystemService {

	public void save(AppSystem appsystem);

	public List<AppSystem> findAll();
	
	public AppSystem findByGuid(String guid);
	
	public void delete(AppSystem appsystem);	
	
}
