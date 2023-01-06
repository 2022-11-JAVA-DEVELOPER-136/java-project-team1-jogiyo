package com.team1.jogiyo.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.team1.jogiyo.common.DataSource;

public class UserDao implements UserInterface{
	private DataSource dataSource;
	
	public UserDao() {
		this.dataSource = new DataSource();
	}
	
	//UserInterface를 implements후 메소드 재정의 하세요
	@Override
	public int insert(User user) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_INSERT);
		pstmt.setString(1, user.getM_id());
		pstmt.setString(2, user.getM_password());
		pstmt.setString(3, user.getM_name());
		pstmt.setString(4, user.getM_loc());
		pstmt.setString(5, user.getM_phone());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	@Override
	public int update(User user) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_UPDATE);
		pstmt.setString(1, user.getM_password());
		pstmt.setString(2, user.getM_name());
		pstmt.setString(3, user.getM_loc());
		pstmt.setString(4, user.getM_phone());
		pstmt.setString(5, user.getM_id());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
				
	}
	
	@Override
	public int delete(String m_id) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_DELETE);
		pstmt.setString(1, m_id);
		int rowCount=pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	@Override
	public User findByPrimaryKey(String m_id) throws Exception {
		User user = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_SELECT_BY_ID);
		pstmt.setString(1,m_id);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			user=new User(rs.getString("m_id"),
					      rs.getString("m_password"),
					      rs.getString("m_name"),
					      rs.getString("m_loc"),
					      rs.getString("m_phone"));
		}
		
		return user;
	}
	
	@Override
	public User findByName(String m_name) throws Exception {
		User user = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_SELECT_BY_NAME);
		pstmt.setString(1,m_name);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			user=new User(rs.getString("m_id"),
					      rs.getString("m_password"),
					      rs.getString("m_name"),
					      rs.getString("m_loc"),
					      rs.getString("m_phone"));
		}
		
		return user;
		
		
		
	}
	
	@Override
	public List<User> findAll() throws Exception {
		List<User> userList = new ArrayList<User>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_SELECT_ALL);
		
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			userList.add(new User (rs.getString("m_id"),
					              rs.getString("m_password"),
					              rs.getString("m_name"),
					              rs.getString("m_loc"),
					              rs.getString("m_phone")));
		}
	
		
		return userList;
	}
}
