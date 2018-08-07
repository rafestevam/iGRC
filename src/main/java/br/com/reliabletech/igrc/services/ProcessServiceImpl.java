package br.com.reliabletech.igrc.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reliabletech.igrc.models.ProcessStru;
import br.com.reliabletech.igrc.repositories.ProcessRepository;

@Service
public class ProcessServiceImpl implements ProcessService {

	@Autowired
	private ProcessRepository processRepository;

	public void save(ProcessStru process) {
		String guid = "";
		if(process.getGuid() == null){
			guid = UUID.randomUUID().toString();
			process.setGuid(guid);
		}
		processRepository.save(process);
	}
	
	public List<ProcessStru> findAll() {
		return processRepository.findAll();
	}

	public ProcessStru findByGuid(String guid) {
		return processRepository.findByGuid(guid);
	}

	public void delete(ProcessStru process) {
		processRepository.delete(process);
	}

}
