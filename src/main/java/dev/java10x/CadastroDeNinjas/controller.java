package dev.java10x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class controller {

    @GetMapping ("/boasvindas")
    public String boasVindaso(){
        return "Essa é minha primeira mensagem nessa rota ";
    }


}
