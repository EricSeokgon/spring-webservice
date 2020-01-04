package com.hadeslee.webservice.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsReposritoryTest {
    @Autowired
    PostsReposritory postsReposritory;

    @After
    public void cleanup() {
        /**
         * 이후 테스트 코드에 영향을 끼치지 않기 위해
         * 테스트 메소드가 끝날때 마다 repository 전체 비우는 코드
         */
        postsReposritory.deleteAll();
    }

    @Test
    public void test() {
        //given
        postsReposritory.save(Posts.builder()
                .title("테스트 title")
                .content("테스트 content")
                .author("leesk55@gmail.com")
                .build());

        //when
        List<Posts> postsList = postsReposritory.findAll();

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle(), is("테스트 title"));
        assertThat(posts.getContent(), is("테스트 content"));
    }

}