package com.team1.jogiyo.ui.정유나;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JInternalFrame;
import java.awt.Dimension;
import java.awt.Cursor;

public class CartListPanel_정유나 extends JPanel {

	/**
	 * Create the panel.
	 */
	public CartListPanel_정유나() {
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 36, 326, 375);
		add(scrollPane);
		
		JPanel cartListPanel = new JPanel();
		cartListPanel.setPreferredSize(new Dimension(10, 1000));
		scrollPane.setViewportView(cartListPanel);
		
		JPanel cartPanel = new JPanel();
		cartPanel.setPreferredSize(new Dimension(300, 80));
		cartListPanel.add(cartPanel);
		cartPanel.setLayout(null);
		
		JLabel productImageLB = new JLabel("");
		productImageLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		productImageLB.setVerticalTextPosition(SwingConstants.BOTTOM);
		productImageLB.setHorizontalTextPosition(SwingConstants.CENTER);
		productImageLB.setHorizontalAlignment(SwingConstants.CENTER);
		productImageLB.setIcon(new ImageIcon(CartListPanel_정유나.class.getResource("/images/cart2 (1).png")));
		productImageLB.setBounds(8, 10, 57, 60);
		cartPanel.add(productImageLB);
		
		JLabel productDetailLB = new JLabel("고기많이 김치찜");
		productDetailLB.setBounds(77, 31, 211, 15);
		cartPanel.add(productDetailLB);
		
		JLabel productNameLB = new JLabel("김치찜");
		productNameLB.setHorizontalAlignment(SwingConstants.CENTER);
		productNameLB.setBounds(137, 9, 57, 15);
		cartPanel.add(productNameLB);
		
		JLabel productCount = new JLabel("수량");
		productCount.setPreferredSize(new Dimension(22, 15));
		productCount.setHorizontalAlignment(SwingConstants.CENTER);
		productCount.setBounds(155, 56, 32, 15);
		cartPanel.add(productCount);
		
		JComboBox productCountCB = new JComboBox();
		productCountCB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		productCountCB.setBounds(195, 55, 25, 15);
		cartPanel.add(productCountCB);
		
		JLabel productTotalPriceLB = new JLabel("");
		productTotalPriceLB.setBounds(231, 55, 57, 15);
		cartPanel.add(productTotalPriceLB);
		
		JLabel productPrice = new JLabel("가격");
		productPrice.setHorizontalAlignment(SwingConstants.CENTER);
		productPrice.setBounds(77, 55, 25, 15);
		cartPanel.add(productPrice);
		
		JLabel productPriceLB = new JLabel("");
		productPriceLB.setBounds(106, 55, 51, 15);
		cartPanel.add(productPriceLB);
		
		JButton orderAllBtn = new JButton("전체주문");
		orderAllBtn.setBounds(75, 446, 97, 23);
		add(orderAllBtn);
		
		JButton orderSelectionBtn = new JButton("선택주문");
		orderSelectionBtn.setBounds(201, 446, 97, 23);
		add(orderSelectionBtn);
		
		JLabel lblNewLabel_2 = new JLabel("총 금액 : ");
		lblNewLabel_2.setBounds(75, 421, 57, 15);
		add(lblNewLabel_2);
		
		JLabel totalOrderPriceLB = new JLabel("");
		totalOrderPriceLB.setBounds(167, 421, 135, 15);
		add(totalOrderPriceLB);

	}
}
