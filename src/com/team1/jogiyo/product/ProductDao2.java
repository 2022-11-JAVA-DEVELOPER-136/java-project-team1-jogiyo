package com.team1.jogiyo.product;

import java.sql.*;
import java.util.*;

import com.team1.jogiyo.common.*;

public class ProductDao2 {

	//ProductInterface를 implements후 메소드 재정의 하세요
	private DataSource dataSource;
	
	public ProductDao2() {
		dataSource = new DataSource();
	}
	
	
	public int insert(Product product) throws Exception {
		
		return 0;
	}
	
	
	public int update(Product product) throws Exception {
		
		return 0;
	}
	public int delete(String p_name) throws Exception {
		
		return 0;
	}
	
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
	
	public Product findByPrimaryKey(int p_no) throws Exception {
		Product product = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL2.PRODUCT_FIND_BY_NO);
		pstmt.setInt(1, p_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			product = new Product(rs.getInt("p_no"),
									rs.getString("p_name"),
									rs.getNString("p_image"),
									rs.getInt("p_price"),
									rs.getString("p_desc"),
									rs.getInt("ct_no"));
		}
		
		return product;
	}
	public Product findByName(String p_name) throws Exception {
		Product product = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL2.PRODUCT_FIND_BY_NAME);
		pstmt.setString(0, p_name);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			product = new Product(rs.getInt("p_no"),
									rs.getString("p_name"),
									rs.getNString("p_image"),
									rs.getInt("p_price"),
									rs.getString("p_desc"),
									rs.getInt("ct_no"));
		}
		return product;
	}
	public List<Product> findAll() throws Exception {
		List<Product> productList = new ArrayList<Product>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(ProductSQL2.PRODUCT_FIND_ALL);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Product product = new Product(rs.getInt("p_no"),
											rs.getString("p_name"),
											rs.getNString("p_image"),
											rs.getInt("p_price"),
											rs.getString("p_desc"),
											rs.getInt("ct_no"));
			productList.add(product);
		}
		return productList;
	}
}
