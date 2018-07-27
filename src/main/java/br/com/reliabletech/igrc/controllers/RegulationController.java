package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String regulationForm(Regulation regulation, Model model){

		List<Parameter> stdFreqs = parameterService.findByParatype("stdfreq");
		model.addAttribute("stdFreqs", stdFreqs);
		model.addAttribute("update", false);
		model.addAttribute("show", false);
				
		return "regulation";
	}

	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String showRegulation(@RequestParam("guid") String guid, Model model) {
		
		Regulation regulation = regulationService.findByGuid(guid);
		model.addAttribute("regulation", regulation);
		model.addAttribute("update", false);
		model.addAttribute("show", true);
		
		return "regulation";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=create")
	public String createRegulation(Regulation regulation, Model model){
		
		regulationService.save(regulation);
		model.addAttribute("successMessage", "Regulation created sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=update")
	public String updateRegulation(Regulation regulation, Model model){
		
		regulationService.save(regulation);
		model.addAttribute("successMessage", "Regulation updated sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String regulationList(Model model){
		
		List<Regulation> regulations = regulationService.findAll();
		model.addAttribute("regulations", regulations);
		
		return "regulationview";
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteRegulation(@RequestParam("guid") String guid, Model model){
		
		Regulation regulation = regulationService.findByGuid(guid);
		regulationService.delete(regulation);
		List<Regulation> regulations = regulationService.findAll();
		model.addAttribute("regulations", regulations);
		
		return "regulationlist";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateRegulation(@RequestParam("guid") String guid, Model model){
		
		Regulation regulation = regulationService.findByGuid(guid);
		model.addAttribute("regulation", regulation);
		model.addAttribute("update", true);
		
		return "regulation";
		
	}
	
}
