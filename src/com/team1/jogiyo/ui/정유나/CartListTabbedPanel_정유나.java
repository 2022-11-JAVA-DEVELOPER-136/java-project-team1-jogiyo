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
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class CartListTabbedPanel_정유나 extends JPanel {
	JogiyoMainFrame frame;
	public void setFrame(JogiyoMainFrame frame) {
		this.frame = frame;
	}
	User loginUser=null;
	public void setUser(User loginUser) throws Exception {
		this.loginUser=loginUser;
		cartListDisplay(loginUser.getM_id());
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
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JScrollPane cartScrollPane = new JScrollPane();
		cartScrollPane.setBounds(12, 36, 358, 372);
		add(cartScrollPane);
		
		cartListPanel = new JPanel();
		cartListPanel.setBackground(new Color(255, 255, 255));
		cartListPanel.setPreferredSize(new Dimension(10, 1000));
		cartScrollPane.setViewportView(cartListPanel);
		
		
		/*		CartListItem Start		*/
		
		cartPanel = new JPanel();
		cartPanel.setBackground(new Color(255, 255, 255));
		cartPanel.setPreferredSize(new Dimension(300, 80));
		cartPanel.setPreferredSize(new Dimension(300, 120));
		cartListPanel.add(cartPanel);
		cartPanel.setLayout(null);
		productImageLB = new JLabel("");
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
		productNameLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		productNameLB.setHorizontalAlignment(SwingConstants.CENTER);
		productNameLB.setBounds(125, 9, 57, 15);
		cartPanel.add(productNameLB);
		JLabel productCount = new JLabel("수량");
		productCount.setFont(new Font("굴림", Font.PLAIN, 10));
		productCount.setPreferredSize(new Dimension(22, 15));
		productCount.setHorizontalAlignment(SwingConstants.CENTER);
		productCount.setBounds(65, 78, 32, 15);
		cartPanel.add(productCount);
		productCountCB = new JComboBox();
		
		
		productCountCB.setEditable(true);
		productCountCB.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		productCountCB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		productCountCB.setBounds(129, 78, 62, 15);
		cartPanel.add(productCountCB);
		JLabel productTotalPriceLB = new JLabel("총 금액");
		productTotalPriceLB.setFont(new Font("굴림", Font.PLAIN, 10));
		productTotalPriceLB.setBounds(202, 56, 40, 15);
		productTotalPriceLB.setBounds(65, 102, 40, 15);
		productTotalPriceLB.setBounds(65, 102, 40, 15);
		cartPanel.add(productTotalPriceLB);
		JLabel productPrice = new JLabel("가격");
		productPrice.setFont(new Font("굴림", Font.PLAIN, 10));
		productPrice.setHorizontalAlignment(SwingConstants.CENTER);
		productPrice.setBounds(65, 55, 32, 15);
		cartPanel.add(productPrice);
		productPriceLB = new JLabel("");
		productPriceLB.setBounds(127, 55, 104, 15);
		cartPanel.add(productPriceLB);
		totalProductPriceLB = new JLabel("");
		totalProductPriceLB.setBounds(139, 101, 52, 15);
		cartPanel.add(totalProductPriceLB);
		
		
		JCheckBox cartOrderCheck = new JCheckBox("");
		cartOrderCheck.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cartOrderCheck.setBounds(276, 47, 21, 23);
		cartPanel.add(cartOrderCheck);
		
		JButton deleteItemBtn = new JButton("X");
		deleteItemBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		deleteItemBtn.setBounds(248, 8, 46, 20);
		cartPanel.add(deleteItemBtn);
		
		/* 		CartListItem End	*/
		
		orderAllBtn = new JButton("전체주문");
		orderAllBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//주문상세 페이지로 넘기기
				try {
					orderAllInCart(loginUser.getM_id());
					frame.changePanel(4, null);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
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
		
	}
		
		
	/****************생성자 끝**************/
	public void cartListDisplay(String sUserId) throws Exception{
		cartListPanel.removeAll();
		System.out.println(sUserId);
		List<Cart> cartList=frame.cartService.cartListByUserId(sUserId);
		for (Cart cart : cartList) {
			Product product=frame.productService.findByPrimaryKey(cart.getProduct().getP_no());
			
			cartPanel = new JPanel();
			cartPanel.setBackground(new Color(255, 255, 255));
			cartPanel.setPreferredSize(new Dimension(300, 80));
			cartPanel.setPreferredSize(new Dimension(300, 120));
			cartListPanel.add(cartPanel);
			cartPanel.setLayout(null);
			
			productImageLB = new JLabel("");
			productImageLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			productImageLB.setVerticalTextPosition(SwingConstants.BOTTOM);
			productImageLB.setHorizontalTextPosition(SwingConstants.CENTER);
			productImageLB.setHorizontalAlignment(SwingConstants.CENTER);
			productImageLB.setIcon(new ImageIcon(CartListTabbedPanel_정유나.class.getResource("/images/cart/50"+product.getP_image())));
			productImageLB.setBounds(6, 10, 57, 60);
			cartPanel.add(productImageLB);
			
			productDetailLB = new JLabel(product.getP_desc());
			productDetailLB.setBounds(70, 31, 211, 15);
			cartPanel.add(productDetailLB);

			productNameLB = new JLabel("["+product.getP_name()+"]");
			productNameLB.setFont(new Font("굴림", Font.BOLD, 15));
			productNameLB.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						frame.changePanel(25, frame.productService.findByName(product.getP_name()));
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			});
			productNameLB.setHorizontalAlignment(SwingConstants.CENTER);
			productNameLB.setBounds(125, 9, 80, 15);
			cartPanel.add(productNameLB);
			
			JLabel productCount = new JLabel("수량");
			productCount.setFont(new Font("굴림", Font.PLAIN, 10));
			productCount.setPreferredSize(new Dimension(22, 15));
			productCount.setHorizontalAlignment(SwingConstants.CENTER);
			productCount.setBounds(63, 78, 32, 15);
			cartPanel.add(productCount);

			productCountCB = new JComboBox();
			
			productCountCB.setEditable(false);
			productCountCB.insertItemAt((Object)updateProductQtyInCart(cart.getC_no()), 0);
			productCountCB.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
			//카트에 있는 기본 값으로 콤보박스 설정 하기
			
			
			productCountCB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			productCountCB.setBounds(129, 78, 62, 15);
			cartPanel.add(productCountCB);
			
			JLabel productTotalPriceLB = new JLabel("총 금액");
			productTotalPriceLB.setFont(new Font("굴림", Font.PLAIN, 10));
			productTotalPriceLB.setBounds(202, 56, 40, 15);
			cartPanel.add(productTotalPriceLB);

			JLabel productPrice = new JLabel("가격");
			productPrice.setFont(new Font("굴림", Font.PLAIN, 10));
			productPrice.setHorizontalAlignment(SwingConstants.CENTER);
			productPrice.setBounds(68, 55, 25, 15);
			cartPanel.add(productPrice);

			productPriceLB = new JLabel(""+product.getP_price());
			productPriceLB.setBounds(127, 55, 104, 15);
			cartPanel.add(productPriceLB);
			
			JCheckBox cartOrderCheck = new JCheckBox("");
			cartOrderCheck.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			cartOrderCheck.setBounds(276, 47, 21, 23);
			cartPanel.add(cartOrderCheck);
			
			JButton deleteItemBtn = new JButton("X");
			deleteItemBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			deleteItemBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						deleteCartItem(cart.getC_no());
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			});
			deleteItemBtn.setBounds(248, 8, 46, 20);
			cartPanel.add(deleteItemBtn);

			totalProductPriceLB = new JLabel(""+(cart.getC_qty()*product.getP_price()));
			totalProductPriceLB.setBounds(212, 75, 52, 15);
			cartPanel.add(totalProductPriceLB);
			
			cartListPanel.add(cartPanel);
			}
		}
		
		
	public void orderAllInCart(String sUserId) throws Exception{
		try {
			frame.orderService.create(sUserId);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	public void deleteCartItem(int c_no) throws Exception {
		frame.cartService.deleteCartItem(c_no);
	}
	public int updateProductQtyInCart(int c_no) throws Exception{
		int result =frame.cartService.cartListByCartNo(c_no).getC_qty();
		return result;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
	public JLabel calculationTotalPriceByproduct() throws Exception{
		if(productCountCB.getSelectedIndex()!=0) {
			int price=frame.productService.findByName(productNameLB.getText()).getP_price();
			totalProductPriceLB.setText(""+(price*(int)(productCountCB.getSelectedItem())));
		} else {
			totalProductPriceLB = new JLabel("");
		}
		return totalProductPriceLB;
	}
*/	
}
