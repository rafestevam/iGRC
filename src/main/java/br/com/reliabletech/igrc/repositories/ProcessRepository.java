package br.com.reliabletech.igrc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reliabletech.igrc.models.ProcessStru;

public interface ProcessRepository extends JpaRepository<ProcessStru, Long>{

	public ProcessStru findByGuid(String guid);

}
