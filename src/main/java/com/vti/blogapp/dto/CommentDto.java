package com.vti.blogapp.dto;

import com.vti.blogapp.entity.Comment;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CommentDto {
    private Comment.PrimaryKey pk;
    private String body;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
