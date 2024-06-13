package com.shazzar.erms.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("v1/auth")
public class Auth {

    public ResponseEntity<String> register(@RequestBody String data) {
        return new ResponseEntity<>("Hello Java Dev", HttpStatus.ACCEPTED);
    }

}
