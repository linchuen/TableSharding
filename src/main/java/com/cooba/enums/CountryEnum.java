package com.cooba.enums;

import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
public enum CountryEnum {
    TAIWAN(1, "taiwan"),
    CHINA(2, "china"),
    JAPAN(3, "japan"),
    AMERICA(4, "america"),
    ;


    private final int id;
    private final String name;
    private static final Map<Integer,String> nameMap;

    static {
        nameMap = Arrays.stream(CountryEnum.values()).
                collect(Collectors.toMap(
                        CountryEnum::getId,
                        CountryEnum::getName));
    }

    CountryEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static String getNameById(int id) {
        return nameMap.get(id);
    }
}
