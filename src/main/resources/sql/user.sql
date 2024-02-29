CREATE TABLE `user_1` (
  `id` bigint(20) NOT NULL,
  `asset_id` int(11) NOT NULL,
  `amount` decimal(16,4) DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `user_2` (
  `id` bigint(20) NOT NULL,
  `asset_id` int(11) NOT NULL,
  `amount` decimal(16,4) DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
);