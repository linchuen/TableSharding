package com.cooba.mapper;

import com.cooba.entity.UserAssetDetail;
import com.cooba.entity.UserEntity;
import com.cooba.entity.UserGroupDto;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface UserMapper {
    Optional<UserEntity> selectByPrimaryKey(long id);

    List<UserEntity> selectByAssetId(int assetId);

    int updateAmount(UserEntity userEntity);

    int insert(UserEntity userEntity);

    List<UserEntity> selectByAmountBetween(BigDecimal min, BigDecimal max);

    List<UserAssetDetail> selectDetailByAssetId(int assetId);

    List<UserGroupDto> selectGroupByAssetId();
}
