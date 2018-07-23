package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.models.Test;
import br.com.reliabletech.igrc.services.ParameterService;
import br.com.reliabletech.igrc.services.TestService;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestService testService;
	
	@Autowired
	private ParameterService parameterService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String testForm(Test test, Model model){

		List<Parameter> defenseLines = parameterService.findByParatype("defenseline");
		model.addAttribute("defenseLines", defenseLines);
				
		return "test";
	}
	
	@RequestMapping(value="/execute", method=RequestMethod.POST)
	public String createRisk(Test test, Model model){
		
		testService.save(test);
		model.addAttribute("successMessage", "Test Execution Finished!");
		
		return "test";
		
	}
	
}
