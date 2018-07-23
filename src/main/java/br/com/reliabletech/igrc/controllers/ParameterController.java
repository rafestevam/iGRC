package br.com.reliabletech.igrc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.services.ParameterService;

@Controller
@RequestMapping("/parameter")
public class ParameterController {

	@Autowired
	private ParameterService parameterService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String parameterForm(Parameter parameter){
		return "parameter";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	@Transactional
	public String createParameter(Parameter parameter, Model model){
//		parameter.setParamid("crtl1");
		parameterService.save(parameter);
		model.addAttribute("successMessage", "Parameter created sucessfully!");
		return "parameter";
	}
	
}
