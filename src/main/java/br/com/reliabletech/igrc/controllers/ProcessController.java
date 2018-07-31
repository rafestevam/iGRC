package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String processForm(@ModelAttribute("process")StruProcess process, Model model){

		List<Parameter> stdFreqs = parameterService.findByParatype("stdfreq");
		model.addAttribute("stdFreqs", stdFreqs);
		model.addAttribute("update", false);
		model.addAttribute("show", false);
				
		return "process";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String showProcess(@RequestParam("guid") String guid, Model model) {
		
		StruProcess process = processService.findByGuid(guid);
		model.addAttribute("process", process);
		model.addAttribute("update", false);
		model.addAttribute("show", true);
		
		return "process";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=create")
	public String createProcess(StruProcess process, Model model){
		
		processService.save(process);
		model.addAttribute("successMessage", "Process created sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=update")
	public String updateProcess(StruProcess process, Model model){
		
		processService.save(process);
		model.addAttribute("successMessage", "Process updated sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String processList(Model model){
		
		List<StruProcess> processes = processService.findAll();
		model.addAttribute("processes", processes);
		
		return "processview";
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteProcess(@RequestParam("guid") String guid, Model model){
		
		StruProcess process = processService.findByGuid(guid);
		processService.delete(process);
		List<StruProcess> processes = processService.findAll();
		model.addAttribute("processes", processes);
		
		return "processlist";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateProcess(@RequestParam("guid") String guid, Model model){
		
		StruProcess process = processService.findByGuid(guid);
		model.addAttribute("process", process);
		model.addAttribute("update", true);
		
		return "process";
		
	}
	
}
