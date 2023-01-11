/**********************categories insert************************/
--Categories insert
insert into categories VALUES (10,'한식',null);
insert into categories VALUES (20,'중식',null);
insert into categories VALUES (30,'분식',null);

/**********************product insert************************/
desc product;
insert into product values(product_p_no_SEQ.nextval,'순대국밥','aaa.jpg',9000,'순대가 들어간 국밥',10);
insert into product values(product_p_no_SEQ.nextval,'김치찜','bbb.jpg',24000,'오랜시간 전해져 내려온 손맛',10);
insert into product values(product_p_no_SEQ.nextval,'삼겹살','ccc.jpg',15000,'노릇노릇 맛있게 구운 삼겹살',10);
insert into product values(product_p_no_SEQ.nextval,'자장면','ddd.jpg',8000,'고급 중식당 맛 그대로 불맛 가득',20);
insert into product values(product_p_no_SEQ.nextval,'삼선짬뽕','eee.jpg',12000,'사천고추를 넣은 얼큰하고 칼칼한 맛',20);
insert into product values(product_p_no_SEQ.nextval,'탕수육','fff.jpg',25000,'비법 소스를 곁들인 음식으로 인절미 같은 쫄깃한 식감',20);
insert into product values(product_p_no_SEQ.nextval,'떡볶이','ggg.jpg',5000,'남녀노소 좋아할 매콤달달한 맛',30);
insert into product values(product_p_no_SEQ.nextval,'어묵','hhh.jpg',4000,'시원한 국물과 씹는 맛이 다른 수제 어묵',30);
insert into product values(product_p_no_SEQ.nextval,'순대','hhh.jpg',6000,'진짜 야채를 다져 넣은 건강한 순대',30);


/**********************member insert************************/
insert into userinfo(m_id,m_password,m_name,m_loc,m_phone) values('aaaa','1234','손요셉','성남','010-1111-1111');
insert into userinfo(m_id,m_password,m_name,m_loc,m_phone) values('bbbb','1234','조성동','강남','010-2222-2222');
insert into userinfo(m_id,m_password,m_name,m_loc,m_phone) values('cccc','1234','정유나','선릉','010-3333-3333');
insert into userinfo(m_id,m_password,m_name,m_loc,m_phone) values('dddd','1234','이은지','천호','010-4444-4444');
insert into userinfo(m_id,m_password,m_name,m_loc,m_phone) values('ffff','1234','유승근','역삼','010-5555-5555');
insert into userinfo(m_id,m_password,m_name,m_loc,m_phone) values('gggg','1234','이다은','삼성','010-6666-6666');
insert into userinfo(m_id,m_password,m_name,m_loc,m_phone) values('hhhh','1234','원빈','대전','010-7777-7777');
insert into userinfo(m_id,m_password,m_name,m_loc,m_phone) values('iiii','1234','현빈','논현','010-8888-8888');
insert into userinfo(m_id,m_password,m_name,m_loc,m_phone) values('jjjj','1234','장동건','분당','010-9999-9999');
insert into userinfo(m_id,m_password,m_name,m_loc,m_phone) values('kkkk','1234','전지현','삼성','010-2352-2573');

/**********************cart insert************************/
--Cart insert
desc cart;
insert into cart(c_no,c_qty,p_no,m_id) VALUES(CART_C_NO_SEQ.nextval,1,1,'aaaa');
insert into cart(c_no,c_qty,p_no,m_id) VALUES(CART_C_NO_SEQ.nextval,2,2,'bbbb');
insert into cart(c_no,c_qty,p_no,m_id) VALUES(CART_C_NO_SEQ.nextval,3,3,'cccc');
insert into cart(c_no,c_qty,p_no,m_id) values(cart_c_no_SEQ.nextval,4,1,'bbbb');
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








