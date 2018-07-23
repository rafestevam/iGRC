package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.models.RiskAssessment;
import br.com.reliabletech.igrc.services.ParameterService;
import br.com.reliabletech.igrc.services.RiskAssessmentService;

@Controller
@RequestMapping("/riskassessment")
public class RiskAssessmentController {

	@Autowired
	private RiskAssessmentService riskassessmentService;
	
	@Autowired
	private ParameterService parameterService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String riskassessmentForm(@ModelAttribute("riskassessment") RiskAssessment riskassessment, Model model){

		List<Parameter> qldamages = parameterService.findByParatype("qldamage");
		model.addAttribute("qldamages", qldamages);

		List<Parameter> trendopts = parameterService.findByParatype("trendopt");
		model.addAttribute("trendopts", trendopts);

		List<Parameter> probabs = parameterService.findByParatype("probab");
		model.addAttribute("probabs", probabs);
		
		
		return "riskassessment";
	}
	
	@RequestMapping(value="/assess", method=RequestMethod.POST)
	public String createRiskAssessment(@ModelAttribute("riskassessment") RiskAssessment riskassessment, Model model){
		
		riskassessmentService.save(riskassessment);
		model.addAttribute("successMessage", "Risk Assessment saved sucessfully!");
		
		return "riskassessment";
		
	}
	
}
