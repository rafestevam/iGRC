package br.com.reliabletech.igrc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reliabletech.igrc.models.Control;
import br.com.reliabletech.igrc.repositories.ControlRepository;

@Service
public class ControlServiceImpl implements ControlService {

	@Autowired
	private ControlRepository controlRepository;
	
	public void save(Control control) {
		controlRepository.save(control);
	}

}
