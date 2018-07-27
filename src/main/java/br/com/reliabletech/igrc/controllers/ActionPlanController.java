package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String actionplanForm(@ModelAttribute("actionplan") ActionPlan actionplan, Model model){

		List<Parameter> defenseLines = parameterService.findByParatype("defenseline");
		model.addAttribute("defenseLines", defenseLines);
		model.addAttribute("update", false);
		model.addAttribute("show", false);

		
		return "actionplan";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String showActionPlan(@RequestParam("guid") String guid, Model model) {
		
		ActionPlan actionplan = actionplanService.findByGuid(guid);
		model.addAttribute("actionplan", actionplan);
		model.addAttribute("update", false);
		model.addAttribute("show", true);
		
		return "actionplan";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=create")
	public String createActionPlan(ActionPlan actionplan, Model model){
		
		actionplanService.save(actionplan);
		model.addAttribute("successMessage", "Action Plan created sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=update")
	public String updateActionPlan(ActionPlan actionplan, Model model){
		
		actionplanService.save(actionplan);
		model.addAttribute("successMessage", "Action Plan updated sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String actionplanList(Model model){
		
		List<ActionPlan> actionplans = actionplanService.findAll();
		model.addAttribute("actionplans", actionplans);
		
		return "actionplanview";
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteActionPlan(@RequestParam("guid") String guid, Model model){
		
		ActionPlan actionplan = actionplanService.findByGuid(guid);
		actionplanService.delete(actionplan);
		List<ActionPlan> actionplans = actionplanService.findAll();
		model.addAttribute("actionplans", actionplans);
		
		return "actionplanlist";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateActionPlan(@RequestParam("guid") String guid, Model model){
		
		ActionPlan actionplan = actionplanService.findByGuid(guid);
		model.addAttribute("actionplan", actionplan);
		model.addAttribute("update", true);
		
		return "actionplan";
		
	}
	
}
