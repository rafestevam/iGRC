package br.com.reliabletech.igrc.services;


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reliabletech.igrc.models.RiskCategory;
import br.com.reliabletech.igrc.repositories.RiskCategoryRepository;

@Service
public class RiskCategoryServiceImpl implements RiskCategoryService {

	@Autowired
	private RiskCategoryRepository riskcategoryRepository;
	
	public void save(RiskCategory riskcategory) {
		String guid = "";
		if(riskcategory.getGuid() == null){
			guid = UUID.randomUUID().toString();
			riskcategory.setGuid(guid);
		}
		riskcategoryRepository.save(riskcategory);
	}
	
	public List<RiskCategory> findAll() {
		return riskcategoryRepository.findAll();
	}

	public RiskCategory findByGuid(String guid) {
		return riskcategoryRepository.findByGuid(guid);
	}

	public void delete(RiskCategory riskcategory) {
		riskcategoryRepository.delete(riskcategory);
	}
	
}
