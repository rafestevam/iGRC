package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.reliabletech.igrc.models.TestPlan;
import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.services.TestPlanService;
import br.com.reliabletech.igrc.services.ParameterService;

@Controller
@RequestMapping("/testplan")
public class TestPlanController {

	@Autowired
	private TestPlanService testplanService;
	
	@Autowired
	private ParameterService parameterService;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String testplanForm(@ModelAttribute("testplan") TestPlan testplan, Model model){

		List<Parameter> defenseLines = parameterService.findByParatype("defenseline");
		model.addAttribute("defenseLines", defenseLines);
		model.addAttribute("update", false);
		model.addAttribute("show", false);

		
		return "testplan";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String showTestPlan(@RequestParam("guid") String guid, Model model) {
		
		TestPlan testplan = testplanService.findByGuid(guid);
		model.addAttribute("testplan", testplan);
		model.addAttribute("update", false);
		model.addAttribute("show", true);
		
		return "testplan";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=create")
	public String createTestPlan(TestPlan testplan, Model model){
		
		testplanService.save(testplan);
		model.addAttribute("successMessage", "Action Plan created sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=update")
	public String updateTestPlan(TestPlan testplan, Model model){
		
		testplanService.save(testplan);
		model.addAttribute("successMessage", "Action Plan updated sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String testplanList(Model model){
		
		List<TestPlan> testplans = testplanService.findAll();
		model.addAttribute("testplans", testplans);
		
		return "testplanview";
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteTestPlan(@RequestParam("guid") String guid, Model model){
		
		TestPlan testplan = testplanService.findByGuid(guid);
		testplanService.delete(testplan);
		List<TestPlan> testplans = testplanService.findAll();
		model.addAttribute("testplans", testplans);
		
		return "testplanlist";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateTestPlan(@RequestParam("guid") String guid, Model model){

		List<Parameter> defenseLines = parameterService.findByParatype("defenseline");
		model.addAttribute("defenseLines", defenseLines);
		TestPlan testplan = testplanService.findByGuid(guid);
		model.addAttribute("testplan", testplan);
		model.addAttribute("update", true);
		
		return "testplan";
		
	}
	
}
