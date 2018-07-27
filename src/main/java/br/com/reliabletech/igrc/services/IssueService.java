package br.com.reliabletech.igrc.services;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import br.com.reliabletech.igrc.models.Issue;

@Transactional
public interface IssueService {

	public void save(Issue issue);
	
	public List<Issue> findAll();
	
	public Issue findByGuid(String guid);
	
	public void delete(Issue issue);	
}
