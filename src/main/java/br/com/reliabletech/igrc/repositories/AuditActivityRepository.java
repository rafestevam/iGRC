package br.com.reliabletech.igrc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reliabletech.igrc.models.AuditActivity;

public interface AuditActivityRepository extends JpaRepository<AuditActivity, Long> {

	public AuditActivity findByGuid(String guid);

}
