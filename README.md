# 📘Random Phrases API✏️
Projeto desenvolvido como desafio do curso de SpringWeb da Alura, que consiste em criar uma API Rest que se conecta com um front-end, já disponibilizado, que devolve
frases famosas aleatóriamente quando o usuário clicar em "Ver outras frases...". O arquivo para recupearação do banco de dados se encontra junto com os demais.

# Screenshot📱:

![api_screeshot](https://github.com/JelitonSoares/random-phrases-api/assets/132035058/33354614-8665-4be0-a6f5-dd5345ee9fc3)
##### Isto é um exemplo de utilização da API com o Front-End que foi disponibilizado.

# 📚Tecnologias Utilizadas📚:

![](https://img.shields.io/badge/Java-FF0000?style=for-the-badge&logo=openjdk&logoColor=white)
![](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![](https://img.shields.io/badge/SpringDataJPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white)

## Documentação da API 🖥️:

#### Retorna uma frase aleatória

```
  GET /series/frases
```
ex:
```
{
    "titulo": "Vingadores Ultimato",
    "frase": "Nenhuma quantia de dinheiro jamais comprou um segundo de tempo!",
    "personagem": "Tony Stark",
    "poster": "https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_SX300.jpg"
}
```

# 🎓Aprendizados🎓:
Esse foi um desafio muito esperado por mim, sempre desenvolvi aplicações com interação via linha de comando, e essa é minha primeira API Rest desenvolvida
foi uma experiência muito bacana, reforcei o conhecimento adquirido ao longo de todo curso, desde o padrão MVC até as anotações do SpringWeb como: @RestController
@GetMapping, @RequestBody, @VariablePath e ter desenvolvido esta aplicação foi muito prazeroso e divertido, criar os endpoints e ver suas frases no front-end foi
muito gratificante, tive uma dificuldade que foi a consulta que deveria ser feita ao banco de dados para que ele devolvesse um registro aleatório, mas no fim tudo
ocorreu como esperado. No mais foi uma experiência gratificante!!

