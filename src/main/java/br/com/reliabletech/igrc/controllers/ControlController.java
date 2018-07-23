package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.reliabletech.igrc.models.Control;
import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.services.ControlService;
import br.com.reliabletech.igrc.services.ParameterService;

@Controller
@RequestMapping("/control")
public class ControlController {

	@Autowired
	private ControlService controlService;
	
	@Autowired
	private ParameterService parameterService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String controlForm(Control control, Model model){
		
		List<Parameter> controlTypes = parameterService.findNonExactParamid("ctrltype%");
		model.addAttribute("controlTypes", controlTypes);
		
		//copie aqui para novas listas de combo
		List<Parameter> controlFreqs = parameterService.findByParatype("ctrlfreq");
		model.addAttribute("controlFreqs", controlFreqs);

		List<Parameter> controlClasses = parameterService.findByParatype("ctrlclass");
		model.addAttribute("controlClasses", controlClasses);
		
		return "control";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String createControl(Control control, Model model){
		
		controlService.save(control);
		model.addAttribute("successMessage", "Control created sucessfully!");
		
		return "control";
		
	}
	
}
