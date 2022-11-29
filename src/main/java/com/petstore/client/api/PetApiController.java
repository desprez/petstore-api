package com.petstore.client.api;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.petstore.client.model.ModelApiResponse;
import com.petstore.client.model.Pet;

import io.swagger.annotations.ApiParam;

@Controller
public class PetApiController implements PetApi {

    @Override
    public ResponseEntity<Void> addPet(
            @ApiParam(value = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody final Pet body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deletePet(@ApiParam(value = "Pet id to delete", required = true) @PathVariable("petId") final Long petId,
            @ApiParam(value = "") @RequestHeader(value = "api_key", required = false) final String apiKey) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByStatus(
            @NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true, allowableValues = "available, pending, sold") @RequestParam(value = "status", required = true) final List<String> status) {
        // do some magic!
        return new ResponseEntity<List<Pet>>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByTags(
            @NotNull @ApiParam(value = "Tags to filter by", required = true) @RequestParam(value = "tags", required = true) final List<String> tags) {
        // do some magic!
        return new ResponseEntity<List<Pet>>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Pet> getPetById(@ApiParam(value = "ID of pet to return", required = true) @PathVariable("petId") final Long petId) {
        // do some magic!
        return new ResponseEntity<Pet>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> updatePet(
            @ApiParam(value = "Pet object that needs to be added to the store", required = true) @Valid @RequestBody final Pet body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> updatePetWithForm(
            @ApiParam(value = "ID of pet that needs to be updated", required = true) @PathVariable("petId") final Long petId,
            @ApiParam(value = "Updated name of the pet") @RequestPart(value = "name", required = false) final String name,
            @ApiParam(value = "Updated status of the pet") @RequestPart(value = "status", required = false) final String status) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ModelApiResponse> uploadFile(@ApiParam(value = "ID of pet to update", required = true) @PathVariable("petId") final Long petId,
            @ApiParam(value = "Additional data to pass to server") @RequestPart(value = "additionalMetadata", required = false) final String additionalMetadata,
            @ApiParam(value = "file detail") @RequestPart("file") final MultipartFile file) {
        // do some magic!
        return new ResponseEntity<ModelApiResponse>(HttpStatus.OK);
    }

}
