package com.hadeslee.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsReposritory extends JpaRepository<Posts, Long> {
    
}
