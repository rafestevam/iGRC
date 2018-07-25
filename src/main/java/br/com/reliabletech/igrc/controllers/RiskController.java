package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.models.Risk;
import br.com.reliabletech.igrc.services.ParameterService;
import br.com.reliabletech.igrc.services.RiskService;

@Controller
@RequestMapping("/risk")
public class RiskController {

	@Autowired
	private RiskService riskService;
	
	@Autowired
	private ParameterService parameterService;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String riskForm(Risk risk, Model model){

		List<Parameter> stdFreqs = parameterService.findByParatype("stdfreq");
		model.addAttribute("stdFreqs", stdFreqs);
		model.addAttribute("update", false);
		model.addAttribute("show", false);
				
		return "risk";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String showRisk(@RequestParam("guid") String guid, Model model) {
		
		Risk risk = riskService.findByGuid(guid);
		model.addAttribute("risk", risk);
		model.addAttribute("update", false);
		model.addAttribute("show", true);
		
		return "risk";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=create")
	public String createRisk(Risk risk, Model model){
		
		riskService.save(risk);
		model.addAttribute("successMessage", "Risk created sucessfully!");
		
		//return "risk";
		return "redirect:list";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=update")
	public String updateRisk(Risk risk, Model model){
		
		riskService.save(risk);
		model.addAttribute("successMessage", "Risk updated sucessfully!");
		
		//return "risk";
		return "redirect:list";
		
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String riskList(Model model){
		
		List<Risk> risks = riskService.findAll();
		model.addAttribute("risks", risks);
		
		return "risklist";
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteRisk(@RequestParam("guid") String guid, Model model){
		
		Risk risk = riskService.findByGuid(guid);
		riskService.delete(risk);
		List<Risk> risks = riskService.findAll();
		model.addAttribute("risks", risks);
		
		return "risklist";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateRisk(@RequestParam("guid") String guid, Model model){
		
		Risk risk = riskService.findByGuid(guid);
		model.addAttribute("risk", risk);
		model.addAttribute("update", true);
		
		return "risk";
		
	}
	
	
	
}
