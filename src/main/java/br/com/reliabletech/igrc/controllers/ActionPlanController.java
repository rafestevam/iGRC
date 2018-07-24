package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.reliabletech.igrc.models.ActionPlan;
import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.services.ActionPlanService;
import br.com.reliabletech.igrc.services.ParameterService;

@Controller
@RequestMapping("/actionplan")
public class ActionPlanController {

	@Autowired
	private ActionPlanService actionplanService;
	
	@Autowired
	private ParameterService parameterService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String actionplanForm(@ModelAttribute("actionplan") ActionPlan actionplan, Model model){

		List<Parameter> defenseLines = parameterService.findByParatype("defenseline");
		model.addAttribute("defenseLines", defenseLines);
		
		return "actionplan";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String createActionPlan(ActionPlan actionplan, Model model){
		
		actionplanService.save(actionplan);
		model.addAttribute("successMessage", "Action Plan created sucessfully!");
		
		return "actionplan";
		
	}
	
}
