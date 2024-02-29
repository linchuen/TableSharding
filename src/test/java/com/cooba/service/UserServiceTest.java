package com.cooba.service;

import com.cooba.entity.UserEntity;
import com.cooba.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    void insert() {
        UserEntity userEntity = new UserEntity();
        userEntity.setAssetId(1);
        userEntity.setAmount(BigDecimal.valueOf(100));
        userService.insert(userEntity);

        System.out.println(userEntity.getId());
        Assertions.assertNotNull(userEntity.getId());
    }

    @Test
    void updateAmount() {
    }

    @Test
    void selectByAssetId() {
    }

    @Test
    void select() {
    }
}