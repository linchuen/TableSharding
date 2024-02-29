package com.cooba.enums;

import lombok.Getter;

@Getter
public enum AssetEnum {
    TWD(1, "TWD"),
    CNY(2, "CNY"),
    JYN(3, "JYN"),
    USD(4, "USD"),
    ;


    private final int id;
    private final String name;

    AssetEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
