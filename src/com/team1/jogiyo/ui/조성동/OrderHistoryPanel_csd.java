package com.team1.jogiyo.ui.조성동;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class OrderHistoryPanel_csd extends JPanel {
	private JButton OrderHistoryDetailBtn_0;

	/**
	 * Create the panel.
	 */
	public OrderHistoryPanel_csd() {
		setBackground(new Color(0, 64, 64));
		setLayout(null);
		
		JPanel OrderHistory = new JPanel();
		OrderHistory.setBounds(0, 0, 350, 590);
		add(OrderHistory);
		OrderHistory.setLayout(null);
		
		JPanel OrderHistoryPanel_1 = new JPanel();
		OrderHistoryPanel_1.setBounds(12, 83, 326, 68);
		OrderHistory.add(OrderHistoryPanel_1);
		OrderHistoryPanel_1.setLayout(null);
		
		JLabel DisplayProductNameLabel_0 = new JLabel("");
		DisplayProductNameLabel_0.setBounds(99, 30, 66, 33);
		OrderHistoryPanel_1.add(DisplayProductNameLabel_0);
		
		OrderHistoryDetailBtn_0 = new JButton("");
		OrderHistoryDetailBtn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		OrderHistoryDetailBtn_0.setBounds(277, 30, 25, 23);
		OrderHistoryPanel_1.add(OrderHistoryDetailBtn_0);
		
		JLabel DisplayTotalPriceLabel_0 = new JLabel("");
		DisplayTotalPriceLabel_0.setBounds(181, 32, 68, 29);
		OrderHistoryPanel_1.add(DisplayTotalPriceLabel_0);
		
		JLabel lblNewLabel_2 = new JLabel("주문날짜");
		lblNewLabel_2.setBounds(12, 10, 57, 15);
		OrderHistoryPanel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("상품이름");
		lblNewLabel_3.setBounds(99, 10, 57, 15);
		OrderHistoryPanel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("총가격");
		lblNewLabel_4.setBounds(180, 10, 57, 15);
		OrderHistoryPanel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("주문상세");
		lblNewLabel_5.setBounds(267, 10, 57, 15);
		OrderHistoryPanel_1.add(lblNewLabel_5);
		
		JLabel DisplayDateLabel = new JLabel("");
		DisplayDateLabel.setBounds(12, 39, 69, 15);
		OrderHistoryPanel_1.add(DisplayDateLabel);
		
		JPanel OrderHistoryPanel_2 = new JPanel();
		OrderHistoryPanel_2.setLayout(null);
		OrderHistoryPanel_2.setBounds(12, 161, 326, 68);
		OrderHistory.add(OrderHistoryPanel_2);
		
		JLabel DisplayProductNameLabel_1 = new JLabel("");
		DisplayProductNameLabel_1.setBounds(99, 30, 66, 33);
		OrderHistoryPanel_2.add(DisplayProductNameLabel_1);
		
		JButton OrderHistoryDetailBtn_1 = new JButton("");
		OrderHistoryDetailBtn_1.setBounds(277, 30, 25, 23);
		OrderHistoryPanel_2.add(OrderHistoryDetailBtn_1);
		
		JLabel DisplayTotalPriceLabel_1 = new JLabel("");
		DisplayTotalPriceLabel_1.setBounds(181, 32, 68, 29);
		OrderHistoryPanel_2.add(DisplayTotalPriceLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("주문날짜");
		lblNewLabel_2_1.setBounds(12, 10, 57, 15);
		OrderHistoryPanel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("상품이름");
		lblNewLabel_3_1.setBounds(99, 10, 57, 15);
		OrderHistoryPanel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("총가격");
		lblNewLabel_4_1.setBounds(180, 10, 57, 15);
		OrderHistoryPanel_2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("주문상세");
		lblNewLabel_5_1.setBounds(267, 10, 57, 15);
		OrderHistoryPanel_2.add(lblNewLabel_5_1);
		
		JLabel DisplayDateLabel_1 = new JLabel("");
		DisplayDateLabel_1.setBounds(12, 39, 69, 15);
		OrderHistoryPanel_2.add(DisplayDateLabel_1);
		
		JPanel OrderHistoryPanel_3 = new JPanel();
		OrderHistoryPanel_3.setLayout(null);
		OrderHistoryPanel_3.setBounds(12, 239, 326, 68);
		OrderHistory.add(OrderHistoryPanel_3);
		
		JLabel DisplayProductNameLabel_2 = new JLabel("");
		DisplayProductNameLabel_2.setBounds(99, 30, 66, 33);
		OrderHistoryPanel_3.add(DisplayProductNameLabel_2);
		
		JButton OrderHistoryDetailBtn_2 = new JButton("");
		OrderHistoryDetailBtn_2.setBounds(277, 30, 25, 23);
		OrderHistoryPanel_3.add(OrderHistoryDetailBtn_2);
		
		JLabel DisplayTotalPriceLabel_2 = new JLabel("");
		DisplayTotalPriceLabel_2.setBounds(181, 32, 68, 29);
		OrderHistoryPanel_3.add(DisplayTotalPriceLabel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("주문날짜");
		lblNewLabel_2_2.setBounds(12, 10, 57, 15);
		OrderHistoryPanel_3.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("상품이름");
		lblNewLabel_3_2.setBounds(99, 10, 57, 15);
		OrderHistoryPanel_3.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("총가격");
		lblNewLabel_4_2.setBounds(180, 10, 57, 15);
		OrderHistoryPanel_3.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("주문상세");
		lblNewLabel_5_2.setBounds(267, 10, 57, 15);
		OrderHistoryPanel_3.add(lblNewLabel_5_2);
		
		JLabel DisplayDateLabel_2 = new JLabel("");
		DisplayDateLabel_2.setBounds(12, 39, 69, 15);
		OrderHistoryPanel_3.add(DisplayDateLabel_2);
		
		JPanel OrderHistoryPanel_4 = new JPanel();
		OrderHistoryPanel_4.setLayout(null);
		OrderHistoryPanel_4.setBounds(12, 317, 326, 68);
		OrderHistory.add(OrderHistoryPanel_4);
		
		JLabel DisplayProductNameLabel_3 = new JLabel("");
		DisplayProductNameLabel_3.setBounds(99, 30, 66, 33);
		OrderHistoryPanel_4.add(DisplayProductNameLabel_3);
		
		JButton OrderHistoryDetailBtn_3 = new JButton("");
		OrderHistoryDetailBtn_3.setBounds(277, 30, 25, 23);
		OrderHistoryPanel_4.add(OrderHistoryDetailBtn_3);
		
		JLabel DisplayTotalPriceLabel_3 = new JLabel("");
		DisplayTotalPriceLabel_3.setBounds(181, 32, 68, 29);
		OrderHistoryPanel_4.add(DisplayTotalPriceLabel_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("주문날짜");
		lblNewLabel_2_1_1.setBounds(12, 10, 57, 15);
		OrderHistoryPanel_4.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("상품이름");
		lblNewLabel_3_1_1.setBounds(99, 10, 57, 15);
		OrderHistoryPanel_4.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("총가격");
		lblNewLabel_4_1_1.setBounds(180, 10, 57, 15);
		OrderHistoryPanel_4.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("주문상세");
		lblNewLabel_5_1_1.setBounds(267, 10, 57, 15);
		OrderHistoryPanel_4.add(lblNewLabel_5_1_1);
		
		JLabel DisplayDateLabel_3 = new JLabel("");
		DisplayDateLabel_3.setBounds(12, 39, 69, 15);
		OrderHistoryPanel_4.add(DisplayDateLabel_3);
		
		JPanel OrderHistoryPanel_5 = new JPanel();
		OrderHistoryPanel_5.setLayout(null);
		OrderHistoryPanel_5.setBounds(12, 395, 326, 68);
		OrderHistory.add(OrderHistoryPanel_5);
		
		JLabel DisplayProductNameLabel_4 = new JLabel("");
		DisplayProductNameLabel_4.setBounds(99, 30, 66, 33);
		OrderHistoryPanel_5.add(DisplayProductNameLabel_4);
		
		JButton OrderHistoryDetailBtn_4 = new JButton("");
		OrderHistoryDetailBtn_4.setBounds(277, 30, 25, 23);
		OrderHistoryPanel_5.add(OrderHistoryDetailBtn_4);
		
		JLabel DisplayTotalPriceLabel_4 = new JLabel("");
		DisplayTotalPriceLabel_4.setBounds(181, 32, 68, 29);
		OrderHistoryPanel_5.add(DisplayTotalPriceLabel_4);
		
		JLabel lblNewLabel_2_3 = new JLabel("주문날짜");
		lblNewLabel_2_3.setBounds(12, 10, 57, 15);
		OrderHistoryPanel_5.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("상품이름");
		lblNewLabel_3_3.setBounds(99, 10, 57, 15);
		OrderHistoryPanel_5.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4_3 = new JLabel("총가격");
		lblNewLabel_4_3.setBounds(180, 10, 57, 15);
		OrderHistoryPanel_5.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_5_3 = new JLabel("주문상세");
		lblNewLabel_5_3.setBounds(267, 10, 57, 15);
		OrderHistoryPanel_5.add(lblNewLabel_5_3);
		
		JLabel DisplayDateLabel_4 = new JLabel("");
		DisplayDateLabel_4.setBounds(12, 39, 69, 15);
		OrderHistoryPanel_5.add(DisplayDateLabel_4);
		

	}
}
