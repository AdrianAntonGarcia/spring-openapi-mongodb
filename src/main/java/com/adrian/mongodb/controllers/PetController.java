package com.adrian.mongodb.controllers;

import com.adrian.openapi.api.PetApi;
import com.adrian.openapi.model.PetDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class PetController implements PetApi {

    @Override
    @GetMapping("pet/findByStatus")
    public ResponseEntity<List<PetDto>> _findPetsByStatus(List<String> status) {

        final List<PetDto> perros= Arrays.asList(new PetDto().id(123213L).status(PetDto.StatusEnum.AVAILABLE));
        return new ResponseEntity<List<PetDto>>(perros,HttpStatus.OK);
    }
}
