package br.com.reliabletech.igrc.services;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import br.com.reliabletech.igrc.models.ActionPlan;

@Transactional
public interface ActionPlanService {

	public void save(ActionPlan actionplan);

	public List<ActionPlan> findAll();
	
	public ActionPlan findByGuid(String guid);
	
	public void delete(ActionPlan actionplan);	
	
}
