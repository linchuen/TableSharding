package com.cooba.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class UserAssetDetail {
    private Long id;
    private String assetName;
    private BigDecimal amount;
    private Date updatedTime;
}
