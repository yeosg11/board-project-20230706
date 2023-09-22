package com.yeosg1.boardback.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yeosg1.boardback.dto.request.auth.SignUpRequestDto;
import com.yeosg1.boardback.dto.response.auth.SignUpResponseDto;
import com.yeosg1.boardback.service.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    
    private final AuthService authService;
    @PostMapping("/sign-up")
    public ResponseEntity<? super SignUpResponseDto> signUp(
        @RequestBody @Valid SignUpRequestDto requestBody 
    ) {
        ResponseEntity<? super SignUpResponseDto> reponse = authService.signUp(requestBody);
        return reponse;
    }
}
