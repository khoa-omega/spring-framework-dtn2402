package com.vti.blogapp.repository;

import com.vti.blogapp.entity.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostCommentRepository
        extends JpaRepository<PostComment, Long> {
}
