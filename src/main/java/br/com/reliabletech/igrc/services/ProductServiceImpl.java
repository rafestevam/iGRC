package br.com.reliabletech.igrc.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.reliabletech.igrc.models.Product;
import br.com.reliabletech.igrc.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public void save(Product product) {
		String guid = "";
		if(product.getGuid() == null){
			guid = UUID.randomUUID().toString();
			product.setGuid(guid);
		}
		productRepository.save(product);
	}

	public List<Product> findAll() {
		return productRepository.findAll();
	}

	public Product findByGuid(String guid) {
		return productRepository.findByGuid(guid);
	}

	public void delete(Product product) {
		productRepository.delete(product);
	}
}
