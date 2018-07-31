package br.com.reliabletech.igrc.services;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import br.com.reliabletech.igrc.models.AuditPlan;

@Transactional
public interface AuditPlanService {

	public void save(AuditPlan auditplan);

	public List<AuditPlan> findAll();
	
	public AuditPlan findByGuid(String guid);
	
	public void delete(AuditPlan auditplan);	
	
}
