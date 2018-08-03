package br.com.reliabletech.igrc.services;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import br.com.reliabletech.igrc.models.TestPlan;

@Transactional
public interface TestPlanService {

	public void save(TestPlan testplan);

	public List<TestPlan> findAll();
	
	public TestPlan findByGuid(String guid);
	
	public void delete(TestPlan testplan);	
	
}
