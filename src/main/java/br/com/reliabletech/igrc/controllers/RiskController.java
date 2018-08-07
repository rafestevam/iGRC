package br.com.reliabletech.igrc.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.reliabletech.igrc.models.Control;
import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.models.Risk;
import br.com.reliabletech.igrc.services.ControlService;
import br.com.reliabletech.igrc.services.ParameterService;
import br.com.reliabletech.igrc.services.RiskService;

@Controller
@RequestMapping("/risk")
public class RiskController {

	@Autowired
	private RiskService riskService;
	
	@Autowired
	private ControlService controlService;
	
	@Autowired
	private ParameterService parameterService;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String riskForm(@ModelAttribute("risk") Risk risk, Model model){
		
		List<Control> controls = controlService.findAll();
		List<Control> controlsAux = new ArrayList<Control>();
		
		controls.forEach(
				control -> {
					if(!risk.getControls().contains(control))
						controlsAux.add(control);
				}
		);
		
		List<Parameter> stdFreqs = parameterService.findByParatype("stdfreq");
		model.addAttribute("stdFreqs", stdFreqs);
		model.addAttribute("update", false);
		model.addAttribute("show", false);
		model.addAttribute("controls", controlsAux);
				
		return "risk";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String showRisk(@RequestParam("guid") String guid, Model model) {
		
		Risk risk = riskService.findByGuid(guid);
		model.addAttribute("risk", risk);
		model.addAttribute("update", false);
		model.addAttribute("show", true);
		
		return "risk";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=create")
	public String createRisk(@ModelAttribute("risk") Risk risk, Model model){
		
		loadControls(risk);
		risk.setGuid(getGuid());
		riskService.save(risk);
		model.addAttribute("successMessage", "Risk created sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=update")
	public String updateRisk(Risk risk, Model model){
		
		loadControls(risk);
		riskService.save(risk);
		model.addAttribute("successMessage", "Risk updated sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String riskList(Model model){
		
		List<Risk> risks = riskService.findAll();
		model.addAttribute("risks", risks);
		
		return "riskview";
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteRisk(@RequestParam("guid") String guid, Model model){
		
		Risk risk = riskService.findByGuid(guid);
		riskService.delete(risk);
		List<Risk> risks = riskService.findAll();
		model.addAttribute("risks", risks);
		
		return "risklist";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateRisk(@RequestParam("guid") String guid, Model model){
		
		Risk risk = riskService.findByGuid(guid);
		
		List<Control> controls = controlService.findAll();
		List<Control> controlsAux = new ArrayList<Control>();
		
		controls.forEach(
				control -> {
					if(!risk.getControls().contains(control))
						controlsAux.add(control);
				}
		);
		
		model.addAttribute("risk", risk);
		model.addAttribute("update", true);
		model.addAttribute("show", false);
		model.addAttribute("controls", controlsAux);
		
		return "risk";
		
	}
	
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=assign")
	public String attachControls(@ModelAttribute("risk") Risk risk, Model model, @RequestParam(value="cguid") String[] guids) {
		
		Arrays.stream(guids)
			.forEach(guid -> risk.getControls().add(
				new Control(guid)
			));
		
		loadControls(risk);
		
		if(riskService.existsByGuid(risk.getGuid()))
			model.addAttribute("update", true);

		if(!riskService.existsByGuid(risk.getGuid()))
			model.addAttribute("update", false);
		
		
		return "risk";
	}

	private void loadControls(Risk risk) {
		IntStream.range(0, risk.getControls().size())
			.forEach(idx -> risk.getControls().set(idx, 
					                               controlService.findByGuid(risk.getControls().get(idx).getGuid()))
					);
	}
	
	private String getGuid() {
		return UUID.randomUUID().toString();
	}
	
	
}
