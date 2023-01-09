package com.team1.jogiyo.ui.조성동;

import javax.swing.JPanel;

import com.team1.jogiyo.order.OrderService;
import com.team1.jogiyo.user.User;

import java.awt.Color;
import javax.swing.JLabel;

public class OrderHistoryDetailPanel_조성동 extends JPanel {

	/***************************************/
	/*
	 * Sevice객체선언
	 */
	
	OrderService orderService=null;
	/*
	 * loginMember객체선언
	 */
	User loginUser=null;
	/***************************************/
	
	
	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public OrderHistoryDetailPanel_조성동() throws Exception {
		setBackground(new Color(0, 64, 64));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 350, 589);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("주문번호");
		lblNewLabel.setBounds(29, 37, 75, 20);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(116, 38, 80, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("주문일");
		lblNewLabel_2.setBounds(29, 71, 57, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(115, 71, 57, 15);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("=====================================================");
		lblNewLabel_4.setBounds(12, 96, 326, 15);
		panel.add(lblNewLabel_4);

		/**************************************/
		orderService=new OrderService();
		loginUser = new User("bbbb", null, "csd", "지역", "폰넘버");
		
		
	}
}
