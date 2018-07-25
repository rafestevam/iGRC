package br.com.reliabletech.igrc.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reliabletech.igrc.models.StruProcess;
import br.com.reliabletech.igrc.repositories.ProcessRepository;

@Service
public class ProcessServiceImpl implements ProcessService {

	@Autowired
	private ProcessRepository processRepository;

	public void save(StruProcess process) {
		String guid = "";
		if(process.getGuid() == null){
			guid = UUID.randomUUID().toString();
			process.setGuid(guid);
		}
		processRepository.save(process);
	}


}
