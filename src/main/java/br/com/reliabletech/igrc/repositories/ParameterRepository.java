package br.com.reliabletech.igrc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.reliabletech.igrc.models.Parameter;

public interface ParameterRepository extends JpaRepository<Parameter, Long>{
	
	Parameter findByParamid(String paramid);
	
	@Query("select p from Parameter p where p.paramid like ?1")
	List<Parameter> findNonExactParamid(String paramid);
	
	List<Parameter> findByParatype(String paratype);
	
	public Parameter findByGuid(String guid);
	
	@Query(value = "SELECT * FROM Parameter LIMIT 5", nativeQuery = true)
	public List<Parameter> findTop10();

}
