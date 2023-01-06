/***************회원******************/
--회원정보보기(select pk)
select * from userinfo where m_id='aaaa';
--회원정보수정(update pk)
update userinfo set m_password='2345', m_name='sdtest', m_loc='test', m_phone='010-1234-1234' where m_id='bbbb';
--회원탈퇴(delete pk)
delete from userinfo where m_id='hhhh';
--회원추가(insert)
insert into userinfo(m_id,m_password,m_name,m_loc,m_phone)values('hhhh','1234','송준기','구로','010-2122-2315');
insert into userinfo(m_id,m_password,m_name,m_loc,m_phone)values('iiii','1234','김태희','강남','010-2342-1353');
insert into userinfo(m_id,m_password,m_name,m_loc,m_phone)values('jjjj','1234','장동건','일산','010-5754-1353');
--select All
select * from userinfo;
--회원이름보기(select m_name)
select * from userinfo where m_name='송준기';





/****************제품*****************/
--제품리스트
select * from product;
--제품상세보기
select * from product where p_no=4;
--제품수정(X)
--제품삭제(X)
--제품추가(X)

/****************cart*****************/
--로그인한 멤버()의 카트리스트
select * from cart where m_id='bbbb';
select * from cart c join product p on c.p_no=p.p_no where m_id='bbbb';

--로그인한멤버()의 카트리스트삭제
delete from cart where cart_no=2;

--로그인한멤버()의 카트1개아이템 수량변경
update cart set c_qty = 3 where c_no=1;

--로그인한멤버()의 카트에 존재하는 제품의수(제품존재여부판단)
select count(*) "cnt" from cart where m_id='bbbb' and p_no=5;
--로그인한멤버()의 카트에 담기(수정)
update cart set c_qty = c_qty+1 where m_id='bbbb' and p_no=5;


/**********order**********/
--1.멤버한사람의 주문전체목록
select * from orders where m_id='bbbb';
--2.멤버한사람의 주문(주문아이템+제품)전체목록()
select * 
    from orders o 
    join order_item oi 
    on o.o_no=oi.o_no 
    join product p
    on p.p_no=oi.p_no
where m_id='cccc';

--
select 
    from orders o
    join order_item oi
    on o.o_no=oi.o_no
    join product p
    on p.p_no=oi.p_no
    join userinfo u
    on u.m_id=o.m_id
where o.m_id='cccc';
--
--3.멤버한사람의 주문(주문아이템+제품)한개()
select * 
    from orders o 
    join order_item oi 
    on o.o_no=oi.o_no 
    join product p
    on p.p_no=oi.p_no
where userid='guard1' and o.o_no=1;

--4.로그인한멤버() 주문1개 삭제
-- on delete cascade
delete orders where o_no=1;

--5.로그인한멤버() 주문전체 삭제
delete orders where userid='guard1';

desc order_item;