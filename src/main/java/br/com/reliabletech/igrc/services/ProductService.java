package br.com.reliabletech.igrc.services;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import br.com.reliabletech.igrc.models.Product;

@Transactional
public interface ProductService {

	public void save(Product product);
	
	public List<Product> findAll();
	
	public Product findByGuid(String guid);
	
	public void delete(Product product);	
}
