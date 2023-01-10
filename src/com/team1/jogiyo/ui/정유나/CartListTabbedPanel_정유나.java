package com.team1.jogiyo.ui.정유나;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.team1.jogiyo.cart.Cart;
import com.team1.jogiyo.cart.CartService;
import com.team1.jogiyo.order.OrderService;
import com.team1.jogiyo.product.Product;
import com.team1.jogiyo.product.ProductService;
import com.team1.jogiyo.ui.JogiyoMainFrame;
import com.team1.jogiyo.ui.조성동.OrderHistoryTabbedPanel_조성동;
import com.team1.jogiyo.user.User;
import com.team1.jogiyo.user.UserService;

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
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;

public class CartListTabbedPanel_정유나 extends JPanel {
	JogiyoMainFrame frame;
	private User loginUser=null;
	public void setFrame(JogiyoMainFrame frame) {
		this.frame = frame;
	}
	public void setUser(User loginUser) {
		this.loginUser=loginUser;
	}
	private JPanel cartListPanel;
	private JPanel cartPanel;
	private JLabel productImageLB;
	private JLabel productDetailLB;
	private JLabel productNameLB;
	private JComboBox productCountCB;
	private JLabel productPriceLB;
	private JLabel totalProductPriceLB;
	private JCheckBox cartOrderCheck;
	private JButton orderAllBtn;
	private JButton orderSelectionBtn;
	private JLabel totalOrderPriceLB;
	

