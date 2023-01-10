package com.team1.jogiyo.ui.조성동;

import javax.swing.JPanel;

import com.team1.jogiyo.order.Order;
import com.team1.jogiyo.order.OrderItem;
import com.team1.jogiyo.order.OrderService;
import com.team1.jogiyo.product.Product;
import com.team1.jogiyo.user.User;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.util.List;

import javax.swing.JButton;

public class OrderHistoryDetailTabbedPanel_조성동 extends JPanel {

	/***************************************/
	/*
	 * Sevice객체선언
	 */
	
	OrderService orderService=null;
	/*
	 * loginMember객체선언
	 */
	User loginUser=null;
	
	private JPanel OrderProductListPanel;
	private JPanel panel;
	private JButton ToOrderHistoryBtn;
	private JLabel OrderNumberLabel;
	private JLabel OrderDateLabel;
	private JLabel OrderTotalPriceLabel;
	private JLabel OrderUserPhoneLabel;
	private JLabel OrderUserLocLabel;
	/***************************************/
	
	
	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public OrderHistoryDetailTabbedPanel_조성동() throws Exception {
		setBackground(new Color(0, 0, 160));
		setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 370, 589);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("주문번호");
		lblNewLabel.setBounds(77, 22, 75, 20);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("주문일");
		lblNewLabel_2.setBounds(77, 56, 57, 15);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("=========================================================");
		lblNewLabel_4.setBounds(12, 81, 346, 15);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("주문제품상세");
		lblNewLabel_5.setBounds(77, 107, 97, 15);
		panel.add(lblNewLabel_5);
		
		JScrollPane OrderHProductScrollPane = new JScrollPane();
		OrderHProductScrollPane.setBounds(0, 134, 346, 253);
		panel.add(OrderHProductScrollPane);
		
		OrderProductListPanel = new JPanel();
		OrderProductListPanel.setPreferredSize(new Dimension(325, 500));
		OrderHProductScrollPane.setViewportView(OrderProductListPanel);
		/****************판넬 생성자**************************/
		JPanel OrderProductPanel = new JPanel();
		OrderProductPanel.setPreferredSize(new Dimension(300, 85));
		OrderProductListPanel.add(OrderProductPanel);
		OrderProductPanel.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("상품이름");
		lblNewLabel_3_1.setBounds(29, 12, 48, 15);
		OrderProductPanel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("수량");
		lblNewLabel_4_1.setBounds(111, 12, 40, 15);
		OrderProductPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("상품가격");
		lblNewLabel_4_1_1.setBounds(185, 12, 56, 15);
		OrderProductPanel.add(lblNewLabel_4_1_1);
		
		JLabel OrderProductNameLabel = new JLabel("");
		OrderProductNameLabel.setBounds(12, 37, 68, 31);
		OrderProductPanel.add(OrderProductNameLabel);
		
		JLabel OrderProductQuantLabel = new JLabel("");
		OrderProductQuantLabel.setBounds(106, 37, 40, 31);
		OrderProductPanel.add(OrderProductQuantLabel);
		
		JLabel OrderProductPriceLabel = new JLabel("");
		OrderProductPriceLabel.setBounds(185, 37, 40, 31);
		OrderProductPanel.add(OrderProductPriceLabel);
		
		JLabel lblNewLabel_6 = new JLabel("총금액 : ");
		lblNewLabel_6.setBounds(77, 397, 57, 15);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("연락처 :");
		lblNewLabel_7.setBounds(77, 427, 57, 15);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("배송지 :");
		lblNewLabel_8.setBounds(77, 454, 57, 15);
		panel.add(lblNewLabel_8);
		
		ToOrderHistoryBtn = new JButton("뒤로가기");
		ToOrderHistoryBtn.setBounds(123, 524, 97, 23);
		panel.add(ToOrderHistoryBtn);

		/**************************************/
		orderService=new OrderService();
		loginUser = new User("bbbb", null, "csd", "서울", "010-xxxx-xxxx");
		
