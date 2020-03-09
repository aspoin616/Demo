INSERT INTO goods (id, name, price)
VALUES (1, 'Cx 5', 1000000),
       (2, 'Lada granta', 20000);
INSERT INTO order_line (id, goods_id, order_id, count)
VALUES (1, 1, 1, 1);
INSERT INTO order_table (id, client, address, date)
VALUES (1, 'Client', 'Sqint-p', '2019-03-24');