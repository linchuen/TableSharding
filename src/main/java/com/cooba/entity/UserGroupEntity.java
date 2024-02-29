package com.cooba.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class UserGroupEntity {
    private Integer assetId;
    private BigDecimal amountTotal;
}
