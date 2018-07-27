package br.com.reliabletech.igrc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.reliabletech.igrc.models.Risk;

public interface RiskRepository extends JpaRepository<Risk, Long> {
	
	public Risk findByGuid(String guid);
	
	@Query("select case when count(*) > 0 then 'true' else 'false' end from Risk r where r.guid = ?1 ")
	public boolean existsByGuid(String guid);
	
}
