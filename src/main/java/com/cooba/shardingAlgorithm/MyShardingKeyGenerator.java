package com.cooba.shardingAlgorithm;

import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class MyShardingKeyGenerator implements ShardingKeyGenerator {


    @Override
    public Comparable<Long> generateKey() {
        return null;
    }

    @Override
    public String getType() {
        return "country_record_id";
    }

    @Override
    public Properties getProperties() {
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
