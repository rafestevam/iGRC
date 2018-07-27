package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping(value="/execute", method=RequestMethod.GET)
	public String testForm(Test test, Model model){

		List<Parameter> defenseLines = parameterService.findByParatype("defenseline");
		model.addAttribute("defenseLines", defenseLines);
		model.addAttribute("update", false);
		model.addAttribute("show", false);
				
		return "test";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String showTest(@RequestParam("guid") String guid, Model model) {
		
		Test test = testService.findByGuid(guid);
		model.addAttribute("test", test);
		model.addAttribute("update", false);
		model.addAttribute("show", true);
		
		return "test";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=execute")
	public String createTest(Test test, Model model){
		
		testService.save(test);
		model.addAttribute("successMessage", "Test executed sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=update")
	public String updateTest(Test test, Model model){
		
		testService.save(test);
		model.addAttribute("successMessage", "Test updated sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String testList(Model model){
		
		List<Test> tests = testService.findAll();
		model.addAttribute("tests", tests);
		
		return "testview";
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteTest(@RequestParam("guid") String guid, Model model){
		
		Test test = testService.findByGuid(guid);
		testService.delete(test);
		List<Test> tests = testService.findAll();
		model.addAttribute("tests", tests);
		
		return "testlist";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateTest(@RequestParam("guid") String guid, Model model){
		
		Test test = testService.findByGuid(guid);
		model.addAttribute("test", test);
		model.addAttribute("update", true);
		
		return "test";
		
	}

	
}
