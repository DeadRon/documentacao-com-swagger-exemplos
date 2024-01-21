package com.br.documentacaocomswagger.model;

public record Tutorial(
        String id,
        String title,
        String description,
        boolean published,
        Integer year,
        String gender,
        String bookNationality
) { }
