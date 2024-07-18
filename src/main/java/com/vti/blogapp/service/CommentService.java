package com.vti.blogapp.service;

import com.vti.blogapp.dto.CommentDto;
import com.vti.blogapp.entity.Comment;
import com.vti.blogapp.form.CommentCreateForm;
import com.vti.blogapp.form.CommentUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CommentService {
    Page<CommentDto> findAll(Pageable pageable);

    Page<CommentDto> findByPostId(Long postId, Pageable pageable);

    CommentDto findById(Comment.PrimaryKey id);

    CommentDto create(Long postId, CommentCreateForm form);

    CommentDto update(Comment.PrimaryKey id, CommentUpdateForm form);

    void deleteById(Comment.PrimaryKey id);

    void deleteByEmail(String email);
}
