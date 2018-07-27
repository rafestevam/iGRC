package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.reliabletech.igrc.models.Control;
import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.services.ControlService;
import br.com.reliabletech.igrc.services.ParameterService;

@Controller
@RequestMapping("/control")
public class ControlController {

	@Autowired
	private ControlService controlService;
	
	@Autowired
	private ParameterService parameterService;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String controlForm(Control control, Model model){
		
		List<Parameter> controlTypes = parameterService.findNonExactParamid("ctrltype%");
		model.addAttribute("controlTypes", controlTypes);
		
		//copie aqui para novas listas de combo
		List<Parameter> controlFreqs = parameterService.findByParatype("ctrlfreq");
		model.addAttribute("controlFreqs", controlFreqs);

		List<Parameter> controlClasses = parameterService.findByParatype("ctrlclass");
		model.addAttribute("controlClasses", controlClasses);
		model.addAttribute("update", false);
		model.addAttribute("show", false);
		
		return "control";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String showControl(@RequestParam("guid") String guid, Model model) {
		
		Control control = controlService.findByGuid(guid);
		model.addAttribute("control", control);
		model.addAttribute("update", false);
		model.addAttribute("show", true);
		
		return "control";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=create")
	public String createControl(Control control, Model model){
		
		controlService.save(control);
		model.addAttribute("successMessage", "Control created sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=update")
	public String updateControl(Control control, Model model){
		
		controlService.save(control);
		model.addAttribute("successMessage", "Control updated sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String controlView(Model model){
		
		List<Control> controls = controlService.findAll();
		model.addAttribute("controls", controls);
		
		return "controlview";
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteControl(@RequestParam("guid") String guid, Model model){
		
		Control control = controlService.findByGuid(guid);
		controlService.delete(control);
		List<Control> controls = controlService.findAll();
		model.addAttribute("controls", controls);
		
		return "controlview";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateRisk(@RequestParam("guid") String guid, Model model){
		
		Control control = controlService.findByGuid(guid);
		model.addAttribute("control", control);
		model.addAttribute("update", true);
		
		return "control";
		
	}
	
	
	
	
	
	
	
	
}
