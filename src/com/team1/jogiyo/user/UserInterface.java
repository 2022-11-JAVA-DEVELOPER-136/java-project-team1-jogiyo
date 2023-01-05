package com.team1.jogiyo.user;

import java.util.List;

public interface UserInterface {

	public int insert(User user) throws Exception;
	public int update(User user) throws Exception;
	public int delete(String m_id) throws Exception;
	public User findByPrimaryKey(String m_id) throws Exception;
	public User findByName(String m_name) throws Exception;
	public List<User> findAll() throws Exception;
}
