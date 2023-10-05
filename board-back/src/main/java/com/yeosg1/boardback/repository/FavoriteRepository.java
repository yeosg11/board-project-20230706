package com.yeosg1.boardback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yeosg1.boardback.entity.FavoriteEntity;
import com.yeosg1.boardback.entity.primaryKey.FavoritePk;

@Repository
public interface FavoriteRepository extends JpaRepository<FavoriteEntity, FavoritePk> {
    
    boolean existsByUserEmailAndBoardNumber(String email, Integer boardNumber);

}
