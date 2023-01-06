/***************회원******************/
--회원정보보기(select pk)
select * from userinfo where m_id='aaaa';
--회원정보수정(update pk)
update userinfo set m_password = 'aaaa1' , m_name = '수정' , m_loc = '서울 강남구' , m_phone = '010-0000-00001' where m_id = 'aaaa';
--회원탈퇴(delete pk)
delete userinfo where m_id = 'aaaa';


이름         널?       유형            
---------- -------- ------------- 
M_ID       NOT NULL VARCHAR2(50)  
M_PASSWORD NOT NULL VARCHAR2(50)  
M_NAME     NOT NULL VARCHAR2(50)  
M_LOC      NOT NULL VARCHAR2(100) 
M_PHONE             VARCHAR2(20)  


/****************제품*****************/


--제품리스트
select * from product;
--제품상세보기
select * from product where p_no=1;
--제품수정(X)
--제품삭제(X)
--제품추가(X)

