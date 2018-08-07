package br.com.reliabletech.igrc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reliabletech.igrc.models.OrgUnit;

public interface OrgUnitRepository extends JpaRepository<OrgUnit, Long> {

	public OrgUnit findByGuid(String guid);

}
