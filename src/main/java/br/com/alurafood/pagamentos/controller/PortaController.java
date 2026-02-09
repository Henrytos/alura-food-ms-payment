package br.com.alurafood.pagamentos.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/porta")
public class PortaController {

    @GetMapping
    public String obterPorta(
            @Value("${local.server.port}") String porta
    ) {
        return "Rodando aplicacao na porta: " + porta;
    }

}
