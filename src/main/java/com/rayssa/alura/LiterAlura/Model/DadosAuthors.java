package com.rayssa.alura.LiterAlura.Model;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosAuthors(
        @JsonAlias("name") String nome,
        @JsonAlias("birth_year") Integer anoNacismento,
        @JsonAlias("death_year") Integer anoMorte) {
}