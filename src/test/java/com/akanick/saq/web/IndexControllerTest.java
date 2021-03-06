package com.akanick.saq.web;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IndexControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    @DisplayName("메인페이지로딩")
    void 메인페이지_로딩() {
        // given
        // when
        String body = this.restTemplate.getForObject("/", String.class);

        // then
        Assertions.assertThat(body).contains("스프링 부트로 시작하는 웹 서비스");
    }
}