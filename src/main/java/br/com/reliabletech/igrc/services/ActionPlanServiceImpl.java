package br.com.reliabletech.igrc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reliabletech.igrc.models.ActionPlan;
import br.com.reliabletech.igrc.repositories.ActionPlanRepository;

@Service
public class ActionPlanServiceImpl implements ActionPlanService {

	@Autowired
	private ActionPlanRepository actionplanRepository;
	
	public void save(ActionPlan actionplan) {
		actionplanRepository.save(actionplan);
	}

}