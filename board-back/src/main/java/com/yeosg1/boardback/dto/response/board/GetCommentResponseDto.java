package com.yeosg1.boardback.dto.response.board;

import java.util.List;

import com.yeosg1.boardback.common.object.CommentListItem;
import com.yeosg1.boardback.dto.response.ResponseDto;

import lombok.Getter;

@Getter

public class GetCommentResponseDto extends ResponseDto {
    List<CommentListItem> commentList;

    private GetCommentResponseDto (String code, String message, List<CommentListResultSet> resultSets) {

        super(code, message);
        this.commentList = CommentListItem.getList(resultSets);
  }

    public static ResponseEntity<GetCommentResponseDto> success(List)  

    
  
        
    
}
