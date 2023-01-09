/****************제품*****************/
--제품리스트
select * from product;
--제품상세보기
select * from product where p_no=4;

--제품수정(X)

update product set 
    p_name = '후라이드치킨' ,
    p_image = 'chicken1.jpg' ,
    p_price = 19000 ,
    p_desc = '황금올리브유로튀긴후라이드치킨' ,
    ct_no = 10
where p_no='4';

--제품삭제(X)

delete from product where p_no = 4;

--제품추가(X)

insert into product values(product_p_no_SEQ.nextval,'불고기','bulgogi.jpg',21000,'촉촉한불고기',10);

desc product;

