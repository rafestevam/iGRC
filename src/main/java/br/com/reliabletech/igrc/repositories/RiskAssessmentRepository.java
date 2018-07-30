package br.com.reliabletech.igrc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reliabletech.igrc.models.RiskAssessment;

public interface RiskAssessmentRepository extends JpaRepository<RiskAssessment, Long> {

	public RiskAssessment findByGuid(String guid);

}
