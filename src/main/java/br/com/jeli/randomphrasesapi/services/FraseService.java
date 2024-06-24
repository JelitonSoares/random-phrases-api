package br.com.jeli.randomphrasesapi.services;

import br.com.jeli.randomphrasesapi.dtos.FraseDTO;
import br.com.jeli.randomphrasesapi.models.Frase;
import br.com.jeli.randomphrasesapi.repositories.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;


    public FraseDTO pegarFrasesAleatorias() {
        Frase frase = this.repository.pegarFrasesAleatorias();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }

}
