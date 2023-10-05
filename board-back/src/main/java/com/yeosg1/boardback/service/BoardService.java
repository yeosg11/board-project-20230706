package com.yeosg1.boardback.service;

import org.springframework.http.ResponseEntity;

import com.yeosg1.boardback.dto.request.board.PostBoardRequestDto;
import com.yeosg1.boardback.dto.response.board.GetBoardResponseDto;
import com.yeosg1.boardback.dto.response.board.GetFavoriteListResponseDto;
import com.yeosg1.boardback.dto.response.board.GetLatestBoardListResponseDto;
import com.yeosg1.boardback.dto.response.board.PostBoardResponseDto;
import com.yeosg1.boardback.dto.response.board.PutFavoriteResponseDto;

public interface BoardService {
    
    ResponseEntity<? super PostBoardResponseDto> postBoard(PostBoardRequestDto dto, String email);

    ResponseEntity<? super GetBoardResponseDto> getBoard(Integer boardNumber);
    ResponseEntity<? super GetFavoriteListResponseDto> getFavorietList(Integer boardNumber);
    ResponseEntity<? super GetLatestBoardListResponseDto> getLatestBoardList();

    ResponseEntity<? super PutFavoriteResponseDto> putFavorite (Integer boardNumber, String email);
    
}

