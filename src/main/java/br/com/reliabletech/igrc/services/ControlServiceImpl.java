package br.com.reliabletech.igrc.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reliabletech.igrc.models.Control;
import br.com.reliabletech.igrc.repositories.ControlRepository;

@Service
public class ControlServiceImpl implements ControlService {

	@Autowired
	private ControlRepository controlRepository;
	
	public void save(Control control) {
		String guid = "";
		if(control.getGuid() == null){
			guid = UUID.randomUUID().toString();
			control.setGuid(guid);
		}
		controlRepository.save(control);
	}

	public List<Control> findAll() {
		return controlRepository.findAll();
	}

	public Control findByGuid(String guid) {
		return controlRepository.findByGuid(guid);
	}

}
