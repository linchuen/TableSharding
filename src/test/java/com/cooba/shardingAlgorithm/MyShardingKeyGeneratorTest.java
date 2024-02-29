package com.cooba.shardingAlgorithm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyShardingKeyGeneratorTest {
    @Autowired
    MyShardingKeyGenerator myShardingKeyGenerator;

    @Test
    void generateKey() {
        Long generateKey = (Long) myShardingKeyGenerator.generateKey();
        System.out.println(generateKey);
    }
}