package com.team1.jogiyo.categories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.team1.jogiyo.common.DataSource;
import com.team1.jogiyo.product.Product;

public class CategoriesDao {
	
	private DataSource dataSource;
	
	public CategoriesDao() {
		dataSource = new DataSource();
	}

	//ProductInterface를 implements후 메소드 재정의 하세요
	
	public int insert(Categories categories) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CategoriesSQL.CATEGORIES_INSERT);
		pstmt.setInt(1, categories.getCt_no());
		pstmt.setString(2, categories.getCt_name());
		pstmt.setString(3, categories.getCt_image());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		
		return rowCount;
	}

	public int update(Categories categories) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CategoriesSQL.CATEGORIES_UPDATE);
		pstmt.setString(1, categories.getCt_name());
		pstmt.setString(2, categories.getCt_image());
		pstmt.setInt(3, categories.getCt_no());
		
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		
		return rowCount;
	}
	
	public int delete(int ct_no) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CategoriesSQL.CATEGORIES_DELETE);
		pstmt.setInt(1, ct_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}

	public Categories findByPrimaryKey(int ct_no) throws Exception {
		Categories categories = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CategoriesSQL.CATEGORIES_FIND_BY_NO);
		pstmt.setInt(1, ct_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			categories = new Categories( 
							rs.getInt("ct_no"),
							rs.getString("ct_name"),
							rs.getString("ct_image"));
	    	}
		return categories;
	}
	
	public List<Categories> findAll() throws Exception{
		List<Categories> categoriesList = new ArrayList<Categories>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CategoriesSQL.CATEGORIES_FIND_BY_ALL);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Categories categories = new Categories( 
							rs.getInt("ct_no"),
							rs.getString("ct_name"),
							rs.getString("ct_image"));
			categoriesList.add(categories);
	    }
		return categoriesList;
	}

	}
	
