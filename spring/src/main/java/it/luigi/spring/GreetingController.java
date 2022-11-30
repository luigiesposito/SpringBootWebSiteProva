package it.luigi.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="a tutti") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	@GetMapping("/chi-sono")
	public String chisono() {
		return "chisono";
	}
	
	@GetMapping("/contenuti")
	public String contenuti() {
		return "contenuti";
	}
	
	@GetMapping("/contattami")
	public String contattami() {
		return "contattami";
	}
	
}