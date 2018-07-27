package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.services.ParameterService;

@Controller
@RequestMapping("/parameter")
public class ParameterController {

	@Autowired
	private ParameterService parameterService;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String parameterForm(Parameter parameter, Model model){
		
		model.addAttribute("update", false);
		model.addAttribute("show", false);
		return "parameter";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String showParameter(@RequestParam("guid") String guid, Model model) {
		
		Parameter parameter = parameterService.findByGuid(guid);
		model.addAttribute("parameter", parameter);
		model.addAttribute("update", false);
		model.addAttribute("show", true);
		
		return "parameter";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=create")
	public String createParameter(Parameter parameter, Model model){
		
		parameterService.save(parameter);
		model.addAttribute("successMessage", "Parameter created sucessfully!");
		
		return "redirect:view";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=update")
	public String updateParameter(Parameter parameter, Model model){
		
		parameterService.save(parameter);
		model.addAttribute("successMessage", "Parameter updated sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String parameterList(Model model){
		
		List<Parameter> parameters = parameterService.findAll();
//		List<Parameter> parameters = parameterService.findTop10();
		model.addAttribute("parameters", parameters);
		
		return "parameterview";
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteParameter(@RequestParam("guid") String guid, Model model){
		
		Parameter parameter = parameterService.findByGuid(guid);
		parameterService.delete(parameter);
		List<Parameter> parameters = parameterService.findAll();
		model.addAttribute("parameters", parameters);
		
		return "parameterlist";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateParameter(@RequestParam("guid") String guid, Model model){
		
		Parameter parameter = parameterService.findByGuid(guid);
		model.addAttribute("parameter", parameter);
		model.addAttribute("update", true);
		
		return "parameter";
		
	}
	
	
}
