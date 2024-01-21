package com.br.documentacaocomswagger.controller;

import com.br.documentacaocomswagger.handler.dto.ErrorMessageDTO;
import com.br.documentacaocomswagger.model.Tutorial;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Tutorial - Controller", description = "Tutorial management APIs")
@RestController
public class TutorialController {
    @Operation(
            summary = "Retrieve a Tutorial by Id",
            description = "Get a Tutorial object by specifying its id. The response is Tutorial object with id, title, description and published status."
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = { @Content(schema = @Schema(implementation = Tutorial.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema(implementation = ErrorMessageDTO.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "401", content = { @Content(schema = @Schema(implementation = ErrorMessageDTO.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema(implementation = ErrorMessageDTO.class), mediaType = "application/json")}) })
    @GetMapping("/tutorials/{id}")
    public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") long id) {
        return null;
    }

    @Operation(
            summary = "Salva dados de um tutorial",
            description = "End point responsável por salvar dados de um tutorial"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "201", content = {@Content(schema = @Schema(implementation = Tutorial.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = ErrorMessageDTO.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "401", content = {@Content(schema = @Schema(implementation = ErrorMessageDTO.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema(implementation = ErrorMessageDTO.class), mediaType = "application/json")})
    })
    @PostMapping("/tutorials")
    public ResponseEntity<Tutorial> createTutorialById(@RequestBody Tutorial tutorial) {
        return null;
    }

    @Operation(
            summary = "Deleta dados de um tutorial através do id",
            description = "End point responsável por deletar dados de um tutorial"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "204"),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema(implementation = ErrorMessageDTO.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "401", content = {@Content(schema = @Schema(implementation = ErrorMessageDTO.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema(implementation = ErrorMessageDTO.class), mediaType = "application/json")})
    })
    @DeleteMapping("/tutorials/{id}")
    public ResponseEntity<Tutorial> deleteTutorialById(@PathVariable("id") long id) {
        return null;
    }

    @Operation(
            summary = "Atualiza dados de um tutorial através do id",
            description = "End point responsável por atualizar dados de um tutorial"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "204", content = {@Content(schema = @Schema(implementation = Tutorial.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "404", content = { @Content(schema = @Schema(implementation = ErrorMessageDTO.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "401", content = {@Content(schema = @Schema(implementation = ErrorMessageDTO.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema(implementation = ErrorMessageDTO.class), mediaType = "application/json")})
    })
    @PutMapping("/tutorials/{id}")
    public ResponseEntity<Tutorial> upodateTutorialById(@PathVariable("id") long id) {
        return null;
    }

}