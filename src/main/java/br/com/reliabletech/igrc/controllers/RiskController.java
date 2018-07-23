package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String riskForm(Risk risk, Model model){

		List<Parameter> stdFreqs = parameterService.findByParatype("stdfreq");
		model.addAttribute("stdFreqs", stdFreqs);
				
		return "risk";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String createRisk(Risk risk, Model model){
		
		riskService.save(risk);
		model.addAttribute("successMessage", "Risk created sucessfully!");
		
		return "risk";
		
	}
	
}
