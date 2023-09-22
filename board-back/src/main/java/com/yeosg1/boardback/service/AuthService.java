package com.yeosg1.boardback.service;

import org.springframework.http.ResponseEntity;

import com.yeosg1.boardback.dto.request.auth.SignUpRequestDto;
import com.yeosg1.boardback.dto.response.auth.SignUpResponseDto;

public interface AuthService {
    ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto);
    
}
