package com.example.exercise1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.TestPropertySources;

@SpringBootTest
@TestPropertySource("classpath:application-test.properties")
class Exercise1ApplicationTests {

    @Test
    void contextLoads() {
    }

}
