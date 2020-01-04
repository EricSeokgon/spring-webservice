package com.hadeslee.webservice.web;

import com.hadeslee.webservice.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    public Posts toEntiry() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
