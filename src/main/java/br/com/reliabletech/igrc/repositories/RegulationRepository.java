package br.com.reliabletech.igrc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reliabletech.igrc.models.Regulation;

public interface RegulationRepository extends JpaRepository<Regulation, Long> {

	public Regulation findByGuid(String guid);
}
