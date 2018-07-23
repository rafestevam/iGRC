package br.com.reliabletech.igrc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.reliabletech.igrc.models.Issue;

public interface IssueRepository extends JpaRepository<Issue, Long>{

}
