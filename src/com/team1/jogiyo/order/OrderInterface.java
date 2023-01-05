package com.team1.jogiyo.order;

import java.util.List;

public interface OrderInterface {

	public int insert(Orders orders) throws Exception;
	public int update(Orders orders) throws Exception;
	public int delete(int o_no) throws Exception;
	public Orders findByPrimaryKey(int o_no) throws Exception;
	//public Orders findByMemberID(String m_id) throws Exception;
	public List<Orders> findAll() throws Exception;
}
