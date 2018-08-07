package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.reliabletech.igrc.models.OrgUnit;
import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.services.OrgUnitService;
import br.com.reliabletech.igrc.services.ParameterService;

@Controller
@RequestMapping("/orgunit")
public class OrgUnitController {

	@Autowired
	private OrgUnitService orgunitService;
	
	@Autowired
	private ParameterService parameterService;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String orgunitForm(@ModelAttribute("orgunit") OrgUnit orgunit, Model model){

		List<Parameter> defenseLines = parameterService.findByParatype("defenseline");
		model.addAttribute("defenseLines", defenseLines);
		model.addAttribute("update", false);
		model.addAttribute("show", false);

		
		return "orgunit";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String showOrgUnit(@RequestParam("guid") String guid, Model model) {
		
		OrgUnit orgunit = orgunitService.findByGuid(guid);
		model.addAttribute("orgunit", orgunit);
		model.addAttribute("update", false);
		model.addAttribute("show", true);
		
		return "orgunit";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=create")
	public String createOrgUnit(OrgUnit orgunit, Model model){
		
		orgunitService.save(orgunit);
		model.addAttribute("successMessage", "Organizational Unit created sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=update")
	public String updateOrgUnit(OrgUnit orgunit, Model model){
		
		orgunitService.save(orgunit);
		model.addAttribute("successMessage", "Organizational Unit updated sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String orgunitList(Model model){
		
		List<OrgUnit> orgunits = orgunitService.findAll();
		model.addAttribute("orgunits", orgunits);
		
		return "orgunitview";
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteOrgUnit(@RequestParam("guid") String guid, Model model){
		
		OrgUnit orgunit = orgunitService.findByGuid(guid);
		orgunitService.delete(orgunit);
		List<OrgUnit> orgunits = orgunitService.findAll();
		model.addAttribute("orgunits", orgunits);
		
		return "orgunitlist";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateOrgUnit(@RequestParam("guid") String guid, Model model){
		
		OrgUnit orgunit = orgunitService.findByGuid(guid);
		model.addAttribute("orgunit", orgunit);
		model.addAttribute("update", true);
		
		return "orgunit";
		
	}
	
}
