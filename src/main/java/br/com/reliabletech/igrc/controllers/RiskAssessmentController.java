package br.com.reliabletech.igrc.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.com.reliabletech.igrc.components.FileSaver;
import br.com.reliabletech.igrc.models.File;
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
	
	@Autowired
	private FileSaver fileSaver;
	
	@RequestMapping(value="/assess", method=RequestMethod.GET)
	public String riskassessmentForm(@ModelAttribute("riskassessment") RiskAssessment riskassessment, Model model){

		List<Parameter> qldamages = parameterService.findByParatype("qldamage");
		model.addAttribute("qldamages", qldamages);

		List<Parameter> trendopts = parameterService.findByParatype("trendopt");
		model.addAttribute("trendopts", trendopts);

		List<Parameter> probabs = parameterService.findByParatype("probab");
		model.addAttribute("probabs", probabs);
		
		model.addAttribute("update", false);
		model.addAttribute("show", false);
		
		return "riskassessment";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String showRiskAssessment(@RequestParam("guid") String guid, Model model) {
		
		RiskAssessment riskassessment = riskassessmentService.findByGuid(guid);
		model.addAttribute("riskassessment", riskassessment);
		model.addAttribute("update", false);
		model.addAttribute("show", true);
		
		return "riskassessment";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=assess")
	public String createRiskAssessment(@RequestParam MultipartFile file[], @ModelAttribute("riskassessment") RiskAssessment riskassessment, Model model){
		
		List<File> fileList = new ArrayList<>(); 		
		Map<String, String> filesMap = fileSaver.write("ra-documents", file);
		
		filesMap.entrySet()
			.stream()
			.forEach(entry -> fileList.add(new File(entry.getKey(), entry.getValue())));
		riskassessment.setFiles(fileList);
		
		riskassessmentService.save(riskassessment);
		model.addAttribute("successMessage", "Risk Assessment executed sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=update")
	public String updateRiskAssessment(RiskAssessment riskassessment, Model model){
		
		riskassessmentService.save(riskassessment);
		model.addAttribute("successMessage", "Risk Assessment updated sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String riskassessmentList(Model model){
		
		List<RiskAssessment> riskassessments = riskassessmentService.findAll();
		model.addAttribute("riskassessments", riskassessments);
		
		return "riskassessmentview";
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteRiskAssessment(@RequestParam("guid") String guid, Model model){
		
		RiskAssessment riskassessment = riskassessmentService.findByGuid(guid);
		riskassessmentService.delete(riskassessment);
		List<RiskAssessment> riskassessments = riskassessmentService.findAll();
		model.addAttribute("riskassessments", riskassessments);
		
		return "riskassessmentlist";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateRiskAssessment(@RequestParam("guid") String guid, Model model){
		
		List<Parameter> qldamages = parameterService.findByParatype("qldamage");
		model.addAttribute("qldamages", qldamages);

		List<Parameter> trendopts = parameterService.findByParatype("trendopt");
		model.addAttribute("trendopts", trendopts);

		List<Parameter> probabs = parameterService.findByParatype("probab");
		model.addAttribute("probabs", probabs);
		
		RiskAssessment riskassessment = riskassessmentService.findByGuid(guid);
		model.addAttribute("riskassessment", riskassessment);
		model.addAttribute("update", true);
		
		return "riskassessment";
		
	}
	
	
	
	
}
