package com.team1.jogiyo.user;

public class User {
	private String m_id;
	private String m_password;
	private String m_name;
	private String m_loc;
	private String m_phone;
	public User() {
	}
	
	public User(String m_id, String m_password, String m_name, String m_loc, String m_phone) {
		super();
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_loc = m_loc;
		this.m_phone = m_phone;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_password() {
		return m_password;
	}

	public void setM_password(String m_password) {
		this.m_password = m_password;
	}

	public String getM_name() {
		return m_name;
	}
	

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_loc() {
		return m_loc;
	}

	public void setM_loc(String m_loc) {
		this.m_loc = m_loc;
	}

	public String getM_phone() {
		return m_phone;
	}

	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}

	public String toString() {
		return "Member [m_id=" + m_id + ", m_password=" + m_password + ", m_name=" + m_name + ", m_loc=" + m_loc
				+ ", m_phone=" + m_phone + "]";
	}
	
	
	
}
