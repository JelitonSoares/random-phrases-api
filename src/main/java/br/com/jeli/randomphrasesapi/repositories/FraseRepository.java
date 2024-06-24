package br.com.jeli.randomphrasesapi.repositories;

import br.com.jeli.randomphrasesapi.models.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT f FROM Frase f ORDER BY FUNCTION('RANDOM') LIMIT 1")
    Frase pegarFrasesAleatorias();
}
