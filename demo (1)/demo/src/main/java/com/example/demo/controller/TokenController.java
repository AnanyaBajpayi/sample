package com.example.demo.controller;

import com.example.demo.service.TokenService;
import com.example.demo.service.TokenServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TokenController {

    @Autowired
    private TokenService tokenService;

    @GetMapping
    public String getToken() {
        return "Token endpoint works!";
    }
    @PostMapping("/tokens")
    public ResponseEntity<String> createToken() {
        String token = tokenService.createToken();
        return ResponseEntity.ok().body(this.tokenService.createToken());
    }
}