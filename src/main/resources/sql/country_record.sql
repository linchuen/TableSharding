
CREATE TABLE `country_record_taiwan` (
  `id` bigint(20) NOT NULL,
  `country_id` int(11) NOT NULL,
  `stock` varchar(20) DEFAULT NULL,
  `price` decimal(16,4) DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `country_record_china` (
  `id` bigint(20) NOT NULL,
  `country_id` int(11) NOT NULL,
  `stock` varchar(20) DEFAULT NULL,
  `price` decimal(16,4) DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `country_record_japan` (
  `id` bigint(20) NOT NULL,
  `country_id` int(11) NOT NULL,
  `stock` varchar(20) DEFAULT NULL,
  `price` decimal(16,4) DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `country_record_america` (
  `id` bigint(20) NOT NULL,
  `country_id` int(11) NOT NULL,
  `stock` varchar(20) DEFAULT NULL,
  `price` decimal(16,4) DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
);