package com.team1.jogiyo.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.team1.jogiyo.common.DataSource;

public class ProductDao {
	
	private DataSource dataSource;
	
	public ProductDao() {
		dataSource = new DataSource();
	}

	//ProductInterface를 implements후 메소드 재정의 하세요
	
/*
 이름      널?       유형            
------- -------- ------------- 
P_NO    NOT NULL NUMBER(10)    
P_NAME           VARCHAR2(50)  
P_IMAGE          VARCHAR2(50)  
P_PRICE          NUMBER(10)    
P_DESC           VARCHAR2(200) 
CT_NO            NUMBER(10)    
 */
	public int insert(Product product) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_INSERT);
		pstmt.setInt(1,product.getP_no());
		pstmt.setString(2, product.getP_name());
		pstmt.setString(3, product.getP_image());
		pstmt.setInt(4, product.getP_price());
		pstmt.setString(5, product.getP_desc());
		pstmt.setInt(6, product.getCt_no());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		
		return rowCount;
	}

	public int update(Product product) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_UPDATE);
		pstmt.setString(1, product.getP_name());
		pstmt.setString(2, product.getP_image());
		pstmt.setInt(3, product.getP_price());
		pstmt.setString(4, product.getP_desc());
		pstmt.setInt(5, product.getCt_no());
		pstmt.setInt(6,product.getP_no());
		
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		
		return rowCount;
	}
	
	public int delete(String p_name) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_DELETE);
		pstmt.setString(1, p_name);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}

	public Product findByPrimaryKey(int p_no) throws Exception {
		Product product = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_FIND_BY_NO);
		pstmt.setInt(1, p_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			product = new Product( 
							rs.getInt("p_no"),
							rs.getString("p_name"),
							rs.getString("p_image"),
							rs.getInt("p_price"),
							rs.getString("p_desc"),
							rs.getInt("ct_no"));
	    	}
		
		rs.close();
		pstmt.close();
		con.close();
		
		return product;
	}
	
	public Product findByName(String p_name) throws Exception {
		Product product = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_FIND_BY_NAME);
		pstmt.setString(1, p_name);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			product = new Product( 
							rs.getInt("p_no"),
							rs.getString("p_name"),
							rs.getString("p_image"),
							rs.getInt("p_price"),
							rs.getString("p_desc"),
							rs.getInt("ct_no"));
	    	}
		
		rs.close();
		pstmt.close();
		con.close();
		return product;
	}
	
	public List<Product> findAll() throws Exception{
		List<Product> productList = new ArrayList<Product>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL.PRODUCT_FIND_BY_ALL);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Product product = new Product( 
							rs.getInt("p_no"),
							rs.getString("p_name"),
							rs.getString("p_image"),
							rs.getInt("p_price"),
							rs.getString("p_desc"),
							rs.getInt("ct_no"));
			productList.add(product);
	    }
		
		rs.close();
		pstmt.close();
		con.close();
		return productList;
	}

	}
	
