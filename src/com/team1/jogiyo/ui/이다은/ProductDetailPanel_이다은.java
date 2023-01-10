package com.team1.jogiyo.ui.이다은;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

import com.team1.jogiyo.cart.Cart;
import com.team1.jogiyo.cart.CartService;
import com.team1.jogiyo.order.Order;
import com.team1.jogiyo.order.OrderItem;
import com.team1.jogiyo.order.OrderService;
import com.team1.jogiyo.product.Product;
import com.team1.jogiyo.product.ProductService;
import com.team1.jogiyo.ui.JogiyoMainFrame;
import com.team1.jogiyo.user.User;

import javafx.scene.control.ComboBox;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Cursor;

public class ProductDetailPanel_이다은 extends JPanel {
	JogiyoMainFrame frame;
	User loginUser = null;
	public void setFrame(JogiyoMainFrame frame) {
		this.frame = frame;
	}
	public void setUser(User loginUser) throws Exception {
		this.loginUser=loginUser;
	}
	public void setProduct(String p_name) throws Exception{
		displayProductDetail(p_name);
	}
	
	private JComboBox productcomboBox;
	private JButton orderBtn;
	private JButton cartBtn;
	private JLabel productImageLB;
	private JLabel productNameLB;
	private JLabel productDescLB;
	private JLabel productPriceLB;
	private JogiyoMainFrame jogiyoMainFrame;
	
	/**
	 * Create the panel.
	 */

	
	public ProductDetailPanel_이다은 () throws Exception {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JLabel productImageLB = new JLabel("");
		productImageLB.setIcon(new ImageIcon(ProductDetailPanel_이다은.class.getResource("/images/productDetail/p_no_01.jpg")));
		productImageLB.setBounds(0, 0, 350, 200);
		add(productImageLB);
		
		
		JLabel productNameLB = new JLabel("순대국밥");
		productNameLB.setHorizontalAlignment(SwingConstants.CENTER);
		productNameLB.setFont(new Font("굴림", Font.BOLD, 25));
		productNameLB.setBounds(0, 223, 350, 38);
		add(productNameLB);
		
		JLabel productDescLB = new JLabel("순대가 들어간 국밥");
		productDescLB.setBackground(new Color(255, 255, 255));
		productDescLB.setHorizontalAlignment(SwingConstants.CENTER);
		productDescLB.setFont(new Font("굴림", Font.PLAIN, 15));
		productDescLB.setBounds(0, 271, 350, 47);
		add(productDescLB);
		
		JLabel productPriceLB = new JLabel("9000");
		productPriceLB.setHorizontalAlignment(SwingConstants.RIGHT);
		productPriceLB.setFont(new Font("굴림", Font.BOLD, 15));
		productPriceLB.setBounds(208, 340, 101, 15);
		add(productPriceLB);
		
		
		//선택한 수량 만큼 바로주문 and 장바구니에 담김
		
		productcomboBox = new JComboBox();
		productcomboBox.setToolTipText("");
		productcomboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		productcomboBox.setBounds(268, 388, 41, 23);
		add(productcomboBox);
		
		
		JLabel priceLB = new JLabel("가격");
		priceLB.setBounds(172, 340, 57, 15);
		add(priceLB);
		
		JLabel countLB = new JLabel("수량");
		countLB.setBounds(172, 390, 57, 15);
		add(countLB);
		
		//클릭 시 주문 페이지로 이동
		orderBtn = new JButton("바로주문");
		orderBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		orderBtn.setBackground(new Color(255, 255, 255));
		orderBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 오더패널로전환
				try {
					productInOrder();
				} catch (Exception e1) {
					e1.printStackTrace();
				} 
			}
		});
		orderBtn.setBounds(61, 460, 97, 23);
		add(orderBtn);
		
		//클릭 시 장바구니로 이동
		cartBtn = new JButton("장바구니");
		cartBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cartBtn.setForeground(new Color(0, 0, 0));
		cartBtn.setBackground(new Color(255, 255, 255));
		cartBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 카트패널로전환
			}
		});
		cartBtn.setBounds(208, 460, 97, 23);
		add(cartBtn);
		
	
		/**************************/
		
		
	}
	
	/************************************************/
	
	// 제품정보 불러오기
	public void displayProductDetail(String p_name) {
		try {
		productImageLB.setIcon(new ImageIcon(ProductDetailPanel_이다은.class.getResource("/image/" + frame.productService.findByName(p_name).getP_image())));
			productNameLB.setText(frame.productService.findByName(p_name).getP_name()+"");
		productDescLB.setText(frame.productService.findByName(p_name).getP_desc()+"");
		productPriceLB.setText(frame.productService.findByName(p_name).getP_price()+"");	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * ===> 은지님 해당 버튼에 productDetailPanel_이다은.displayProductdetail(p_name) 넣어주세요
	 */
	
	private void productInOrder() throws Exception {
		
			//orderService.create(loginUser.getM_id(), product.getP_no(), (int)productcomboBox.getSelectedItem());
	    
	    // 콤보박스에서 받은 수량 > 오더로 넘기
		// 수량은 콤보박스에서
		// P_no >product에서 
		//orderService.create(id, p_no, 수량);
	}
	private void productInCart() throws Exception {
		Cart productincart  = new Cart(0, (int)productcomboBox.getSelectedItem(), loginUser.getM_id(), frame.productService.findByPrimaryKey(0));
		frame.cartService.addCartInProduct(productincart);
		
	}
	
	
	
}
