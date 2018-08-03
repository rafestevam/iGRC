package br.com.reliabletech.igrc.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.reliabletech.igrc.models.TestPlan;
import br.com.reliabletech.igrc.repositories.TestPlanRepository;

@Service
public class TestPlanServiceImpl implements TestPlanService {

	@Autowired
	private TestPlanRepository testplanRepository;
	
	public void save(TestPlan testplan) {
		
		String guid = "";
		if(testplan.getGuid() == null){
			guid = UUID.randomUUID().toString();
			testplan.setGuid(guid);
		}
		testplanRepository.save(testplan);
	}
	
	public List<TestPlan> findAll() {
		return testplanRepository.findAll();
	}

	public TestPlan findByGuid(String guid) {
		return testplanRepository.findByGuid(guid);
	}

	public void delete(TestPlan testplan) {
		testplanRepository.delete(testplan);
	}	

}
