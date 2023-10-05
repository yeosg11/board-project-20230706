package com.yeosg1.boardback.common.object;

import java.util.ArrayList;
import java.util.List;

import com.yeosg1.boardback.repository.resultSet.CommentListResultSet;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentListItem {
    private String nickname;
    private String  content;
    private String writeDatetime;
    private String profileImage;

    public CommentListItem(CommentListResultSet resultSet) {
        this.nickname = resultSet.getNickname();
        this.content = resultSet.getContent();
        this.writeDatetime = resultSet.getWriteDatetime();
        this.profileImage = resultSet.getProfileImage();



    }
public static List<CommentListItem> getList(List<CommentListResultSet> resultSets) {
    List<CommentListItem> list =  new ArrayList<>();
    for (CommentListResultSet resultSet: resultSet) {
        CommentListItem
    }
    
}
    
}
