package br.com.reliabletech.igrc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reliabletech.igrc.models.Control;

public interface ControlRepository extends JpaRepository<Control, Long> {
	
	public Control findByGuid(String guid);

	public Control findByGuid(String guid);
	
}
