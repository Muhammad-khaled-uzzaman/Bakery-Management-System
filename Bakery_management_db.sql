CREATE DATABASE Bakery_management_db

DROP DATABASE Bakery_management_db

CREATE TABLE CUSTOMER(
    id    int  PRIMARY KEY,
    name        VARCHAR(30)    NOT NULL,
    phone_no  VARCHAR(25) NOT NULL,
    address VARCHAR(30) DEFAULT NULL,
    due_balance float DEFAULT NULL,
    );

	CREATE TABLE ORDERS(
    ORDER_id           int  PRIMARY KEY,
	id int NOT NULL FOREIGN KEY REFERENCES CUSTOMER (id),
	total_balance       float  DEFAULT  NULL,
	submit_balance       float  DEFAULT  NULL,
	due_balance       float  DEFAULT  NULL,
    ORDER_DT            DATE   DEFAULT NULL,
   );

   CREATE TABLE PRODUCT(
   product_id           int PRIMARY KEY,
   PRODUCT_NAME          VARCHAR(20)   DEFAULT  NULL,
   SALE_PRICE           float  DEFAULT  NULL, 
   );

   CREATE TABLE STOCK(
   PRODUCT_NAME          VARCHAR(20)   NOT NULL,
   PRODUCT_INFO          VARCHAR(50)   NULL,
   QUANTITY              int           NOT NULL,
   );

   CREATE TABLE MATERIAL(
   PRODUCT_INFO          VARCHAR(50)   NULL,
   QUANTITY              int           NOT NULL,
   
   );

   CREATE TABLE Product_order(
   ORDER_id   int NOT NULL FOREIGN KEY REFERENCES ORDERS (ORDER_id),
   PRODUCT_NAME          VARCHAR(20)   NOT NULL,
   quantity int DEFAULT NULL,
   total_price float DEFAULT NULL,
   SALE_PRICE           float  DEFAULT  NULL, 
   );
   CREATE TABLE users(
   usernam VARCHAR(15) NOT NULL,
   upassword VARCHAR(15) NOT NULL,
   
   );

   SELECT * FROM CUSTOMER
   SELECT * FROM ORDERS
   SELECT * FROM PRODUCT
   SELECT * FROM STOCK
   SELECT * FROM MATERIAL
   SELECT * FROM users
   SELECT * FROM Product_order



   INSERT INTO users VALUES ('Rahman','123456')
    INSERT INTO users VALUES ('Karim','12345')

  