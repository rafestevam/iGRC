package br.com.reliabletech.igrc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reliabletech.igrc.models.Risk;

public interface RiskRepository extends JpaRepository<Risk, Long> {
	
	public Risk findByGuid(String guid);
	
}
