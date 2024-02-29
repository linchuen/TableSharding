package com.cooba.service;

import com.cooba.entity.UserEntity;
import org.instancio.Instancio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

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
        UserEntity userEntity = Instancio.create(UserEntity.class);
        userService.insert(userEntity);

        userEntity.setAmount(BigDecimal.valueOf(5000));
        userService.updateAmount(userEntity);
    }

    @Test
    void selectByAssetId() {
        UserEntity userEntity = Instancio.create(UserEntity.class);
        userService.insert(userEntity);

        Integer assetId = userEntity.getAssetId();
        List<UserEntity> userEntityList = userService.selectByAssetId(assetId);
        userEntityList.forEach(System.out::println);
    }

    @Test
    void select() {
        UserEntity userEntity = Instancio.create(UserEntity.class);
        userService.insert(userEntity);

        Optional<UserEntity> optionalUser = userService.selectById(userEntity.getId());
        System.out.println(optionalUser.get());
    }
}