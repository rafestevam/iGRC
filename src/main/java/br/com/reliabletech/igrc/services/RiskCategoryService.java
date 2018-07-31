package br.com.reliabletech.igrc.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import br.com.reliabletech.igrc.models.RiskCategory;

@Transactional
public interface RiskCategoryService {

	public void save(RiskCategory riskcategory);
	
	public List<RiskCategory> findAll();
	
	public RiskCategory findByGuid(String guid);
	
	public void delete(RiskCategory riskcategory);
	
}
