package com.yeosg1.boardback.entity.primaryKey;

import java.io.Serializable;

import javax.persistence.Column;

public class FavoritePk implements Serializable {
    @Column(name = "user_email")
    private String userEmail;
    @Column(name="board_number")
    private int boardNumber;
}
