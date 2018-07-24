package br.com.reliabletech.igrc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reliabletech.igrc.models.StruProcess;

public interface ProcessRepository extends JpaRepository<StruProcess, Long>{

}
