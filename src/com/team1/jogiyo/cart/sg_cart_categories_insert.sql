--Categories insert


insert into categories VALUES (10,'한식',null);
insert into categories VALUES (20,'중식',null);
insert into categories VALUES (30,'분식',null);

--Cart insert

insert into cart(c_no,c_qty,p_no,m_id) VALUES(CART_C_NO_SEQ.nextval,1,4,'aaaa');
insert into cart(c_no,c_qty,p_no,m_id) VALUES(CART_C_NO_SEQ.nextval,2,5,'bbbb');
insert into cart(c_no,c_qty,p_no,m_id) VALUES(CART_C_NO_SEQ.nextval,3,6,'cccc');


