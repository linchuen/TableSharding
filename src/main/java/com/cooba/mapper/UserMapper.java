package com.cooba.mapper;

import com.cooba.entity.UserEntity;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface UserMapper {
    Optional<UserEntity> selectByPrimaryKey(long id);

    List<UserEntity> selectByAssetId(int assetId);

    int updateAmount(UserEntity userEntity);

    int insert(UserEntity userEntity);

    List<UserEntity> selectByAmountBetween(BigDecimal min, BigDecimal max);
}
