CREATE TABLE `user_1` (
  `id` bigint(20) NOT NULL,
  `asset_id` int(11) NOT NULL,
  `amount` decimal(16,4) DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT IGNORE INTO main.user_1
(id, asset_id, amount, updated_time)
VALUES
(2, 1, 100.0000, now()),
(4, 2, 200.0000, now()),
(6, 3, 300.0000, now()),
(8, 4, 400.0000, now());

CREATE TABLE `user_2` (
  `id` bigint(20) NOT NULL,
  `asset_id` int(11) NOT NULL,
  `amount` decimal(16,4) DEFAULT NULL,
  `updated_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT IGNORE INTO main.user_2
(id, asset_id, amount, updated_time)
VALUES
(1, 1, 100.0000, now()),
(3, 2, 200.0000, now()),
(5, 3, 300.0000, now()),
(7, 4, 400.0000, now());