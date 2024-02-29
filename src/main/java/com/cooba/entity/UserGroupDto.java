package com.cooba.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserGroupDto {
    private Integer assetId;
    private BigDecimal amountTotal;
}
