package com.cooba.service;

import com.cooba.entity.UserAssetDetail;
import com.cooba.entity.UserEntity;
import com.cooba.entity.UserGroupDto;
import com.cooba.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    public Long insert(UserEntity userEntity) {
        userMapper.insert(userEntity);
        return userEntity.getId();
    }

    public void updateAmount(UserEntity userEntity) {
        userMapper.updateAmount(userEntity);
    }

    public List<UserEntity> selectByAssetId(Integer assetId) {
         return userMapper.selectByAssetId(assetId);
    }

    public Optional<UserEntity> selectById(Long id) {
       return userMapper.selectByPrimaryKey(id);
    }

    public List<UserEntity> selectByAmountBetween(BigDecimal min, BigDecimal max) {
        return userMapper.selectByAmountBetween(min, max);
    }

    public List<UserAssetDetail> selectDetailByAssetId(Integer assetId) {
        return userMapper.selectDetailByAssetId(assetId);
    }

    public List<UserGroupDto> selectGroupByAssetId() {
        return userMapper.selectGroupByAssetId();
    }
}
