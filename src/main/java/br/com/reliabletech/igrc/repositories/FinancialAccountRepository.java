package br.com.reliabletech.igrc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reliabletech.igrc.models.FinancialAccount;

public interface FinancialAccountRepository extends JpaRepository<FinancialAccount, Long> {

	public FinancialAccount findByGuid(String guid);

}
