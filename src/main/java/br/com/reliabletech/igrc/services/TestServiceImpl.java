package br.com.reliabletech.igrc.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reliabletech.igrc.models.Test;
import br.com.reliabletech.igrc.repositories.TestRepository;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestRepository testRepository;
	
	public void save(Test test) {
		String guid = "";
		if(test.getGuid() == null){
			guid = UUID.randomUUID().toString();
			test.setGuid(guid);
		}else {
			if(test.getGuid().isEmpty()) {
				guid = UUID.randomUUID().toString();
				test.setGuid(guid);
			}
		}
		testRepository.save(test);
	}
	
	public List<Test> findAll() {
		return testRepository.findAll();
	}

	public Test findByGuid(String guid) {
		return testRepository.findByGuid(guid);
	}

	public void delete(Test test) {
		testRepository.delete(test);
	}
}
