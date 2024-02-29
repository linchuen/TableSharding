package com.cooba.mapper;

import com.cooba.entity.CountryRecordEntity;

import java.util.List;

public interface CountryRecordMapper {

    int insert(CountryRecordEntity countryRecordEntity);

    List<CountryRecordEntity> selectByCountryId(int countryId);
}
