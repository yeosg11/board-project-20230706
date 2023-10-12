package com.yeosg1.boardback.service;

import org.springframework.http.ResponseEntity;

import com.yeosg1.boardback.dto.response.search.GetPopularListResponseDto;
import com.yeosg1.boardback.dto.response.search.GetRelationListResponseDto;

public interface SearchService {
    ResponseEntity<? super GetPopularListResponseDto> getPopularList();
    ResponseEntity<? super GetRelationListResponseDto> getRelationList(String searchWord);
}
