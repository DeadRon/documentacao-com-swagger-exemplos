package com.br.documentacaocomswagger.config.openapi.model;

public record Tutorial(
        String id,
        String title,
        String description,
        boolean published
) { }
