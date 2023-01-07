package com.team1.jogiyo.cart;
/*
 이름    널?       유형           
----- -------- ------------ 
C_NO  NOT NULL NUMBER(10)   
C_QTY          NUMBER(10)   
P_NO           NUMBER(10)   
M_ID           VARCHAR2(50) 
 */
public class CartSQL {
	//카트에 담기
	//public static String CART_INSERT="insert into cart(c_no,c_qty,p_no,m_id) values(cart_c_no_SEQ.nextval,?,?,?)";				
	public static String CART_INSERT="insert cart(c_no,c_qty,m_id,p_no) values(cart_c_no_SEQ.nextval,?,?,?)";				
	//카트에 있는 제품의 수량 변경 (카트리스트에서 변경)
	public static String CART_UPDATE_BY_C_NO="update cart set c_qty=? where c_no=?";									
	//아이디로 카트 전체 날리기(주문완료 시 카트 삭제)
	public static String CART_DELETE_BY_M_ID="delete from cart where m_id=?";
	//카트 물품 하나 삭제 
	public static String CART_DELETE_BY_C_NO="delete from cart where c_no=?";
	//해당 카트번호의 카트내용(카트번호,수량)+제품내용(제품번호,이름,이미지,가격,설명) 찾기
	public static String CART_FIND_BY_C_NO="select * from cart c join product p on c.p_no=p.p_no where c_no=?";	
	//해당 아이디가 카트에 담은 모든 제품의 카트내용(카트번호,수량)+제품내용(제품번호,이름,이미지,가격,설명) 찾기
	public static String CART_FIND_BY_M_ID="select * from cart c join product p on c.p_no=p.p_no where m_id=?";		
}
