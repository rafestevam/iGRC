package br.com.reliabletech.igrc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.reliabletech.igrc.models.Product;
import br.com.reliabletech.igrc.models.Parameter;
import br.com.reliabletech.igrc.services.ProductService;
import br.com.reliabletech.igrc.services.ParameterService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private ParameterService parameterService;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String productForm(Product product, Model model){

		List<Parameter> defenseLines = parameterService.findByParatype("defenseline");
		model.addAttribute("defenseLines", defenseLines);
		model.addAttribute("update", false);
		model.addAttribute("show", false);
		
		return "product";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public String showProduct(@RequestParam("guid") String guid, Model model) {
		
		Product product = productService.findByGuid(guid);
		model.addAttribute("product", product);
		model.addAttribute("update", false);
		model.addAttribute("show", true);
		
		return "product";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=create")
	public String createProduct(Product product, Model model){
		
		productService.save(product);
		model.addAttribute("successMessage", "Product created sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST, params="action=update")
	public String updateProduct(Product product, Model model){
		
		productService.save(product);
		model.addAttribute("successMessage", "Product updated sucessfully!");
		
		return "redirect:view";
		
	}
	
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public String productList(Model model){
		
		List<Product> products = productService.findAll();
		model.addAttribute("products", products);
		
		return "productview";
		
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String deleteProduct(@RequestParam("guid") String guid, Model model){
		
		Product product = productService.findByGuid(guid);
		productService.delete(product);
		List<Product> products = productService.findAll();
		model.addAttribute("products", products);
		
		return "productlist";
		
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public String updateProduct(@RequestParam("guid") String guid, Model model){
		
		Product product = productService.findByGuid(guid);
		model.addAttribute("product", product);
		model.addAttribute("update", true);
		
		return "product";
		
	}
	
}
