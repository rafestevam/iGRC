package br.com.reliabletech.igrc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reliabletech.igrc.models.ActionPlan;

public interface ActionPlanRepository extends JpaRepository<ActionPlan, Long> {

	public ActionPlan findByGuid(String guid);

}
