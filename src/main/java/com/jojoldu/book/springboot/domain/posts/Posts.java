package com.jojoldu.book.springboot.domain.posts;


import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // 클래스 내의 모든 필드의 getter 메소를 자동생성
@NoArgsConstructor //기본 생성자 자동추가
@Entity //테이블과 링크될 클래스임을 명시
public class Posts extends BaseTimeEntity {

    @Id //해당 테이블의 PK필드를 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK 생성규칙
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 해당 클래스의 빌더 패턴 클래스를 생성 , 생성자 상단에 선언 시 생성장에 포함된 필드만 빌더에 포함함
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
