package cooba.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class UserEntity {
    private Long id;
    private Integer assetId;
    private BigDecimal amount;
    private Date updatedTime;
}
