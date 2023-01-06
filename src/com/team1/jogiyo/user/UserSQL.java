package com.team1.jogiyo.user;

public class UserSQL {
	
	/*
	  insert into userinfo(m_id,m_password,m_name,m_loc,m_phone)values('hhhh','1234','송준기','구로','010-2122-2315');
	  update userinfo set m_password='2345', m_name='sdtest', m_loc='test', m_phone='010-1234-1234' where m_id='bbbb';
	  delete from userinfo where m_id='hhhh';
	  select * from userinfo where m_id='aaaa';
	  select * from userinfo where m_name='송준기';
	  select * from userinfo;
	 */
	
	
	
	public static final String USER_INSERT ="insert into userinfo(m_id,m_password,m_name,m_loc,m_phone)values(?,?,?,?,?)";
	public static final String USER_UPDATE ="update userinfo set m_password=?, m_name=?, m_loc=?, m_phone=? where m_id=?";
	public static final String USER_DELETE ="delete from userinfo where m_id=?";
	public static final String USER_SELECT_BY_ID ="select * from userinfo where m_id=?";
	public static final String USER_SELECT_BY_NAME ="select * from userinfo where m_name=?";
	public static final String USER_SELECT_ALL ="select * from userinfo";


}