		orderProductPrint(loginUser.getM_id());
	}
	
	private void orderProductPrint(String sUserId) throws Exception {
		//List<Order> orderList =  orderService.list(sUserId);
		Order order = orderService.list(sUserId).get(0);

		List<OrderItem> orderItems= orderService.detail(sUserId, order.getO_no()).getOrderItemList();
		int o_tot_price=0;
		int p_tot_qty=0;
		
		for (OrderItem orderItem : orderItems) {
			p_tot_qty+= orderItem.getOi_qty();
			o_tot_price+= orderItem.getProduct().getP_price()*orderItem.getOi_qty();
			
			JPanel OrderProductPanel = new JPanel();
			OrderProductPanel.setPreferredSize(new Dimension(300, 85));
			OrderProductListPanel.add(OrderProductPanel);
			OrderProductPanel.setLayout(null);
			
			JLabel lblNewLabel_3_1 = new JLabel("상품이름");
			lblNewLabel_3_1.setBounds(29, 12, 48, 15);
			OrderProductPanel.add(lblNewLabel_3_1);
			
			JLabel lblNewLabel_4_1 = new JLabel("수량");
			lblNewLabel_4_1.setBounds(111, 12, 40, 15);
			OrderProductPanel.add(lblNewLabel_4_1);
			
			JLabel lblNewLabel_4_1_1 = new JLabel("상품가격");
			lblNewLabel_4_1_1.setBounds(185, 12, 56, 15);
			OrderProductPanel.add(lblNewLabel_4_1_1);
			
			JLabel OrderProductNameLabel = new JLabel("<html>"+orderItem.getProduct().getP_name()+"</html>");
			OrderProductNameLabel.setBounds(12, 37, 68, 31);
			OrderProductPanel.add(OrderProductNameLabel);
			
			JLabel OrderProductQuantLabel = new JLabel("<html>"+orderItem.getOi_qty()+"</html>");
			OrderProductQuantLabel.setBounds(106, 37, 40, 31);
			OrderProductPanel.add(OrderProductQuantLabel);
			
			JLabel OrderProductPriceLabel = new JLabel("<html>"+orderItem.getProduct().getP_price()+"</html>");
			OrderProductPriceLabel.setBounds(185, 37, 40, 31);
			OrderProductPanel.add(OrderProductPriceLabel);
			
			JLabel lblNewLabel_6 = new JLabel("총금액 : ");
			lblNewLabel_6.setBounds(77, 397, 57, 15);
			panel.add(lblNewLabel_6);
			
			JLabel lblNewLabel_7 = new JLabel("연락처");
			lblNewLabel_7.setBounds(77, 427, 57, 15);
			panel.add(lblNewLabel_7);
			
			JLabel lblNewLabel_8 = new JLabel("배송지");
			lblNewLabel_8.setBounds(77, 454, 57, 15);
			panel.add(lblNewLabel_8);
			
		}
		OrderNumberLabel = new JLabel(order.getO_no()+"");
		OrderNumberLabel.setBounds(164, 23, 80, 20);
		panel.add(OrderNumberLabel);
		
		OrderDateLabel = new JLabel(order.getO_date()+"");
		OrderDateLabel.setBounds(163, 56, 135, 15);
		panel.add(OrderDateLabel);
		
		OrderUserPhoneLabel = new JLabel("<html>"+loginUser.getM_phone()+"</html>");
		OrderUserPhoneLabel.setBounds(146, 427, 134, 15);
		panel.add(OrderUserPhoneLabel);
		
		OrderTotalPriceLabel = new JLabel("<html>"+o_tot_price+"</html>");
		OrderTotalPriceLabel.setBounds(146, 397, 111, 15);
		panel.add(OrderTotalPriceLabel);
		
		OrderUserLocLabel = new JLabel("<html>"+loginUser.getM_loc()+"</html>");
		OrderUserLocLabel.setBounds(146, 454, 152, 15);
		panel.add(OrderUserLocLabel);
	}
}
