package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String issueForm(Issue issue, Model model){

		List<Parameter> defenseLines = parameterService.findByParatype("defenseline");
		model.addAttribute("defenseLines", defenseLines);
		model.addAttribute("update", false);
		model.addAttribute("show", false);
		
		return "issue";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String showIssue(@RequestParam("guid") String guid, Model model) {
		
		Issue issue = issueService.findByGuid(guid);
		model.addAttribute("issue", issue);
		model.addAttribute("update", false);
		model.addAttribute("show", true);
		
		return "issue";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=create")
	public String createIssue(Issue issue, Model model){
		
		issueService.save(issue);
		model.addAttribute("successMessage", "Issue created sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=update")
	public String updateIssue(Issue issue, Model model){
		
		issueService.save(issue);
		model.addAttribute("successMessage", "Issue updated sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String issueList(Model model){
		
		List<Issue> issues = issueService.findAll();
		model.addAttribute("issues", issues);
		
		return "issueview";
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteIssue(@RequestParam("guid") String guid, Model model){
		
		Issue issue = issueService.findByGuid(guid);
		issueService.delete(issue);
		List<Issue> issues = issueService.findAll();
		model.addAttribute("issues", issues);
		
		return "issuelist";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateIssue(@RequestParam("guid") String guid, Model model){
		
		Issue issue = issueService.findByGuid(guid);
		model.addAttribute("issue", issue);
		model.addAttribute("update", true);
		
		return "issue";
		
	}
	
}
