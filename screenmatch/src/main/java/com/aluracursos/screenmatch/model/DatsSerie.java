package com.aluracursos.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatsSerie(
        @JsonAlias("Title") String titulo,

        @JsonAlias("totalSeasons") Integer totalDeTemporadas,

        @JsonAlias("imdbRating") String evaluacion) {
}
