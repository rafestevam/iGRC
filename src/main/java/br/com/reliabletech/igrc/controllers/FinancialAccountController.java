package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.reliabletech.igrc.models.FinancialAccount;
import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.services.FinancialAccountService;
import br.com.reliabletech.igrc.services.ParameterService;

@Controller
@RequestMapping("/financialaccount")
public class FinancialAccountController {

	@Autowired
	private FinancialAccountService financialaccountService;
	
	@Autowired
	private ParameterService parameterService;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String financialaccountForm(@ModelAttribute("financialaccount") FinancialAccount financialaccount, Model model){

		List<Parameter> defenseLines = parameterService.findByParatype("defenseline");
		model.addAttribute("defenseLines", defenseLines);
		model.addAttribute("update", false);
		model.addAttribute("show", false);

		
		return "financialaccount";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String showFinancialAccount(@RequestParam("guid") String guid, Model model) {
		
		FinancialAccount financialaccount = financialaccountService.findByGuid(guid);
		model.addAttribute("financialaccount", financialaccount);
		model.addAttribute("update", false);
		model.addAttribute("show", true);
		
		return "financialaccount";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=create")
	public String createFinancialAccount(FinancialAccount financialaccount, Model model){
		
		financialaccountService.save(financialaccount);
		model.addAttribute("successMessage", "Action Plan created sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=update")
	public String updateFinancialAccount(FinancialAccount financialaccount, Model model){
		
		financialaccountService.save(financialaccount);
		model.addAttribute("successMessage", "Action Plan updated sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String financialaccountList(Model model){
		
		List<FinancialAccount> financialaccounts = financialaccountService.findAll();
		model.addAttribute("financialaccounts", financialaccounts);
		
		return "financialaccountview";
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteFinancialAccount(@RequestParam("guid") String guid, Model model){
		
		FinancialAccount financialaccount = financialaccountService.findByGuid(guid);
		financialaccountService.delete(financialaccount);
		List<FinancialAccount> financialaccounts = financialaccountService.findAll();
		model.addAttribute("financialaccounts", financialaccounts);
		
		return "financialaccountlist";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateFinancialAccount(@RequestParam("guid") String guid, Model model){
		
		FinancialAccount financialaccount = financialaccountService.findByGuid(guid);
		model.addAttribute("financialaccount", financialaccount);
		model.addAttribute("update", true);
		
		return "financialaccount";
		
	}
	
}
