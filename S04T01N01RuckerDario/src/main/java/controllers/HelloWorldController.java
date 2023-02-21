package controllers;

import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {

    /*
    Estos dos métodos recibirán un parámetro String llamado nombre, y devolverán la frase:
    "Hola, " + nombre + ". Estás ejecutando un proyecto Maven”.

    El primer método responderá a una petición GET y deberá ser configurado para recibir el
    parámetro como un RequestParam. El parámetro "nombre" tendrá el valor predeterminado “UNKNOWN”.

    Deberá responder a:

    http://localhost:9000/HelloWorld
    http://localhost:9000/HelloWorld?nombre=Mi nombre

    El segundo método responderá a una petición GET, y deberá ser configurado para recibir el parámetro
    como PathVariable. El parámetro "nombre" será opcional.

    Deberá responder a:

    http://localhost:9000/HelloWorld2
    http://localhost:9000/HelloWorld2/mi nombre
     */


    public String saluda(){

    }

    public String saluda2(){

    }

}
