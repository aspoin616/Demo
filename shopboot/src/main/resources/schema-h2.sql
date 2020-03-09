DROP TABLE IF EXISTS goods;
CREATE TABLE goods
(
    id    INTEGER,
    name  VARCHAR,
    price INTEGER
);
DROP TABLE IF EXISTS order_line;
CREATE TABLE order_line
(
    id       INTEGER,
    goods_id INTEGER,
    order_id INTEGER,
    count    INTEGER
);
DROP TABLE IF EXISTS order_table;
CREATE TABLE order_table
(
    id      INTEGER,
    client  VARCHAR,
    address VARCHAR,
    date    DATE
);
