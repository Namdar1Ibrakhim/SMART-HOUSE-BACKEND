package com.example.smarthousebackend.security.token;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TokenService {

    private final TokenRepository tokenRepository;

    @Scheduled(fixedRate = 10000)
    public void revokeExpiredTokens(){
        List<Token> list = tokenRepository.findAll();
        for (Token token: list){
            if(token.getCreatedAt().after(new Date())) {
                token.setExpired(true);
                token.setRevoked(true);
                tokenRepository.save(token);
            }
        }

    }
}
