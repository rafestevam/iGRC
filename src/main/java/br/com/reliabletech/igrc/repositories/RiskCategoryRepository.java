package br.com.reliabletech.igrc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reliabletech.igrc.models.RiskCategory;

public interface RiskCategoryRepository extends JpaRepository<RiskCategory, Long> {

	public RiskCategory findByGuid(String guid);

}
