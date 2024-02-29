package com.cooba.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class UserEntity {
    private Long id;
    private Integer assetId;
    private BigDecimal amount;
    //LocalDateTime not work for shardingsphere 4.1.1
    private Date updatedTime;
}
