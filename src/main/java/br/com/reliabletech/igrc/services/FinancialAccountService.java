package br.com.reliabletech.igrc.services;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import br.com.reliabletech.igrc.models.FinancialAccount;

@Transactional
public interface FinancialAccountService {

	public void save(FinancialAccount financialaccount);

	public List<FinancialAccount> findAll();
	
	public FinancialAccount findByGuid(String guid);
	
	public void delete(FinancialAccount financialaccount);	
	
}
