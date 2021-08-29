package com.jojoldu.book.springboot.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Getter
public class Posts {
    //DB의 테이블과 매칭될 클래스
    //Entity클래스에서는 Setter를 생성하지 않는다.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title , String content , String author){
        this.title=title;
        this.content=content;
        this.author=author;
    }

}
