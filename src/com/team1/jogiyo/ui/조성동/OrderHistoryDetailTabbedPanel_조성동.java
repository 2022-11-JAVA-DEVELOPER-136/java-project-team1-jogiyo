package com.team1.jogiyo.ui.조성동;

import javax.swing.JPanel;

import com.team1.jogiyo.order.Order;
import com.team1.jogiyo.order.OrderItem;
import com.team1.jogiyo.order.OrderService;
import com.team1.jogiyo.product.Product;
import com.team1.jogiyo.ui.JogiyoMainFrame;
import com.team1.jogiyo.user.User;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.util.List;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OrderHistoryDetailTabbedPanel_조성동 extends JPanel {
	JogiyoMainFrame frame;
	User loginUser=null;
	public void setFrame(JogiyoMainFrame frame) {
		this.frame = frame;
	}
	public void setUser(User loginUser) {
		this.loginUser=loginUser;
	}
	public void setOrder(Order order) throws Exception {
		orderProductPrint(loginUser.getM_id(), order.getO_no());
	}
	
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
		panel.setBackground(new Color(255, 255, 255));
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
		OrderHProductScrollPane.setBounds(0, 134, 370, 253);
		panel.add(OrderHProductScrollPane);
		
		OrderProductListPanel = new JPanel();
		OrderProductListPanel.setBackground(new Color(255, 255, 255));
		OrderProductListPanel.setPreferredSize(new Dimension(325, 500));
		OrderHProductScrollPane.setViewportView(OrderProductListPanel);
		/****************판넬 생성자**************************/
//		JPanel OrderProductPanel = new JPanel();
//		OrderProductPanel.setPreferredSize(new Dimension(300, 85));
//		OrderProductListPanel.add(OrderProductPanel);
//		OrderProductPanel.setLayout(null);
//		
//		JLabel lblNewLabel_3_1 = new JLabel("상품이름");
//		lblNewLabel_3_1.setBounds(29, 12, 48, 15);
//		OrderProductPanel.add(lblNewLabel_3_1);
//		
//		JLabel lblNewLabel_4_1 = new JLabel("수량");
//		lblNewLabel_4_1.setBounds(111, 12, 40, 15);
//		OrderProductPanel.add(lblNewLabel_4_1);
//		
//		JLabel lblNewLabel_4_1_1 = new JLabel("상품가격");
//		lblNewLabel_4_1_1.setBounds(185, 12, 56, 15);
//		OrderProductPanel.add(lblNewLabel_4_1_1);
//		
//		JLabel OrderProductNameLabel = new JLabel("");
//		OrderProductNameLabel.setBounds(12, 37, 68, 31);
//		OrderProductPanel.add(OrderProductNameLabel);
//		
//		JLabel OrderProductQuantLabel = new JLabel("");
//		OrderProductQuantLabel.setBounds(106, 37, 40, 31);
//		OrderProductPanel.add(OrderProductQuantLabel);
//		
//		JLabel OrderProductPriceLabel = new JLabel("");
//		OrderProductPriceLabel.setBounds(185, 37, 40, 31);
//		OrderProductPanel.add(OrderProductPriceLabel);
//		
//		JLabel lblNewLabel_6 = new JLabel("총금액 : ");
//		lblNewLabel_6.setBounds(77, 397, 57, 15);
//		panel.add(lblNewLabel_6);
//		
//		JLabel lblNewLabel_7 = new JLabel("연락처 :");
//		lblNewLabel_7.setBounds(77, 427, 57, 15);
//		panel.add(lblNewLabel_7);
//		
//		JLabel lblNewLabel_8 = new JLabel("배송지 :");
//		lblNewLabel_8.setBounds(77, 454, 57, 15);
//		panel.add(lblNewLabel_8);
		
		ToOrderHistoryBtn = new JButton("뒤로가기");
		ToOrderHistoryBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frame.changePanel(4, null);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		ToOrderHistoryBtn.setBounds(121, 486, 97, 23);
		panel.add(ToOrderHistoryBtn);

		/**************************************/
		
	}
	
	public void orderProductPrint(String sUserId, int o_no) throws Exception {
		OrderProductListPanel.removeAll();
		//List<Order> orderList =  orderService.list(sUserId);
		Order order = frame.orderService.detail(sUserId, o_no);

		List<OrderItem> orderItems= frame.orderService.detail(sUserId, order.getO_no()).getOrderItemList();
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
