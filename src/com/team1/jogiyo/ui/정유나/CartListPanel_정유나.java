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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;

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
		productImageLB.setBounds(6, 10, 57, 60);
		cartPanel.add(productImageLB);
		
		JLabel productDetailLB = new JLabel("고기많이 김치찜");
		productDetailLB.setBounds(65, 31, 211, 15);
		cartPanel.add(productDetailLB);
		
		JLabel productNameLB = new JLabel("김치찜");
		productNameLB.setHorizontalAlignment(SwingConstants.CENTER);
		productNameLB.setBounds(125, 9, 57, 15);
		cartPanel.add(productNameLB);
		
		JLabel productCount = new JLabel("수량");
		productCount.setPreferredSize(new Dimension(22, 15));
		productCount.setHorizontalAlignment(SwingConstants.CENTER);
		productCount.setBounds(127, 56, 32, 15);
		cartPanel.add(productCount);
		
		JComboBox productCountCB = new JComboBox();
		productCountCB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		productCountCB.setBounds(167, 55, 25, 15);
		cartPanel.add(productCountCB);
		
		JLabel productTotalPriceLB = new JLabel("총 금액");
		productTotalPriceLB.setBounds(202, 56, 40, 15);
		cartPanel.add(productTotalPriceLB);
		
		JLabel productPrice = new JLabel("가격");
		productPrice.setHorizontalAlignment(SwingConstants.CENTER);
		productPrice.setBounds(65, 55, 25, 15);
		cartPanel.add(productPrice);
		
		JLabel productPriceLB = new JLabel("");
		productPriceLB.setBounds(94, 55, 32, 15);
		cartPanel.add(productPriceLB);
		
		JLabel totalProductPriceLB = new JLabel("");
		totalProductPriceLB.setBounds(248, 56, 49, 15);
		cartPanel.add(totalProductPriceLB);
		
		JCheckBox cartOrderCheck = new JCheckBox("");
		cartOrderCheck.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cartOrderCheck.setBounds(274, 4, 21, 23);
		cartPanel.add(cartOrderCheck);
		
		JButton orderAllBtn = new JButton("전체주문");
		orderAllBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		orderAllBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		orderAllBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		orderAllBtn.setBounds(75, 446, 97, 23);
		add(orderAllBtn);
		
		JButton orderSelectionBtn = new JButton("선택주문");
		orderSelectionBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		orderSelectionBtn.setBounds(201, 446, 97, 23);
		add(orderSelectionBtn);
		
		JLabel lblNewLabel_2 = new JLabel("주문금액 :");
		lblNewLabel_2.setBounds(75, 421, 63, 15);
		add(lblNewLabel_2);
		
		JLabel totalOrderPriceLB = new JLabel("");
		totalOrderPriceLB.setBounds(167, 421, 135, 15);
		add(totalOrderPriceLB);

	}
}
