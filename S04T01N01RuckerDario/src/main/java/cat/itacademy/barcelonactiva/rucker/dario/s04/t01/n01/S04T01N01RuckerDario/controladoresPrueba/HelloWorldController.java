package cat.itacademy.barcelonactiva.rucker.dario.s04.t01.n01.S04T01N01RuckerDario.controladoresPrueba;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;


/*
Importarlo en Eclipse con la opción File > Import > Existing Maven Project.

En el archivo application.properties, configura la variable server.port con el valor 9000.

Convertiremos esta aplicación en una API REST:
Dependiendo del package principal, crea otro subpackage llamado Controllers, y en su
interior, añade la clase HelloWorldController.


Tendrá que tener dos métodos:
String saluda
String saluda2

Estos dos métodos recibirán un parámetro String llamado nombre, y devolverán la frase:

"Hola, " + nombre + ". Estás ejecutando un proyecto Maven”.

El primer método responderá a una petición GET y deberá ser configurado para recibir
el parámetro como un RequestParam. El parámetro "nombre" tendrá el valor predeterminado “UNKNOWN”.

Deberá responder a:

http://localhost:9000/HelloWorld
http://localhost:9000/HelloWorld?nombre=Mi nombre



El segundo método responderá a una petición GET, y deberá ser configurado para recibir el
parámetro como PathVariable. El parámetro "nombre" será opcional.

Deberá responder a:

http://localhost:9000/HelloWorld2
http://localhost:9000/HelloWorld2/mi nombre


 */
@Controller
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(name="name", required = false, defaultValue = "unknown") String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }


    //@GetMapping(value = { "/api/employeeswithrequiredfalse", "/api/employeeswithrequiredfalse/{id}" })
    @GetMapping(value =  {"/HelloWorld2", "/HelloWorld2/{name}"})
    public String greeting2(@PathVariable Optional<String> name, Model model) {
        String name2;

        if(!name.isPresent()){
            return "greetingNoName";
        }else {
            name2 = name.get();
        }

        model.addAttribute("name", name2);
        return "greeting";
    }
}
