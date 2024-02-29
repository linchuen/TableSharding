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
    private LocalDateTime updatedTime;
}
