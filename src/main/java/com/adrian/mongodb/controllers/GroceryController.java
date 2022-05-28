package com.adrian.mongodb.controllers;

import com.adrian.mongodb.services.GroceryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GroceryController {

    @Autowired
    GroceryService groceryService;

    @GetMapping("/createGroceryData")
    public ResponseEntity<String> createGroceyData(){
//        this.groceryService.createGroceryItems();
        return ResponseEntity.ok("Prueba");
    }
}
