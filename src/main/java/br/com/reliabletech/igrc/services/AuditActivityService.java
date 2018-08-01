package br.com.reliabletech.igrc.services;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import br.com.reliabletech.igrc.models.AuditActivity;

@Transactional
public interface AuditActivityService {

	public void save(AuditActivity auditactivity);

	public List<AuditActivity> findAll();
	
	public AuditActivity findByGuid(String guid);
	
	public void delete(AuditActivity auditactivity);	
	
}
