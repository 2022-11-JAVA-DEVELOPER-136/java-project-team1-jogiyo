--orders
insert into orders(o_no, o_date, o_total, m_id) values(orders_o_no_SEQ.nextval, sysdate, 28000, 'aaaa');
insert into orders(o_no, o_date, o_total, m_id) values(orders_o_no_SEQ.nextval, sysdate, 45000, 'bbbb');
insert into orders(o_no, o_date, o_total, m_id) values(orders_o_no_SEQ.nextval, sysdate, 32000, 'cccc');

--order_item
insert into order_item(oi_no, oi_qty, o_no, p_no) values(order_item_oi_no_SEQ.nextval, 1, orders_o_no_SEQ.currval, 4);
insert into order_item(oi_no, oi_qty, o_no, p_no) values(order_item_oi_no_SEQ.nextval, 1, orders_o_no_SEQ.currval, 5);
insert into order_item(oi_no, oi_qty, o_no, p_no) values(order_item_oi_no_SEQ.nextval, 1, orders_o_no_SEQ.currval, 6);
