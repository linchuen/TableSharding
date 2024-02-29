package com.cooba.service;

import com.cooba.entity.CountryRecordEntity;
import com.cooba.enums.CountryEnum;
import com.github.pagehelper.PageHelper;
import org.instancio.Instancio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CountryRecordServiceTest {
    @Autowired
    CountryRecordService countryRecordService;

    @Test
    void insert() {
        CountryRecordEntity countryRecordEntity = Instancio.create(CountryRecordEntity.class);
        countryRecordEntity.setCountryId(CountryEnum.TAIWAN.getId());
        Long id = countryRecordService.insert(countryRecordEntity);
        System.out.println(id);
        Assertions.assertNotNull(id);
    }

    @Test
    void selectByCountryId() {
        countryRecordService.selectByCountryId(CountryEnum.TAIWAN.getId()).forEach(System.out::println);
    }

    @Test
    void selectByCountryIdWithPage() {
        PageHelper.startPage(1, 2);
        countryRecordService.selectByCountryId(CountryEnum.TAIWAN.getId()).forEach(System.out::println);
    }
}