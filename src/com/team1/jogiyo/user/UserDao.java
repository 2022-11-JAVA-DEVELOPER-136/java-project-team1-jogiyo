package com.team1.jogiyo.user;

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
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int update(User user) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int delete(String m_id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public User findByPrimaryKey(String m_id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public User findByName(String m_name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<User> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
