package com.team1.jogiyo.cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.team1.jogiyo.common.DataSource;

public class CartDao implements CartInterface{
	Cart cart=new Cart();
	private DataSource dataSource;
	
	public CartDao() {
		this.dataSource=new DataSource();
	}

	@Override
	public int insert(Cart cart) throws Exception {
	//카트에 추가
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(CartSQL.CART_INSERT);
		pstmt.setInt(0, cart.getC_qty());
		pstmt.setString(1, cart.getM_id());
		pstmt.setObject(2, cart.getProduct());
		int rowCount=pstmt.executeUpdate();
		
		return rowCount;
	}

	@Override
	public int update(Cart cart) throws Exception {
	//카트에 있는 제품의 수량 설정
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(CartSQL.CART_UPDATE_BY_C_NO);
		pstmt.setInt(0, cart.getC_qty());
		pstmt.setInt(1, cart.getC_no());
		int rowCount=pstmt.executeUpdate();
		
		return rowCount;
	}

	@Override
	public int delete(int c_no) throws Exception {
		return 0;
	}


	@Override
	public List<Cart> findByUser() throws Exception {
		return null;
	}
	
	
	@Override
	public List<Cart> findByCartNo() throws Exception {
		return null;
	}
	
	
}
