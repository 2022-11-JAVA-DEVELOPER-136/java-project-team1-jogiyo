package com.team1.jogiyo.ui.조성동;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import com.team1.jogiyo.order.Order;
import com.team1.jogiyo.order.OrderItem;
import com.team1.jogiyo.order.OrderService;
import com.team1.jogiyo.ui.JogiyoMainFrame;
import com.team1.jogiyo.user.User;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class OrderHistoryTabbedPanel_조성동 extends JPanel {
	JogiyoMainFrame frame;
	User loginUser=null;
	public void setFrame(JogiyoMainFrame frame) {
		this.frame = frame;
	}
	public void setUser(User loginUser) throws Exception {
		this.loginUser=loginUser;
		OrderListPrint(loginUser.getM_id());
	}

	private JPanel OrderHistoryListPanel;
	JScrollPane OrderHistoryScrollPane;
	
	/**
	 * Create the panel.
	 */
	public OrderHistoryTabbedPanel_조성동() throws Exception{
		setBackground(new Color(0, 64, 64));
		setLayout(null);
		
		OrderHistoryScrollPane = new JScrollPane();
		OrderHistoryScrollPane.setBounds(0, 0, 370, 530);
		add(OrderHistoryScrollPane);
		
		OrderHistoryListPanel = new JPanel();
		OrderHistoryListPanel.setBackground(new Color(255, 255, 255));
		OrderHistoryListPanel.setPreferredSize(new Dimension(300, 700));
		OrderHistoryScrollPane.setViewportView(OrderHistoryListPanel);
		OrderHistoryListPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		/******패널 생성자*******/
//		JPanel OrderHistoryPanel = new JPanel();
//		OrderHistoryPanel.setPreferredSize(new Dimension(325, 65));
//		OrderHistoryPanel.setLayout(null);
//		OrderHistoryListPanel.add(OrderHistoryPanel);
//		
//		JLabel DisplayProductNameLabel = new JLabel("");
//		DisplayProductNameLabel.setBounds(96, 30, 75, 33);
//		OrderHistoryPanel.add(DisplayProductNameLabel);
//		
//		JButton OrderHistoryDetailBtn = new JButton("");
//		OrderHistoryDetailBtn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("주문상세 페이지 전환");
//			}
//		});
//		OrderHistoryDetailBtn.setBounds(255, 30, 25, 23);
//		OrderHistoryPanel.add(OrderHistoryDetailBtn);
//		
//		JLabel DisplayTotalPriceLabel = new JLabel("");
//		DisplayTotalPriceLabel.setBounds(175, 32, 68, 29);
//		OrderHistoryPanel.add(DisplayTotalPriceLabel);
//		
//		JLabel lblNewLabel_2 = new JLabel("주문날짜");
//		lblNewLabel_2.setBounds(12, 10, 57, 15);
//		OrderHistoryPanel.add(lblNewLabel_2);
//		
//		JLabel lblNewLabel_3 = new JLabel("상품이름");
//		lblNewLabel_3.setBounds(99, 10, 57, 15);
//		OrderHistoryPanel.add(lblNewLabel_3);
//		
//		JLabel lblNewLabel_4 = new JLabel("총가격");
//		lblNewLabel_4.setBounds(182, 10, 44, 15);
//		OrderHistoryPanel.add(lblNewLabel_4);
//		
//		JLabel lblNewLabel_5 = new JLabel("주문상세");
//		lblNewLabel_5.setBounds(245, 10, 57, 15);
//		OrderHistoryPanel.add(lblNewLabel_5);
//		
//		JLabel DisplayDateLabel = new JLabel("");
//		DisplayDateLabel.setBounds(0, 39, 81, 24);
//		OrderHistoryPanel.add(DisplayDateLabel);
		
		
		/*******************************************/

	}
	
	public  void OrderListPrint(String sUserId) throws Exception {
		OrderHistoryListPanel = new JPanel();
		OrderHistoryListPanel.setBackground(new Color(255, 255, 255));
		OrderHistoryListPanel.setPreferredSize(new Dimension(300, 700));
		OrderHistoryScrollPane.setViewportView(OrderHistoryListPanel);
		OrderHistoryListPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));		//이거요
		
		OrderHistoryListPanel.removeAll();
		
		List<Order> orderList =  frame.orderService.list(sUserId);
		
		for (Order order : orderList) {
			List<OrderItem> orderItems= frame.orderService.detail(sUserId, order.getO_no()).getOrderItemList();
			int o_tot_price=0;
			int p_tot_qty=0;
			for (OrderItem orderItem : orderItems) {
				p_tot_qty+= orderItem.getOi_qty();
				o_tot_price+= orderItem.getProduct().getP_price()*orderItem.getOi_qty();
			}
			JPanel OrderHistoryPanel = new JPanel();
			OrderHistoryPanel.setPreferredSize(new Dimension(300, 65));
			OrderHistoryPanel.setLayout(null);
			OrderHistoryListPanel.add(OrderHistoryPanel);
			
			JLabel DisplayProductNameLabel = new JLabel("<html>"+orderItems.get(0).getProduct().getP_name()+"<br>외"+p_tot_qty+"종</html>");
			DisplayProductNameLabel.setBounds(99, 30, 66, 33);
			OrderHistoryPanel.add(DisplayProductNameLabel);
			
			JButton OrderHistoryDetailBtn = new JButton("");
			OrderHistoryDetailBtn.setBounds(247, 30, 25, 23);
			OrderHistoryDetailBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						frame.changePanel(5, order);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			});
			OrderHistoryPanel.add(OrderHistoryDetailBtn);
			
			JLabel DisplayTotalPriceLabel = new JLabel("<html>"+o_tot_price+"</html>");
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
			
			JLabel DisplayDateLabel = new JLabel("<html>"+order.getO_date()+"</html>");
			DisplayDateLabel.setBounds(0, 39, 81, 24);
			OrderHistoryPanel.add(DisplayDateLabel);
			
		}
	}
}
