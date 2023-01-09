package com.team1.jogiyo.ui.조성동;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import com.team1.jogiyo.order.Order;
import com.team1.jogiyo.order.OrderService;
import com.team1.jogiyo.user.User;
import com.team1.jogiyo.user.UserService;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

public class OrderHistoryPanel_조성동 extends JPanel {
	/***************************************/
	/*
	 * Sevice객체선언
	 */
	OrderService orderService=null;
	UserService userService=null;
	/*
	 * loginMember객체선언
	 */
	User user=null;
	private JPanel OrderHistoryListPanel;
	/***************************************/
	
	/**
	 * Create the panel.
	 */
	public OrderHistoryPanel_조성동() throws Exception{
		setBackground(new Color(0, 64, 64));
		setLayout(null);
		
		JScrollPane OrderHistoryScrollPane = new JScrollPane();
		OrderHistoryScrollPane.setBounds(0, 0, 350, 502);
		add(OrderHistoryScrollPane);
		
		OrderHistoryListPanel = new JPanel();
		OrderHistoryListPanel.setPreferredSize(new Dimension(300, 700));
		OrderHistoryScrollPane.setViewportView(OrderHistoryListPanel);
		/******패널 생성자*******/
		JPanel OrderHistoryPanel = new JPanel();
		OrderHistoryPanel.setPreferredSize(new Dimension(300, 65));
		OrderHistoryPanel.setLayout(null);
		OrderHistoryListPanel.add(OrderHistoryPanel);
		
		JLabel DisplayProductNameLabel = new JLabel("");
		DisplayProductNameLabel.setBounds(99, 30, 66, 33);
		OrderHistoryPanel.add(DisplayProductNameLabel);
		
		JButton OrderHistoryDetailBtn = new JButton("");
		OrderHistoryDetailBtn.setBounds(247, 30, 25, 23);
		OrderHistoryPanel.add(OrderHistoryDetailBtn);
		
		JLabel DisplayTotalPriceLabel = new JLabel("");
		DisplayTotalPriceLabel.setBounds(167, 32, 68, 29);
		OrderHistoryPanel.add(DisplayTotalPriceLabel);
		
		JLabel lblNewLabel_2 = new JLabel("주문날짜");
		lblNewLabel_2.setBounds(12, 10, 57, 15);
		OrderHistoryPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("상품이름");
		lblNewLabel_3.setBounds(99, 10, 57, 15);
		OrderHistoryPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("총가격");
		lblNewLabel_4.setBounds(174, 10, 44, 15);
		OrderHistoryPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("주문상세");
		lblNewLabel_5.setBounds(237, 10, 57, 15);
		OrderHistoryPanel.add(lblNewLabel_5);
		
		JLabel DisplayDateLabel = new JLabel("");
		DisplayDateLabel.setBounds(0, 39, 81, 24);
		OrderHistoryPanel.add(DisplayDateLabel);
		
		
		/*******************************************/
		orderService = new OrderService();
		userService = new UserService();
		user = new User("bbbb", null, "csd", "지역", "폰넘버");
		
		OrderListPrint("bbbb");
	}
	
	private void OrderListPrint(String sUserId) throws Exception {
		List<Order> orderList =  orderService.list(sUserId);
		
		for (Order order : orderList) {
			JPanel OrderHistoryPanel = new JPanel();
			OrderHistoryPanel.setPreferredSize(new Dimension(300, 65));
			OrderHistoryPanel.setLayout(null);
			OrderHistoryListPanel.add(OrderHistoryPanel);
			//JLabel DisplayProductNameLabel = new JLabel("<html>"+order.getOrderItemList().get(0).getProduct().getP_name()+"</html>");
			JLabel DisplayProductNameLabel = new JLabel("<html>"+"1111"+"<br>"+"asfasf"+"</html>");
			DisplayProductNameLabel.setBounds(99, 30, 66, 33);
			OrderHistoryPanel.add(DisplayProductNameLabel);
			
			JButton OrderHistoryDetailBtn = new JButton("");
			OrderHistoryDetailBtn.setBounds(247, 30, 25, 23);
			OrderHistoryPanel.add(OrderHistoryDetailBtn);
			
			JLabel DisplayTotalPriceLabel = new JLabel("<html>"+order.getO_total()+"</html>");
			DisplayTotalPriceLabel.setBounds(167, 32, 68, 29);
			OrderHistoryPanel.add(DisplayTotalPriceLabel);
			
			JLabel lblNewLabel_2 = new JLabel("주문날짜");
			lblNewLabel_2.setBounds(12, 10, 57, 15);
			OrderHistoryPanel.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("상품이름");
			lblNewLabel_3.setBounds(99, 10, 57, 15);
			OrderHistoryPanel.add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("총가격");
			lblNewLabel_4.setBounds(174, 10, 44, 15);
			OrderHistoryPanel.add(lblNewLabel_4);
			
			JLabel lblNewLabel_5 = new JLabel("주문상세");
			lblNewLabel_5.setBounds(237, 10, 57, 15);
			OrderHistoryPanel.add(lblNewLabel_5);
			
			JLabel DisplayDateLabel = new JLabel("<html>"+"asf"+"</html>");
			DisplayDateLabel.setBounds(0, 39, 81, 24);
			OrderHistoryPanel.add(DisplayDateLabel);
			
			//변수에 값넣
			//DisplayDateLabel.setText(order.getOrderItemList().get(0).getO_no()+"");
			//DisplayProductNameLabel.setText(order.getOrderItemList().get(0).getProduct().getP_name());
			//DisplayTotalPriceLabel
		}
	}
}
