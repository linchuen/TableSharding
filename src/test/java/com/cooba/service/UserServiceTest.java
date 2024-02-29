package com.cooba.service;

import com.cooba.entity.UserAssetDetail;
import com.cooba.entity.UserEntity;
import com.cooba.enums.AssetEnum;
import com.github.pagehelper.PageHelper;
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
        Long insertId = userService.insert(userEntity);

        System.out.println(insertId);
        Assertions.assertNotNull(insertId);
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
    void selectById() {
        UserEntity userEntity = Instancio.create(UserEntity.class);
        Long insertId = userService.insert(userEntity);

        Optional<UserEntity> optionalUser = userService.selectById(insertId);
        System.out.println(optionalUser.get());
    }

    @Test
    void selectByAmountBetween() {
        userService.selectByAmountBetween(BigDecimal.ZERO, BigDecimal.valueOf(1000)).forEach(System.out::println);
    }

    @Test
    void selectDetailByAssetId() {
         userService.selectDetailByAssetId(AssetEnum.TWD.getId()).forEach(System.out::println);
    }

    @Test
    void selectDetailByAssetIdWithPAge() {
        PageHelper.startPage(1, 1);
        userService.selectDetailByAssetId(AssetEnum.TWD.getId()).forEach(System.out::println);

        PageHelper.startPage(2, 1);
        userService.selectDetailByAssetId(AssetEnum.TWD.getId()).forEach(System.out::println);
    }

    @Test
    void selectGroupByAssetId() {
        userService.selectGroupByAssetId().forEach(System.out::println);
    }
}