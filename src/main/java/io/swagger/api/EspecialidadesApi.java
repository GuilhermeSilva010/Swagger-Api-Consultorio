/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.26).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Especialidade;
import io.swagger.model.EspecialidadesBody;
import io.swagger.model.EspecialidadesIdBody;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-06-16T19:50:12.757Z[GMT]")
@Validated
public interface EspecialidadesApi {

    @Operation(summary = "Recupera todas as especialidades", description = "", security = {
        @SecurityRequirement(name = "auth")    }, tags={ "Especialidades" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Sucesso", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Especialidade.class))) })
    @RequestMapping(value = "/especialidades",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Especialidade> especialidadesGet();


    @Operation(summary = "Alterar descrição da especialidade", description = "", security = {
        @SecurityRequirement(name = "auth")    }, tags={ "Especialidade por indentificador" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Sucesso", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Especialidade.class))),
        
        @ApiResponse(responseCode = "404", description = "ID ou Especialidade não encontrada") })
    @RequestMapping(value = "/especialidades/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Especialidade> especialidadesIdDelete(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "Recuperando uma entidade pelo ID", description = "", security = {
        @SecurityRequirement(name = "auth")    }, tags={ "Especialidade por indentificador" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Sucesso", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Especialidade.class))),
        
        @ApiResponse(responseCode = "404", description = "ID ou Especialidade não encontrada") })
    @RequestMapping(value = "/especialidades/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Especialidade> especialidadesIdGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id);


    @Operation(summary = "Alterar descrição da especialidade", description = "", security = {
        @SecurityRequirement(name = "auth")    }, tags={ "Especialidade por indentificador" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Sucesso", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Especialidade.class))),
        
        @ApiResponse(responseCode = "404", description = "ID ou Especialidade não encontrada") })
    @RequestMapping(value = "/especialidades/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Especialidade> especialidadesIdPut(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Integer id, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody EspecialidadesIdBody body);


    @Operation(summary = "Cria nova especialidade", description = "", security = {
        @SecurityRequirement(name = "auth")    }, tags={ "Especialidades" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Especialidade.class))) })
    @RequestMapping(value = "/especialidades",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Especialidade> especialidadesPost(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody EspecialidadesBody body);

}

