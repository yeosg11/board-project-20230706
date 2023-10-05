package com.yeosg1.boardback.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yeosg1.boardback.entity.BoardViewEntity;

@Repository
public interface BoardViewRepository extends JpaRepository<BoardViewEntity, Integer> {

    BoardViewEntity findByBoardNumber(Integer boardNumber);

    List<BoardViewEntity> findByOrderByWriteDatetimeDesc();

}