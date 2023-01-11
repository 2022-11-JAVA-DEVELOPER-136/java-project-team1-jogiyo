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
	User loginUser;
	Product product;
	
	public void setFrame(JogiyoMainFrame frame) {
		this.frame = frame;
	}
	public void setUser(User loginUser) throws Exception {
		this.loginUser=loginUser;
	}
	private JComboBox productcomboBox;
	private JButton orderBtn;
	private JButton cartBtn;
	private JogiyoMainFrame jogiyoMainFrame;
	private JLabel productImageLB;
	private JLabel productNameLB;
	private JLabel productDescLB;
	private JLabel productPriceLB;
	private JLabel priceLB;
	private JLabel countLB;

	/**
	 * Create the panel.
	 */

	public ProductDetailPanel_이다은 () throws Exception {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		productImageLB = new JLabel("");
		JLabel productImageLB = new JLabel("순대국밥");
		productImageLB.setIcon(new ImageIcon(ProductDetailPanel_이다은.class.getResource("/images/productDetail/p_no_01.jpg")));
		productImageLB.setBounds(0, 0, 350, 200);
		add(productImageLB);
		
		
		productNameLB = new JLabel("순대국밥");
		JLabel productNameLB = new JLabel();
		productNameLB.setHorizontalAlignment(SwingConstants.CENTER);
		productNameLB.setFont(new Font("굴림", Font.BOLD, 25));
		productNameLB.setBounds(0, 223, 350, 38);
		add(productNameLB);
		
		productDescLB = new JLabel("순대가 들어간 국밥");
		productDescLB.setBackground(new Color(255, 255, 255));
		productDescLB.setHorizontalAlignment(SwingConstants.CENTER);
		productDescLB.setFont(new Font("굴림", Font.PLAIN, 15));
		productDescLB.setBounds(0, 271, 350, 47);
		add(productDescLB);
		
		productPriceLB = new JLabel("9000");
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
		
		
		priceLB = new JLabel("가격");
		priceLB.setBounds(172, 340, 57, 15);
		add(priceLB);
		
		countLB = new JLabel("수량");
		countLB.setBounds(172, 390, 57, 15);
		add(countLB);
		
		//클릭 시 주문 페이지로 이동
		orderBtn = new JButton("바로주문");
		orderBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		orderBtn.setBackground(new Color(255, 255, 255));
		orderBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					productToOrder();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
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
			}
		});
		cartBtn.setBounds(208, 460, 97, 23);
		add(cartBtn);
		
		
	}
	// 제품정보 불러오기
	public void displayProductDetail(Product product) {
		System.out.println(product);
		try {
			productImageLB.setIcon(new ImageIcon(ProductDetailPanel_이다은.class.getResource(""+product.getP_image())));
			productNameLB.setText(product.getP_name()+"");
			productDescLB.setText(product.getP_desc()+"");
			productPriceLB.setText(product.getP_price()+"");	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void productToOrder() throws Exception {
		Product product;
		product = frame.productService.findByPrimaryKey(0);
		frame.orderService.create(loginUser.getM_id(), product.getCt_no(),(int)productcomboBox.getSelectedItem());
	}

	
	public void productToCart (String p_name) throws Exception {
		Cart producttocart  = new Cart(0, (int)productcomboBox.getSelectedItem(), loginUser.getM_id(), frame.productService.findByName(p_name));
		if(cartBtn.getText().equals(p_name)) {
		frame.cartService.addCartInProduct(producttocart);		
		}
		
	}
	public void setProduct(Product product) {
		this.product=product;
		displayProductDetail(product);
	}
	
	
}