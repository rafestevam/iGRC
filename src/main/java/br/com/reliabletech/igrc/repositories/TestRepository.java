package br.com.reliabletech.igrc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reliabletech.igrc.models.Test;

public interface TestRepository extends JpaRepository<Test, Long>{

}
