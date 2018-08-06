package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.reliabletech.igrc.models.AppSystem;
import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.services.AppSystemService;
import br.com.reliabletech.igrc.services.ParameterService;

@Controller
@RequestMapping("/appsystem")
public class AppSystemController {

	@Autowired
	private AppSystemService appsystemService;
	
	@Autowired
	private ParameterService parameterService;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String appsystemForm(@ModelAttribute("appsystem") AppSystem appsystem, Model model){

		List<Parameter> defenseLines = parameterService.findByParatype("defenseline");
		model.addAttribute("defenseLines", defenseLines);
		model.addAttribute("update", false);
		model.addAttribute("show", false);

		
		return "appsystem";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String showAppSystem(@RequestParam("guid") String guid, Model model) {
		
		AppSystem appsystem = appsystemService.findByGuid(guid);
		model.addAttribute("appsystem", appsystem);
		model.addAttribute("update", false);
		model.addAttribute("show", true);
		
		return "appsystem";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=create")
	public String createAppSystem(AppSystem appsystem, Model model){
		
		appsystemService.save(appsystem);
		model.addAttribute("successMessage", "System created sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=update")
	public String updateAppSystem(AppSystem appsystem, Model model){
		
		appsystemService.save(appsystem);
		model.addAttribute("successMessage", "System updated sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String appsystemList(Model model){
		
		List<AppSystem> appsystems = appsystemService.findAll();
		model.addAttribute("appsystems", appsystems);
		
		return "appsystemview";
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteAppSystem(@RequestParam("guid") String guid, Model model){
		
		AppSystem appsystem = appsystemService.findByGuid(guid);
		appsystemService.delete(appsystem);
		List<AppSystem> appsystems = appsystemService.findAll();
		model.addAttribute("appsystems", appsystems);
		
		return "appsystemlist";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateAppSystem(@RequestParam("guid") String guid, Model model){
		
		AppSystem appsystem = appsystemService.findByGuid(guid);
		model.addAttribute("appsystem", appsystem);
		model.addAttribute("update", true);
		
		return "appsystem";
		
	}
	
}
