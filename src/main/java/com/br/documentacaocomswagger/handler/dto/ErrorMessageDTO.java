package com.br.documentacaocomswagger.handler.dto;


public record ErrorMessageDTO (
        String mensagemErro,
        String campo
){ }