package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.models.Regulation;
import br.com.reliabletech.igrc.services.ParameterService;
import br.com.reliabletech.igrc.services.RegulationService;

@Controller
@RequestMapping("/regulation")
public class RegulationController {

	@Autowired
	private RegulationService regulationService;
	
	@Autowired
	private ParameterService parameterService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String regulationForm(Regulation regulation, Model model){

		List<Parameter> stdFreqs = parameterService.findByParatype("stdfreq");
		model.addAttribute("stdFreqs", stdFreqs);
				
		return "regulation";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String createRegulation(Regulation regulation, Model model){
		
		regulationService.save(regulation);
		model.addAttribute("successMessage", "Regulation created sucessfully!");
		
		return "regulation";
		
	}
	
}
