package cooba.service;

import com.cooba.entity.UserEntity;
import com.cooba.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    public void insert(UserEntity userEntity) {
        userMapper.insert(userEntity);
    }

    public void updateAmount(UserEntity userEntity) {
        userMapper.updateAmount(userEntity);
    }

    public void selectByAssetId(Integer assetId) {
        userMapper.selectByAssetId(assetId);
    }

    public void select(Long id) {
        userMapper.selectByPrimaryKey(id);
    }
}
