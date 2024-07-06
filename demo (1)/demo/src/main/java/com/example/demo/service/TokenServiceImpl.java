package com.example.demo.service;

import com.example.demo.entity.Token;
import com.example.demo.repo.TokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.UUID;

@Service
@Transactional
public class TokenServiceImpl implements TokenService{

    @Autowired
    private final TokenRepo tokenRepository;

    public TokenServiceImpl(TokenRepo tokenRepository) {
        this.tokenRepository = tokenRepository;
    }

    @Override
    public String createToken() {
        Token token=new Token();
        String tokenString=UUID.randomUUID().toString();
        token.setToken(tokenString);
        token.setTimestamp(new Timestamp(System.currentTimeMillis()));
        tokenRepository.save(token);
        return tokenString;
    }


//    public String createToken() {
//        Token newToken = new Token();
//        String tokenString = UUID.randomUUID().toString();
//        newToken.setToken(tokenString);
//        newToken.setTimestamp(new Timestamp(System.currentTimeMillis()));
//        tokenRepository.save(newToken);
//        return tokenString;
//    }
}