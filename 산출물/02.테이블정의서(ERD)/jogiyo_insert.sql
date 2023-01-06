/**********************categories insert************************/
--Categories insert
insert into categories VALUES (10,'한식',null);
insert into categories VALUES (20,'중식',null);
insert into categories VALUES (30,'분식',null);

/**********************product insert************************/
desc product;
insert into product values(product_p_no_SEQ.nextval,'치킨','chicken.jpg',18000,'바삭바삭후라이드치킨',10);
insert into product values(product_p_no_SEQ.nextval,'피자','chicken.jpg',24000,'맛있는피자',20);
insert into product values(product_p_no_SEQ.nextval,'자장면','jajangmyeon.jpg',8000,'고소한자장면',30);

/**********************member insert************************/
insert into userinfo(m_id,m_password,m_name,m_loc,m_phone) values('aaaa','1234','손요셉','성남','010-1111-1111');
insert into userinfo(m_id,m_password,m_name,m_loc,m_phone) values('bbbb','1234','조성동','강남','010-2222-2222');
insert into userinfo(m_id,m_password,m_name,m_loc,m_phone) values('cccc','1234','정유나','선릉','010-3333-3333');
insert into userinfo(m_id,m_password,m_name,m_loc,m_phone) values('dddd','1234','이은지','천호','010-4444-4444');
insert into userinfo(m_id,m_password,m_name,m_loc,m_phone) values('ffff','1234','유승근','역삼','010-5555-5555');
insert into userinfo(m_id,m_password,m_name,m_loc,m_phone) values('gggg','1234','이다은','삼성','010-6666-6666');

/**********************cart insert************************/
--Cart insert
desc cart;
insert into cart(c_no,c_qty,p_no,m_id) VALUES(CART_C_NO_SEQ.nextval,1,1,'aaaa');
insert into cart(c_no,c_qty,p_no,m_id) VALUES(CART_C_NO_SEQ.nextval,2,2,'bbbb');
insert into cart(c_no,c_qty,p_no,m_id) VALUES(CART_C_NO_SEQ.nextval,3,3,'cccc');

/**********************order insert************************/
desc order_item;
--1.orders
insert into orders(o_no, o_date, o_total, m_id) values(orders_o_no_SEQ.nextval, sysdate, 28000, 'aaaa');
--1-1.order_item
insert into order_item(oi_no, oi_qty, o_no, p_no) values(order_item_oi_no_SEQ.nextval, 1, orders_o_no_SEQ.currval, 1);
insert into order_item(oi_no, oi_qty, o_no, p_no) values(order_item_oi_no_SEQ.nextval, 2, orders_o_no_SEQ.currval, 2);

--2.orders
insert into orders(o_no, o_date, o_total, m_id) values(orders_o_no_SEQ.nextval, sysdate, 45000, 'bbbb');
--2-1.order_item
insert into order_item(oi_no, oi_qty, o_no, p_no) values(order_item_oi_no_SEQ.nextval, 1, orders_o_no_SEQ.currval, 1);
insert into order_item(oi_no, oi_qty, o_no, p_no) values(order_item_oi_no_SEQ.nextval, 2, orders_o_no_SEQ.currval, 2);
insert into order_item(oi_no, oi_qty, o_no, p_no) values(order_item_oi_no_SEQ.nextval, 3, orders_o_no_SEQ.currval, 3);

--3.orders
insert into orders(o_no, o_date, o_total, m_id) values(orders_o_no_SEQ.nextval, sysdate, 32000, 'cccc');
--3-1.order_item
insert into order_item(oi_no, oi_qty, o_no, p_no) values(order_item_oi_no_SEQ.nextval, 4, orders_o_no_SEQ.currval, 1);
insert into order_item(oi_no, oi_qty, o_no, p_no) values(order_item_oi_no_SEQ.nextval, 5, orders_o_no_SEQ.currval, 2);
insert into order_item(oi_no, oi_qty, o_no, p_no) values(order_item_oi_no_SEQ.nextval, 6, orders_o_no_SEQ.currval, 3);








