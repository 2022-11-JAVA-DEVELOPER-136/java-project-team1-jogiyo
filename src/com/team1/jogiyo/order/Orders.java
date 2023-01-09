package com.team1.jogiyo.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Orders {
	private int o_no;
	private Date o_date;
	private int o_total;
	//FK
	private String m_id;
	/***********List<OrderItem>****/
	private List<OrderItem> orderItemList;
	public Orders() {
		orderItemList=new ArrayList<OrderItem>();
	}
	public Orders(int o_no, Date o_date, int o_total, String m_id) {
		super();
		this.o_no = o_no;
		this.o_date = o_date;
		this.o_total = o_total;
		this.m_id = m_id;
		this.orderItemList = new ArrayList<OrderItem>();
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
	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}
	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}
	@Override
	public String toString() {
		return "Orders [o_no=" + o_no + ", o_date=" + o_date + ", o_total=" + o_total + ", m_id=" + m_id
				+ ", orderItemList=" + orderItemList + "]\n";
	}
	
	
}
