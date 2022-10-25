DROP TABLE IF EXISTS books;

CREATE TABLE books
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    author   VARCHAR(250) NOT NULL,
    title    VARCHAR(250) NOT NULL,
    priceOld VARCHAR(250) DEFAULT NULL,
    price    VARCHAR(250) DEFAULT NULL,
    discount TINYINT NOT NULL DEFAULT 0
);

DROP TABLE IF EXISTS authors;

create table authors
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name  VARCHAR(50)
);