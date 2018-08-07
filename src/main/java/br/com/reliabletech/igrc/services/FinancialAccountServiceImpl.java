package br.com.reliabletech.igrc.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.reliabletech.igrc.models.FinancialAccount;
import br.com.reliabletech.igrc.repositories.FinancialAccountRepository;

@Service
public class FinancialAccountServiceImpl implements FinancialAccountService {

	@Autowired
	private FinancialAccountRepository financialaccountRepository;
	
	public void save(FinancialAccount financialaccount) {
		
		String guid = "";
		if(financialaccount.getGuid() == null){
			guid = UUID.randomUUID().toString();
			financialaccount.setGuid(guid);
		}
		financialaccountRepository.save(financialaccount);
	}
	
	public List<FinancialAccount> findAll() {
		return financialaccountRepository.findAll();
	}

	public FinancialAccount findByGuid(String guid) {
		return financialaccountRepository.findByGuid(guid);
	}

	public void delete(FinancialAccount financialaccount) {
		financialaccountRepository.delete(financialaccount);
	}	

}
