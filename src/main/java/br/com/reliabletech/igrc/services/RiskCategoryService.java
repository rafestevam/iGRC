package br.com.reliabletech.igrc.services;

import org.springframework.transaction.annotation.Transactional;

import br.com.reliabletech.igrc.models.RiskCategory;

@Transactional
public interface RiskCategoryService {

	public void save(RiskCategory riskcategory);
}
