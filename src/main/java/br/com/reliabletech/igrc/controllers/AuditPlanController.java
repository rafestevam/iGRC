package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.reliabletech.igrc.models.AuditPlan;
import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.services.AuditPlanService;
import br.com.reliabletech.igrc.services.ParameterService;

@Controller
@RequestMapping("/auditplan")
public class AuditPlanController {

	@Autowired
	private AuditPlanService auditplanService;
	
	@Autowired
	private ParameterService parameterService;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String auditplanForm(@ModelAttribute("auditplan") AuditPlan auditplan, Model model){

		List<Parameter> audittypes = parameterService.findByParatype("audittype");
		model.addAttribute("audittypes", audittypes);
		model.addAttribute("update", false);
		model.addAttribute("show", false);
		
		return "auditplan";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String showAuditPlan(@RequestParam("guid") String guid, Model model) {
		
		AuditPlan auditplan = auditplanService.findByGuid(guid);
		model.addAttribute("auditplan", auditplan);
		model.addAttribute("update", false);
		model.addAttribute("show", true);
		
		return "auditplan";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=create")
	public String createAuditPlan(AuditPlan auditplan, Model model){
		
		auditplanService.save(auditplan);
		model.addAttribute("successMessage", "Audit Plan created sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=update")
	public String updateAuditPlan(AuditPlan auditplan, Model model){
		
		auditplanService.save(auditplan);
		model.addAttribute("successMessage", "Audit Plan updated sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String auditplanList(Model model){
		
		List<AuditPlan> auditplans = auditplanService.findAll();
		model.addAttribute("auditplans", auditplans);
		
		return "auditplanview";
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteAuditPlan(@RequestParam("guid") String guid, Model model){
		
		AuditPlan auditplan = auditplanService.findByGuid(guid);
		auditplanService.delete(auditplan);
		List<AuditPlan> auditplans = auditplanService.findAll();
		model.addAttribute("auditplans", auditplans);
		
		return "auditplanlist";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateAuditPlan(@RequestParam("guid") String guid, Model model){
		
		List<Parameter> audittypes = parameterService.findByParatype("audittype");
		model.addAttribute("audittypes", audittypes);
		
		AuditPlan auditplan = auditplanService.findByGuid(guid);
		model.addAttribute("auditplan", auditplan);
		model.addAttribute("update", true);
		
		return "auditplan";
		
	}
	
}
