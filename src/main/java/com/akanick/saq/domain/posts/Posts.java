package com.akanick.saq.domain.posts;

import com.akanick.saq.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity //JPA: 테이블과 링크되는 자원임을 표시. @Entity class는 절대로!!! 수정자가 존재해서는 안된다.
public class Posts extends BaseTimeEntity {

    @Id //JPA: PK필드(컬럼)임을 표시
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //JPA: 빌더패턴 클래스를 생성
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
