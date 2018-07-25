package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.models.StruProcess;
import br.com.reliabletech.igrc.services.ParameterService;
import br.com.reliabletech.igrc.services.ProcessService;

@Controller
@RequestMapping("/process")
public class ProcessController {

	@Autowired
	private ProcessService processService;
	
	@Autowired
	private ParameterService parameterService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String processForm(@ModelAttribute("process")StruProcess process, Model model){

		List<Parameter> stdFreqs = parameterService.findByParatype("stdfreq");
		model.addAttribute("stdFreqs", stdFreqs);
				
		return "process";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String createProcess(StruProcess process, Model model){
		
		processService.save(process);
		model.addAttribute("successMessage", "Process created sucessfully!");
		
		return "process";
		
	}
	
}
