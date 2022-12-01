package it.luigi.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String form(Model model)
    {
        DatiMessaggio dati = new DatiMessaggio();
        model.addAttribute("dati",dati);

        return "contattami";
    }

    @PostMapping("/send")
    public String submitForm(@ModelAttribute("dati") DatiMessaggio dati)
    {
        System.out.println(dati);
        return "conferma_messaggio";

    }
}