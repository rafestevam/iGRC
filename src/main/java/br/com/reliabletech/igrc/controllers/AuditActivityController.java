package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.reliabletech.igrc.models.AuditActivity;
import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.services.AuditActivityService;
import br.com.reliabletech.igrc.services.ParameterService;

@Controller
@RequestMapping("/auditactivity")
public class AuditActivityController {

	@Autowired
	private AuditActivityService auditactivityService;
	
	@Autowired
	private ParameterService parameterService;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String auditactivityForm(@ModelAttribute("auditactivity") AuditActivity auditactivity, Model model){

		List<Parameter> defenseLines = parameterService.findByParatype("defenseline");
		model.addAttribute("defenseLines", defenseLines);
		model.addAttribute("update", false);
		model.addAttribute("show", false);

		
		return "auditactivity";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String showAuditActivity(@RequestParam("guid") String guid, Model model) {
		
		AuditActivity auditactivity = auditactivityService.findByGuid(guid);
		model.addAttribute("auditactivity", auditactivity);
		model.addAttribute("update", false);
		model.addAttribute("show", true);
		
		return "auditactivity";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=create")
	public String createAuditActivity(AuditActivity auditactivity, Model model){
		
		auditactivityService.save(auditactivity);
		model.addAttribute("successMessage", "Audit Activity created sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=update")
	public String updateAuditActivity(AuditActivity auditactivity, Model model){
		
		auditactivityService.save(auditactivity);
		model.addAttribute("successMessage", "Audit Activity updated sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String auditactivityList(Model model){
		
		List<AuditActivity> auditactivities = auditactivityService.findAll();
		model.addAttribute("auditactivities", auditactivities);
		
		return "auditactivityview";
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteAuditActivity(@RequestParam("guid") String guid, Model model){
		
		AuditActivity auditactivity = auditactivityService.findByGuid(guid);
		auditactivityService.delete(auditactivity);
		List<AuditActivity> auditactivities = auditactivityService.findAll();
		model.addAttribute("auditactivities", auditactivities);
		
		return "auditactivitylist";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateAuditActivity(@RequestParam("guid") String guid, Model model){
		
		AuditActivity auditactivity = auditactivityService.findByGuid(guid);
		model.addAttribute("auditactivity", auditactivity);
		model.addAttribute("update", true);
		
		return "auditactivity";
		
	}
	
}
