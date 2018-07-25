package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.models.RiskCategory;
import br.com.reliabletech.igrc.services.ParameterService;
import br.com.reliabletech.igrc.services.RiskCategoryService;


@Controller
@RequestMapping("/riskcategory")
public class RiskCategoryController {

	@Autowired
	private RiskCategoryService riskcategoryService;
	
	@Autowired
	private ParameterService parameterService;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String riskcategoryForm(@ModelAttribute("riskcategory") RiskCategory riskcategory, Model model){

		List<Parameter> qldamages = parameterService.findByParatype("qldamage");
		model.addAttribute("qldamages", qldamages);

		List<Parameter> trendopts = parameterService.findByParatype("trendopt");
		model.addAttribute("trendopts", trendopts);

		List<Parameter> probabs = parameterService.findByParatype("probab");
		model.addAttribute("probabs", probabs);
		
		return "riskcategory";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String createRiskCategory(RiskCategory riskcategory, Model model){
		
		riskcategoryService.save(riskcategory);
		model.addAttribute("successMessage", "Risk Category created sucessfully!");
		
		return "riskcategory";
		
	}
	
	
}
