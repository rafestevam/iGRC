package br.com.reliabletech.igrc.services;

import org.springframework.transaction.annotation.Transactional;

import br.com.reliabletech.igrc.models.Issue;

@Transactional
public interface IssueService {

	public void save(Issue issue);
	
}
