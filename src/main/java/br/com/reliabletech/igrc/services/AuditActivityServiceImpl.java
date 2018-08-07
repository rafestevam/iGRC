package br.com.reliabletech.igrc.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.reliabletech.igrc.models.AuditActivity;
import br.com.reliabletech.igrc.repositories.AuditActivityRepository;

@Service
public class AuditActivityServiceImpl implements AuditActivityService {

	@Autowired
	private AuditActivityRepository auditactivityRepository;
	
	public void save(AuditActivity auditactivity) {
		
		String guid = "";
		if(auditactivity.getGuid() == null){
			guid = UUID.randomUUID().toString();
			auditactivity.setGuid(guid);
		}else {
			if(auditactivity.getGuid().isEmpty()) {
				guid = UUID.randomUUID().toString();
				auditactivity.setGuid(guid);
			}
		}
		auditactivityRepository.save(auditactivity);
	}
	
	public List<AuditActivity> findAll() {
		return auditactivityRepository.findAll();
	}

	public AuditActivity findByGuid(String guid) {
		return auditactivityRepository.findByGuid(guid);
	}

	public void delete(AuditActivity auditactivity) {
		auditactivityRepository.delete(auditactivity);
	}	

}
