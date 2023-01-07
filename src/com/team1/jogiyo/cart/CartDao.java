package com.team1.jogiyo.cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.team1.jogiyo.common.DataSource;

public class CartDao{
	Cart cart=new Cart();
	private DataSource dataSource;
	
	public CartDao() {
		this.dataSource=new DataSource();
	}

	//카트에 추가
	public int insert(Cart cart) throws Exception {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(CartSQL.CART_INSERT);
		pstmt.setInt(1, cart.getC_qty());
		pstmt.setString(2, cart.getM_id());
		pstmt.setObject(3, cart.getProduct());
		int rowCount=pstmt.executeUpdate();
		
		return rowCount;
	}

	//카트에 있는 제품의 수량 변경 (카트리스트에서 변경)
	public int update(Cart cart) throws Exception {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(CartSQL.CART_UPDATE_BY_C_NO);
		pstmt.setInt(1, cart.getC_qty());
		pstmt.setInt(2, cart.getC_no());
		int rowCount=pstmt.executeUpdate();
		
		return rowCount;
	}

	//카트 물품 하나 삭제 
	public int deleteByCartNo(int c_no) throws Exception {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(CartSQL.CART_DELETE_BY_C_NO);
		pstmt.setInt(1, c_no);
		int rowCount=pstmt.executeUpdate();

		return rowCount;
	}

	//카트 전체 삭제
	public int deleteAll(String m_id) throws Exception {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(CartSQL.CART_DELETE_BY_M_ID);
		pstmt.setString(1, m_id);
		int rowCount=pstmt.executeUpdate();

		return rowCount;
	}

	public List<Cart> findByUser() throws Exception {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(CartSQL.CART_FIND_BY_M_ID);
		
		return null;
	}
	
	
	public List<Cart> findByCartNo() throws Exception {
		return null;
	}
	
	
}
