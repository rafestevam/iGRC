package br.com.reliabletech.igrc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reliabletech.igrc.models.AuditPlan;

public interface AuditPlanRepository extends JpaRepository<AuditPlan, Long> {

	public AuditPlan findByGuid(String guid);

}
