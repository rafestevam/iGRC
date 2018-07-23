package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.reliabletech.igrc.models.Issue;
import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.services.IssueService;
import br.com.reliabletech.igrc.services.ParameterService;

@Controller
@RequestMapping("/issue")
public class IssueController {

	@Autowired
	private IssueService issueService;
	
	@Autowired
	private ParameterService parameterService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String issueForm(Issue issue, Model model){

		List<Parameter> defenseLines = parameterService.findByParatype("defenseline");
		model.addAttribute("defenseLines", defenseLines);
		
		return "issue";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String createIssue(Issue issue, Model model){
		
		issueService.save(issue);
		model.addAttribute("successMessage", "Issue created sucessfully!");
		
		return "issue";
		
	}
	
}
