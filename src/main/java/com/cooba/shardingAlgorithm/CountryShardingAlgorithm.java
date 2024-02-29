package com.cooba.shardingAlgorithm;

import com.cooba.enums.CountryEnum;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

public class CountryShardingAlgorithm implements PreciseShardingAlgorithm<Integer> {
    @Override
    public String doSharding(Collection collection, PreciseShardingValue preciseShardingValue) {
        int countryId = (int) preciseShardingValue.getValue();
        String countryName = CountryEnum.getNameById(countryId);
        return preciseShardingValue.getLogicTableName() + "_" + countryName;
    }
}
