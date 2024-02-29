CREATE TABLE `country` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT IGNORE INTO main.country
(id, name)
VALUES
(1, "taiwan"),
(2, "china"),
(3, "japan"),
(4, "america");