package com.team1.jogiyo.categories;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.team1.jogiyo.common.DataSource;

public class CategoriesDao {
private DataSource dataSource;
	
	public CategoriesDao() {
		dataSource = new DataSource();
	}
	
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
	
	public int delete(String ct_name) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CategoriesSQL.CATEGORIES_DELETE);
		pstmt.setString(1, ct_name);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();;
		return rowCount;
	}
	
	public Categories findByPrimaryKey(int ct_no) throws Exception {
		Categories categories = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CategoriesSQL.CATEGORIES_FIND_BY_NO);
		pstmt.setInt(1, ct_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			categories = new Categories(rs.getInt("ct_no"),
										rs.getString("ct_name"),
										rs.getNString("ct_image"));
		}
		rs.close();
		pstmt.close();
		con.close();
		return categories;
	}
	
	public Categories findByName(String ct_name) throws Exception {
		Categories categories = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CategoriesSQL.CATEGORIES_FIND_BY_NAME);
		pstmt.setString(1, ct_name);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			categories = new Categories(rs.getInt("ct_no"),
										rs.getString("ct_name"),
										rs.getNString("ct_image"));
		}
		rs.close();
		pstmt.close();
		con.close();
		return categories;
	}
	public List<Categories> findAll() throws Exception {
		List<Categories> categoriesList = new ArrayList<Categories>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CategoriesSQL.CATEGORIES_FIND_ALL);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Categories categories = new Categories(rs.getInt("ct_no"),
											rs.getString("ct_name"),
											rs.getNString("ct_image"));
			categoriesList.add(categories);
		}
		rs.close();
		pstmt.close();
		con.close();
		return categoriesList;
	}
}
