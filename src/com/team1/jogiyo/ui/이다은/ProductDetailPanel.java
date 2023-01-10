package com.team1.jogiyo.ui.이다은;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class ProductDetailPanel extends JPanel {
	private JComboBox productCountInProductCB;
	private JLabel productPriceLB;
	private JButton cartinProductBtn;
	private JButton orderinProductBtn;

	/**
	 * Create the panel.
	 */
	public ProductDetailPanel() {
		setBackground(new Color(192, 192, 192));
		setLayout(null);
		
		JLabel productImageLB = new JLabel("");
		productImageLB.setIcon(new ImageIcon("C:\\Users\\ITWILL\\Downloads\\p_image1.jpg"));
		productImageLB.setBounds(0, 0, 350, 200);
		add(productImageLB);
		
		JLabel productNameLB = new JLabel("순대국밥");
		productNameLB.setFont(new Font("굴림", Font.BOLD, 25));
		productNameLB.setBounds(119, 214, 111, 38);
		add(productNameLB);
		
		JLabel productDescLB = new JLabel("순대가 들어간 국밥");
		productDescLB.setHorizontalAlignment(SwingConstants.CENTER);
		productDescLB.setFont(new Font("굴림", Font.PLAIN, 15));
		productDescLB.setBounds(0, 271, 350, 25);
		add(productDescLB);
		
		//선택한 수량 만큼 장바구니에 담김
		productCountInProductCB = new JComboBox();
		productCountInProductCB.setToolTipText("");
		productCountInProductCB.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		productCountInProductCB.setBounds(277, 388, 32, 23);
		add(productCountInProductCB);
		
		productPriceLB = new JLabel("9000");
		productPriceLB.setFont(new Font("굴림", Font.PLAIN, 15));
		productPriceLB.setHorizontalAlignment(SwingConstants.RIGHT);
		productPriceLB.setBounds(228, 338, 81, 18);
		add(productPriceLB);
		
		JLabel priceLB = new JLabel("가격");
		priceLB.setBounds(172, 340, 57, 15);
		add(priceLB);
		
		JLabel countLB = new JLabel("수량");
		countLB.setBounds(172, 390, 57, 15);
		add(countLB);
		
		//클릭 시 주문 페이지로 이동
		orderinProductBtn = new JButton("바로주문");
		orderinProductBtn.setBounds(61, 460, 97, 23);
		add(orderinProductBtn);
		
		//클릭 시 장바구니로 이동
		cartinProductBtn = new JButton("장바구니");
		cartinProductBtn.setBounds(208, 460, 97, 23);
		add(cartinProductBtn);

	}
}
