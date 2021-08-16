/**
 * 
 */
package com.example.demoMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 *
 */
@Controller
public class IndexController {
	
	@GetMapping("/demo")
	public Object index(@RequestParam(name="name", required =  false, 
	defaultValue = "peter") String name, Model model ) { 
		
		model.addAttribute("name", name);
		
		return "demo";
	}

}
