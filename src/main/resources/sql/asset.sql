CREATE TABLE `asset` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
);


INSERT IGNORE INTO main.asset
(id, name)
VALUES
(1, "TWD"),
(2, "CNY"),
(3, "JYN"),
(4, "USD");