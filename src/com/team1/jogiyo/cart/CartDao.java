package com.team1.jogiyo.cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.team1.jogiyo.common.DataSource;
import com.team1.jogiyo.product.Product;

public class CartDao{
	//Cart cart=new Cart();
	private DataSource dataSource;
	
	public CartDao() throws Exception{
		this.dataSource=new DataSource();
	}
	
	//카트 제품 존재 여부
	public int countByProductNo(String sUserId, int p_no) throws Exception{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		int count=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_COUNT_BY_M_ID_P_NO);
			pstmt.setString(1, sUserId);
			pstmt.setInt(2, p_no);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				count=rs.getInt(1);
			}
		} finally {
			if(con!=null) {
				rs.close();
				pstmt.close();
				con.close();
			}
		}
		return count;		
	}
	
	
	//카트에 추가
	public int insert(Cart cart) throws Exception {
		//유나님 CART_INSERT="insert into cart(c_no,c_qty,m_id,p_no) values(cart_c_no_SEQ.nextval,?,?,?)";				
		//CART_INSERT="insert into cart(c_no,c_qty,p_no,m_id) values(cart_c_no_SEQ.nextval,?,?,?)";
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_INSERT);
			pstmt.setInt(1, cart.getC_qty());
			pstmt.setInt(2, cart.getProduct().getP_no());
			pstmt.setString(3, cart.getM_id());
			rowCount=pstmt.executeUpdate();
		} finally {
			if(con!=null) {
				pstmt.close();
				con.close();
			}
		}
		return rowCount;
	}

	//카트에 있는 제품의 수량 변경 (카트리스트에서 변경)
	public int updateInCart(int c_no, int c_qty) throws Exception {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_UPDATE_BY_C_NO);
			pstmt.setInt(1, c_qty);
			pstmt.setInt(2, c_no);
			rowCount=pstmt.executeUpdate();
		} finally {
			if(con!=null) {
				pstmt.close();
				con.close();
			}
		}
		return rowCount;
	}
	//카트에 있는 제품의 수량 변경(상품에서 카트 수량 변경)
		public int updateInProduct(Cart cart) throws Exception {
			Connection con=null;
			PreparedStatement pstmt=null;
			int rowCount=0;
			try {
				con=dataSource.getConnection();
				pstmt=con.prepareStatement(CartSQL.CART_UPDATE_BY_C_NO);
				pstmt.setInt(1, cart.getC_qty());
				pstmt.setInt(2, cart.getC_no());
				rowCount=pstmt.executeUpdate();
			} finally {
				if(con!=null) {
					pstmt.close();
					con.close();
				}
			}
			return rowCount;
		}
	

	//카트 물품 하나 삭제 
	public int deleteByCartNo(int c_no) throws Exception {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_DELETE_BY_C_NO);
			pstmt.setInt(1, c_no);
			rowCount=pstmt.executeUpdate();
		} finally {
			if(con!=null) {
				pstmt.close();
				con.close();
			}
		}
		return rowCount;
	}

	//카트 전체 삭제
	public int deleteAll(String m_id) throws Exception {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_DELETE_BY_M_ID);
			pstmt.setString(1, m_id);
			rowCount=pstmt.executeUpdate();
		} finally {
			if(con!=null) {
				pstmt.close();
				con.close();
			}
		}
		return rowCount;
	}

	//해당 유저의 카트리스트 전체 보여주기
	public List<Cart> findByUser(String m_id) throws Exception {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<Cart> cartList=new ArrayList<Cart>();
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_FIND_BY_M_ID);
			pstmt.setString(1, m_id);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				cartList.add(new Cart(rs.getInt("c_no"),
									  rs.getInt("c_qty"),
									  rs.getString("m_id"),
									  new Product(rs.getInt("p_no"),
											  rs.getString("p_name"),
											  rs.getString("p_image"),
											  rs.getInt("p_price"),
											  rs.getString("p_desc"),
											  rs.getInt("ct_no")
											  )
									  )
							);
			}
		} finally {
			if(con!=null) {
				rs.close();
				pstmt.close();
				con.close();
			}
		}
		return cartList;
	}
	
	//카트번호로 해당 제품 보여주기?
	public List<Cart> findByCartNo(int c_no) throws Exception {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(CartSQL.CART_FIND_BY_C_NO);
		pstmt.setInt(1, c_no);
		ResultSet rs=pstmt.executeQuery();
		List<Cart> cartList=null;
		try{
			while(rs.next()) {
				cartList.add(new Cart(rs.getInt("c_no"),
									  rs.getInt("c_qty"),
									  rs.getString("m_id"),
									  new Product(rs.getInt("p_no"),
										  	  	  rs.getString("p_name"),
										  	  	  rs.getString("p_image"),
										  	  	  rs.getInt("p_price"),
										  	  	  rs.getString("p_desc"),
										  	  	  rs.getInt("ct_no")
										  	 	 )
									 )
							);
			} 
		}finally {
			rs.close();
			pstmt.close();
			con.close();
			}
		return cartList;
	}
}
