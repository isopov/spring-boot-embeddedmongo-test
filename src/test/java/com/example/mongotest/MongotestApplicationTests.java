package com.example.mongotest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MongotestApplicationTests {

    @Autowired
    private PlayerRepository repo;

    @Test
    void test() {
        assertEquals(0, repo.count());
    }

}
