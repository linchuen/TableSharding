
CREATE IGNORE TABLE `country_record_taiwan` (
  `id` bigint(20) NOT NULL,
  `country_id` int(11) NOT NULL,
  `stock` varchar(20) DEFAULT NULL,
  `price` decimal(16,4) DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT IGNORE INTO main.country_record_taiwan
(id, country_id, stock, price, updated_time)
VALUES
(1, 1, 'taiwan01', 100, now()),
(2, 1, 'taiwan02', 200, now()),
(3, 1, 'taiwan03', 300, now());

CREATE IGNORE TABLE `country_record_china` (
  `id` bigint(20) NOT NULL,
  `country_id` int(11) NOT NULL,
  `stock` varchar(20) DEFAULT NULL,
  `price` decimal(16,4) DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT IGNORE INTO main.country_record_china
(id, country_id, stock, price, updated_time)
VALUES
(4, 2, 'china01', 100, now()),
(5, 2, 'china02', 200, now()),
(6, 2, 'china03', 300, now());

CREATE IGNORE TABLE `country_record_japan` (
  `id` bigint(20) NOT NULL,
  `country_id` int(11) NOT NULL,
  `stock` varchar(20) DEFAULT NULL,
  `price` decimal(16,4) DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT IGNORE INTO main.country_record_japan
(id, country_id, stock, price, updated_time)
VALUES
(7, 3, 'japan01', 100, now()),
(8, 3, 'japan02', 200, now()),
(9, 3, 'japan03', 300, now());

CREATE IGNORE TABLE `country_record_america` (
  `id` bigint(20) NOT NULL,
  `country_id` int(11) NOT NULL,
  `stock` varchar(20) DEFAULT NULL,
  `price` decimal(16,4) DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT IGNORE INTO main.country_record_america
(id, country_id, stock, price, updated_time)
VALUES
(10, 4, 'america01', 100, now()),
(11, 4, 'america02', 200, now()),
(12, 4, 'america03', 300, now());