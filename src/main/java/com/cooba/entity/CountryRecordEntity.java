package com.cooba.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CountryRecordEntity {
    private Long id;
    private Integer countryId;
    private String countryName;
    private String stock;
    private BigDecimal price;
    private Date updatedTime;
}
