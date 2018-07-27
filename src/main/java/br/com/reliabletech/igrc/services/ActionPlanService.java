package br.com.reliabletech.igrc.services;

import org.springframework.transaction.annotation.Transactional;

import br.com.reliabletech.igrc.models.ActionPlan;

@Transactional
public interface ActionPlanService {

	public void save(ActionPlan actionplan);
}
