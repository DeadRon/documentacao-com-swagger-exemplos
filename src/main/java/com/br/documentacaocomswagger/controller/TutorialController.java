package com.br.documentacaocomswagger.controller;

import com.br.documentacaocomswagger.config.openapi.model.Tutorial;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Tutorial - Controller", description = "Tutorial management APIs")
@RestController
public class TutorialController {

    @GetMapping("/tutorials/{id}")
    public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") long id) {
        return null;
    }

}