package com.yeosg1.boardback.service.implement;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.yeosg1.boardback.dto.request.auth.SignUpRequestDto;
import com.yeosg1.boardback.dto.response.ResponseDto;
import com.yeosg1.boardback.dto.response.auth.SignUpResponseDto;
import com.yeosg1.boardback.entity.UserEntity;
import com.yeosg1.boardback.repository.UserRepository;
import com.yeosg1.boardback.service.AuthService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImplement implements AuthService {

    private final UserRepository userRepository;

    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto) {

        try {

            String email = dto.getEmail();
            String nickname = dto.getNickname();
            String telNumber = dto.getTelNumber();

            boolean hasEmail = userRepository.existsByEmail(email);
            if (hasEmail) return SignUpResponseDto.duplicateEmail();

            boolean hasNickname = userRepository.existsByNickname(nickname);
            if (hasNickname) return SignUpResponseDto.duplicateNickname();

            boolean hasTelNumber = userRepository.existsByTelNumber(telNumber);
            if (hasTelNumber) return SignUpResponseDto.duplicateTelNumber();

            String password = dto.getPassword();
            String encodedPassword = passwordEncoder.encode(password);

            dto.setPassword(encodedPassword);

            UserEntity userEntity = new UserEntity(dto);
            userRepository.save(userEntity);

        } catch(Exception exception) {
            exception.printStackTrace();
            return ResponseDto.databaseError();
        }

        return SignUpResponseDto.success();

    }
    
}