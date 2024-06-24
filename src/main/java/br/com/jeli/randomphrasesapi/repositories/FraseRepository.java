package br.com.jeli.randomphrasesapi.repositories;

import br.com.jeli.randomphrasesapi.models.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<Frase, Long> {
}
