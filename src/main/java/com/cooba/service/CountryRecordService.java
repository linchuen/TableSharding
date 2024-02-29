package com.cooba.service;

import com.cooba.entity.CountryRecordEntity;
import com.cooba.mapper.CountryRecordMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryRecordService {
    private final CountryRecordMapper countryRecordMapper;

    public Long insert(CountryRecordEntity countryRecordEntity) {
        countryRecordMapper.insert(countryRecordEntity);
        return countryRecordEntity.getId();
    }

    public List<CountryRecordEntity> selectByCountryId(int countryId) {
        return countryRecordMapper.selectByCountryId(countryId);
    }
}
