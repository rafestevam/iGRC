package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String riskcategoryForm(@ModelAttribute("riskcategory") RiskCategory riskcategory, Model model){

		List<Parameter> qldamages = parameterService.findByParatype("qldamage");
		model.addAttribute("qldamages", qldamages);

		List<Parameter> trendopts = parameterService.findByParatype("trendopt");
		model.addAttribute("trendopts", trendopts);

		List<Parameter> probabs = parameterService.findByParatype("probab");
		model.addAttribute("probabs", probabs);
		
		model.addAttribute("update", false);
		model.addAttribute("show", false);
		
		return "riskcategory";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String showRiskCategory(@RequestParam("guid") String guid, Model model) {
		
		RiskCategory riskcategory = riskcategoryService.findByGuid(guid);
		model.addAttribute("riskcategory", riskcategory);
		model.addAttribute("update", false);
		model.addAttribute("show", true);
		
		return "riskcategory";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=create")
	public String createRiskCategory(RiskCategory riskcategory, Model model){
		
		riskcategoryService.save(riskcategory);
		model.addAttribute("successMessage", "Risk Category created sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=update")
	public String updateRiskCategory(RiskCategory riskcategory, Model model){
		
		riskcategoryService.save(riskcategory);
		model.addAttribute("successMessage", "Risk Category updated sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String riskcategoryList(Model model){
		
		List<RiskCategory> riskcategories = riskcategoryService.findAll();
		model.addAttribute("riskcategories", riskcategories);
		
		return "riskcategoryview";
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteRiskCategory(@RequestParam("guid") String guid, Model model){
		
		RiskCategory riskcategory = riskcategoryService.findByGuid(guid);
		riskcategoryService.delete(riskcategory);
		List<RiskCategory> riskcategories = riskcategoryService.findAll();
		model.addAttribute("riskcategories", riskcategories);
		
		return "riskcategorylist";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateRiskCategory(@RequestParam("guid") String guid, Model model){
		
		RiskCategory riskcategory = riskcategoryService.findByGuid(guid);
		
		List<Parameter> qldamages = parameterService.findByParatype("qldamage");
		model.addAttribute("qldamages", qldamages);

		List<Parameter> trendopts = parameterService.findByParatype("trendopt");
		model.addAttribute("trendopts", trendopts);

		List<Parameter> probabs = parameterService.findByParatype("probab");
		model.addAttribute("probabs", probabs);
		
		model.addAttribute("riskcategory", riskcategory);
		model.addAttribute("update", true);
		
		return "riskcategory";
		
	}
	
}
