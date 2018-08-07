package br.com.reliabletech.igrc.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.reliabletech.igrc.models.AuditPlan;
import br.com.reliabletech.igrc.repositories.AuditPlanRepository;

@Service
public class AuditPlanServiceImpl implements AuditPlanService {

	@Autowired
	private AuditPlanRepository auditplanRepository;
	
	public void save(AuditPlan auditplan) {
		
		String guid = "";
		if(auditplan.getGuid() == null){
			guid = UUID.randomUUID().toString();
			auditplan.setGuid(guid);
		}else {
			if(auditplan.getGuid().isEmpty()) {
				guid = UUID.randomUUID().toString();
				auditplan.setGuid(guid);
			}
		}
		auditplanRepository.save(auditplan);
	}
	
	public List<AuditPlan> findAll() {
		return auditplanRepository.findAll();
	}

	public AuditPlan findByGuid(String guid) {
		return auditplanRepository.findByGuid(guid);
	}

	public void delete(AuditPlan auditplan) {
		auditplanRepository.delete(auditplan);
	}	

}