	/**
	 * Create the panel.
	 */
	public CartListTabbedPanel_정유나() throws Exception {
		setLayout(null);
		
		JScrollPane cartScrollPane = new JScrollPane();
		cartScrollPane.setBounds(12, 36, 326, 372);
		add(cartScrollPane);
		
		cartListPanel = new JPanel();
		cartListPanel.setPreferredSize(new Dimension(10, 1000));
		cartScrollPane.setViewportView(cartListPanel);
		/*		CartListItem Start		*/
		cartPanel = new JPanel();
		cartPanel.setPreferredSize(new Dimension(300, 80));
		cartListPanel.add(cartPanel);
		cartPanel.setLayout(null);
		
		productImageLB = new JLabel("");
		productImageLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//제품상세페이지로 넘어가기
			}
		});
		productImageLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		productImageLB.setVerticalTextPosition(SwingConstants.BOTTOM);
		productImageLB.setHorizontalTextPosition(SwingConstants.CENTER);
		productImageLB.setHorizontalAlignment(SwingConstants.CENTER);
		productImageLB.setIcon(new ImageIcon(CartListTabbedPanel_정유나.class.getResource("/images/cart2 (1).png")));
		productImageLB.setBounds(6, 10, 57, 60);
		cartPanel.add(productImageLB);
		
		productDetailLB = new JLabel("고기많이 김치찜");
		productDetailLB.setBounds(65, 31, 211, 15);
		cartPanel.add(productDetailLB);
		
		productNameLB = new JLabel("김치찜");
		productNameLB.setHorizontalAlignment(SwingConstants.CENTER);
		productNameLB.setBounds(125, 9, 57, 15);
		cartPanel.add(productNameLB);
		
		JLabel productCount = new JLabel("수량");
		productCount.setPreferredSize(new Dimension(22, 15));
		productCount.setHorizontalAlignment(SwingConstants.CENTER);
		productCount.setBounds(127, 56, 32, 15);
		cartPanel.add(productCount);
		
		productCountCB = new JComboBox();
		productCountCB.setEditable(true);
		productCountCB.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
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
		
		productPriceLB = new JLabel("");
		productPriceLB.setBounds(94, 55, 32, 15);
		cartPanel.add(productPriceLB);
		
		totalProductPriceLB = new JLabel("");
		totalProductPriceLB.setBounds(248, 56, 49, 15);
		cartPanel.add(totalProductPriceLB);
		
		cartOrderCheck = new JCheckBox("");
		cartOrderCheck.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cartOrderCheck.setBounds(276, 47, 21, 23);
		cartPanel.add(cartOrderCheck);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(200, 11, 97, 23);
		cartPanel.add(btnNewButton);
		/* 		CartListItem End	*/
		
		orderAllBtn = new JButton("전체주문");
		orderAllBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				//주문상세 페이지로 넘기기
				
			}
		});
		orderAllBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		orderAllBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		orderAllBtn.setBounds(75, 470, 97, 23);
		add(orderAllBtn);
		
		orderSelectionBtn = new JButton("선택주문");
		orderSelectionBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		orderSelectionBtn.setBounds(201, 470, 97, 23);
		add(orderSelectionBtn);
		
		JLabel lblNewLabel_2 = new JLabel("주문금액 :");
		lblNewLabel_2.setBounds(75, 445, 63, 15);
		add(lblNewLabel_2);
		
		totalOrderPriceLB = new JLabel("");
		totalOrderPriceLB.setBounds(163, 445, 135, 15);
		add(totalOrderPriceLB);
		
		
		
		/*****************생성자 작성************************/
		cartService = new CartService();
		productService=new ProductService();
		loginUser=new User("bbbb",null,null,null,null);
		cartListDisplay(loginUser.getM_id());
	}
	/****************생성자 끝**************/
	//====> 오류오류!!!!!!!!!!!!!!
	public void cartListDisplay(String sUserId) throws Exception{
		cartListPanel.removeAll();
		List<Cart> cartList=cartService.cartListByUserId(sUserId);
		for (Cart cart : cartList) {
			Product product=productService.findByPrimaryKey(cart.getProduct().getP_no());
			
			cartPanel = new JPanel();
			cartPanel.setPreferredSize(new Dimension(300, 80));
			cartListPanel.add(cartPanel);
			cartPanel.setLayout(null);

			productImageLB = new JLabel("");
			productImageLB.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					//제품상세페이지로 넘어가기
				}
			});
			productImageLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			productImageLB.setVerticalTextPosition(SwingConstants.BOTTOM);
			productImageLB.setHorizontalTextPosition(SwingConstants.CENTER);
			productImageLB.setHorizontalAlignment(SwingConstants.CENTER);
			/*
			productImageLB.setIcon(new ImageIcon(CartListTabbedPanel_정유나.class.getResource("/images/"+product.getP_image())));
			*/
			productImageLB.setBounds(6, 10, 57, 60);
			cartPanel.add(productImageLB);

			productDetailLB = new JLabel(product.getP_desc());
			productDetailLB.setBounds(65, 31, 211, 15);
			cartPanel.add(productDetailLB);

			productNameLB = new JLabel(product.getP_name());
			productNameLB.setHorizontalAlignment(SwingConstants.CENTER);
			productNameLB.setBounds(125, 9, 57, 15);
			cartPanel.add(productNameLB);

			JLabel productCount = new JLabel("수량");
			productCount.setPreferredSize(new Dimension(22, 15));
			productCount.setHorizontalAlignment(SwingConstants.CENTER);
			productCount.setBounds(127, 56, 32, 15);
			cartPanel.add(productCount);

			productCountCB = new JComboBox();
			productCountCB.setEditable(true);
			productCountCB.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
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

			productPriceLB = new JLabel(""+product.getP_price());
			productPriceLB.setBounds(94, 55, 32, 15);
			cartPanel.add(productPriceLB);

			totalProductPriceLB = new JLabel(""+(product.getP_price()*cart.getC_qty()));
			totalProductPriceLB.setBounds(248, 56, 49, 15);
			cartPanel.add(totalProductPriceLB);

			cartOrderCheck = new JCheckBox("");
			cartOrderCheck.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			cartOrderCheck.setBounds(274, 4, 21, 23);
			cartPanel.add(cartOrderCheck);
			
			cartListPanel.add(cartPanel);
		}
	}
	public void orderAllInCart(String sUserId) throws Exception{
		try {
			orderService.create(sUserId);
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
	}
	
}
