package com.team1.jogiyo.order;

import java.util.*;

public class Orders {
	private int o_no;
	private Date o_date;
	private int o_total;
	//FK
	private String m_id;
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}

	public Orders(int o_no, Date o_date, int o_total, String m_id) {
		super();
		this.o_no = o_no;
		this.o_date = o_date;
		this.o_total = o_total;
		this.m_id = m_id;
	}

	public int getO_no() {
		return o_no;
	}

	public void setO_no(int o_no) {
		this.o_no = o_no;
	}

	public Date getO_date() {
		return o_date;
	}

	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}

	public int getO_total() {
		return o_total;
	}

	public void setO_total(int o_total) {
		this.o_total = o_total;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String toString() {
		return "Order [o_no=" + o_no + ", o_date=" + o_date + ", o_total=" + o_total + ", m_id=" + m_id + "]";
	}
	
}
