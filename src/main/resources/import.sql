insert into customer (id, name) values (1, 'Eletronics Eletro');
insert into customer (id, name) values (2, 'Smart Sales');

insert into product (id, name, value) values (1, 'Notebook', 2950.0);
insert into product (id, name, value) values (2, 'Smatphone', 1800.0);
insert into product (id, name, value) values (3, 'Tablet', 1100.0);

insert into sale (id, register, customer_id, taxDelivery, total) values (1, sysdate(), 1, 15.0, 2965.0);

insert into item (id, sale_id, product_id, quantity) values (1, 1, 1, 1);