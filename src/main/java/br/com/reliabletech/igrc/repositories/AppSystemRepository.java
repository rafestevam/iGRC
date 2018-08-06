package br.com.reliabletech.igrc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reliabletech.igrc.models.AppSystem;

public interface AppSystemRepository extends JpaRepository<AppSystem, Long> {

	public AppSystem findByGuid(String guid);

}
