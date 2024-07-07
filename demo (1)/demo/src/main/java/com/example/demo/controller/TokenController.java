package com.example.demo.controller;

import com.example.demo.service.TokenService;
import com.example.demo.service.TokenServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping
public class TokenController {

    @Autowired
    private TokenService tokenService;


    @PostMapping("/tokens")
    public String createToken(@RequestParam("client_id") int clntId, @RequestParam("member_id") int mbrId, HttpServletRequest request) {

        String token = tokenService.createToken(clntId, mbrId);

        // Get the current URL and append the token as a query parameter
        String currentUrl = request.getRequestURL().toString();
        String queryString = request.getQueryString();
        String urlWithToken;

        if (queryString == null) {
            urlWithToken = currentUrl + "?token=" + token;
        } else {
            urlWithToken = currentUrl + "&token=" + token;
        }

        return urlWithToken;
    }
}