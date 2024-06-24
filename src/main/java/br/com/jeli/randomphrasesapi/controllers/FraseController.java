package br.com.jeli.randomphrasesapi.controllers;

import br.com.jeli.randomphrasesapi.dtos.FraseDTO;
import br.com.jeli.randomphrasesapi.services.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("series/frases")
public class FraseController {

    @Autowired
    private FraseService service;

    @GetMapping
    public FraseDTO gerarFraseAleatoria() {
        return this.service.pegarFrasesAleatorias();
    }
}
