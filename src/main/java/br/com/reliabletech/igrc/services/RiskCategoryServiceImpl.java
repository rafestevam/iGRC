package br.com.reliabletech.igrc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reliabletech.igrc.models.RiskCategory;
import br.com.reliabletech.igrc.repositories.RiskCategoryRepository;

@Service
public class RiskCategoryServiceImpl implements RiskCategoryService {

	@Autowired
	private RiskCategoryRepository riskcategoryRepository;
	
	public void save(RiskCategory riskcategory) {
		riskcategoryRepository.save(riskcategory);
	}

}
