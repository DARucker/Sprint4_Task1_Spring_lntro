package cat.itacademy.barcelonactiva.rucker.dario.s04.t01.n01.S04T01N01RuckerDario.controladoresPrueba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(name="name", required = false, defaultValue = "unknown") String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }
    @GetMapping(value = "/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
