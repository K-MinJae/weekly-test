package com.example.springtest.domain;

import com.example.springtest.dto.ArticleCommentRequestDto;
import com.example.springtest.dto.ArticleRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor // 기본생성자를 만듭니다.
@Setter
@Getter
@Entity // 테이블과 연계됨을 스프링에게 알려줍니다.
public class Article extends Timestamped{ // 생성,수정 시간을 자동으로 만들어줍니다.
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long idx;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String title;

    @OneToMany(mappedBy="article")
    private List<Comment> comments;

    public Article(ArticleRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
    }

}

