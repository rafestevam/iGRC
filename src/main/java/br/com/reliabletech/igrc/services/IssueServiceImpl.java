package br.com.reliabletech.igrc.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reliabletech.igrc.models.Issue;
import br.com.reliabletech.igrc.repositories.IssueRepository;

@Service
public class IssueServiceImpl implements IssueService {

	@Autowired
	private IssueRepository issueRepository;
	
	public void save(Issue issue) {
		String guid = "";
		if(issue.getGuid() == null){
			guid = UUID.randomUUID().toString();
			issue.setGuid(guid);
		}
		issueRepository.save(issue);
	}

}
