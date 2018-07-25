package br.com.reliabletech.igrc.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reliabletech.igrc.models.ActionPlan;
import br.com.reliabletech.igrc.repositories.ActionPlanRepository;

@Service
public class ActionPlanServiceImpl implements ActionPlanService {

	@Autowired
	private ActionPlanRepository actionplanRepository;
	
	public void save(ActionPlan actionplan) {
		
		String guid = "";
		if(actionplan.getGuid() == null){
			guid = UUID.randomUUID().toString();
			actionplan.setGuid(guid);
		}
				
		actionplanRepository.save(actionplan);
	}

}
