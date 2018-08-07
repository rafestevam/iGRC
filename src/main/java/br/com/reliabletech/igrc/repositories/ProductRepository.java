package br.com.reliabletech.igrc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reliabletech.igrc.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	public Product findByGuid(String guid);
	

}
