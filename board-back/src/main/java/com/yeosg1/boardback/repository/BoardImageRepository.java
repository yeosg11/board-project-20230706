package com.yeosg1.boardback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yeosg1.boardback.entity.BoardImageEntity;

@Repository
public interface BoardImageRepository extends JpaRepository<BoardImageEntity, Integer> {
    
    List<BoardImageEntity> findByBoardNumber(Integer boardNumber);

}