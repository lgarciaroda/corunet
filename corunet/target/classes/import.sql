-- DROP TABLE IF EXISTS prices;

-- CREATE TABLE prices (
-- 	price_list_id INT NOT NULL AUTO_INCREMENT,
-- 	brand_id INT,
-- 	product_id INT,
-- 	start_date TIMESTAMP,
--	end_date TIMESTAMP,
-- 	priority INT,
-- 	price DECIMAL(10.2),
-- 	currency VARCHAR(10),
-- 	PRIMARY KEY (price_list_id)
-- );

insert into prices (brand_id,product_id,start_date,end_date,priority,price,currency) values (1,35455,'2020-06-14 00.00.00','2020-12-31 23.59.59',0,'35.50','EUR');
insert into prices (brand_id,product_id,start_date,end_date,priority,price,currency) values (1,35455,'2020-06-14 15.00.00','2020-06-14 18.30.00',1,'25.45','EUR');
insert into prices (brand_id,product_id,start_date,end_date,priority,price,currency) values (1,35455,'2020-06-15 00.00.00','2020-06-15 11.00.00',1,'30.50','EUR');
insert into prices (brand_id,product_id,start_date,end_date,priority,price,currency) values (1,35455,'2020-06-15 16.00.00','2020-12-31 23.59.59',1,'38.95','EUR');