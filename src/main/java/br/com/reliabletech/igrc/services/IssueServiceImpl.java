package br.com.reliabletech.igrc.services;

import java.util.List;
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
		}else {
			if(issue.getGuid().isEmpty()) {
				guid = UUID.randomUUID().toString();
				issue.setGuid(guid);
			}
		}
		issueRepository.save(issue);
	}

	public List<Issue> findAll() {
		return issueRepository.findAll();
	}

	public Issue findByGuid(String guid) {
		return issueRepository.findByGuid(guid);
	}

	public void delete(Issue issue) {
		issueRepository.delete(issue);
	}
}
