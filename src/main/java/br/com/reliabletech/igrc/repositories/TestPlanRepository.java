package br.com.reliabletech.igrc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reliabletech.igrc.models.TestPlan;

public interface TestPlanRepository extends JpaRepository<TestPlan, Long> {

	public TestPlan findByGuid(String guid);

}
