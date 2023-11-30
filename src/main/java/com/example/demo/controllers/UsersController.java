package com.example.demo.controllers;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.ContactService;

@RestController
@RequestMapping("/api")
public class UsersController {

    @Autowired
    private ContactService contactService;

    @RequestMapping(method = RequestMethod.GET, value = "/contacts")
    public ResponseEntity<?> displayContacts() {

        try {

            LinkedHashMap<String, Object> status = new LinkedHashMap<>();
            status.put("code", "200");
            status.put("message", "Successful retrieval for contacts");

            LinkedHashMap<String, Object> response = new LinkedHashMap<>();
            response.put("success", true);
            response.put("status", status);
            response.put("data", contactService.getAllContacts());

            return new ResponseEntity<>(response, HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        
    }
    
}
