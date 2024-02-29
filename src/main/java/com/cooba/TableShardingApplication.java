package com.cooba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cooba.mapper")
@SpringBootApplication
public class TableShardingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TableShardingApplication.class, args);
	}

}
