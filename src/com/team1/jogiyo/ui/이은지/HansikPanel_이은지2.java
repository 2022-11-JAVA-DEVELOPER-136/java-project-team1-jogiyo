package com.team1.jogiyo.ui.이은지;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import com.team1.jogiyo.cart.*;
import com.team1.jogiyo.product.*;
import com.team1.jogiyo.ui.*;
import com.team1.jogiyo.user.*;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import java.awt.Cursor;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class HansikPanel_이은지2 extends JPanel {
	JogiyoMainFrame frame;
	public void setFrame(JogiyoMainFrame frame) {
		this.frame = frame;
	}
	User loginUser=null;
	public void setUser(User loginUser) {
		this.loginUser=loginUser;
	}
	
	JComboBox hansikComboBox1;
	JComboBox hansikComboBox2;
	JComboBox hansikComboBox3;
	JLabel hansikNameLB1;
	JLabel hansikNameLB2;
	JLabel hansikNameLB3;
	
	
	/**
	 * Create the panel.
	 */
	
	public HansikPanel_이은지2() throws Exception {
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane hansikListScrollPane = new JScrollPane();
		add(hansikListScrollPane);
		
		JPanel HansikList = new JPanel();
		HansikList.setPreferredSize(new Dimension(10, 1000));
		hansikListScrollPane.setViewportView(HansikList);
		HansikList.setLayout(null);
		
		JPanel hansikMenuPanel1 = new JPanel();
		hansikMenuPanel1.setLayout(null);
		hansikMenuPanel1.setBounds(0, 0, 381, 167);
		HansikList.add(hansikMenuPanel1);
		
		JLabel hansikImageLB1 = new JLabel("");
		hansikImageLB1.setBounds(0, 0, 234, 167);
		hansikMenuPanel1.add(hansikImageLB1);
		
		JLabel hansikNameLB1 = new JLabel("순대국밥");
		hansikNameLB1.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikNameLB1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		hansikNameLB1.setBounds(246, 36, 109, 30);
		hansikMenuPanel1.add(hansikNameLB1);
		
		JLabel hansikPriceLB1 = new JLabel("\\ 9,000");
		hansikPriceLB1.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikPriceLB1.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		hansikPriceLB1.setBounds(280, 76, 75, 24);
		hansikMenuPanel1.add(hansikPriceLB1);
		
		JLabel hansikCartLB1 = new JLabel("");
		hansikCartLB1.setBounds(328, 114, 27, 27);
		hansikMenuPanel1.add(hansikCartLB1);
		
		JComboBox hansikComboBox1 = new JComboBox();
		hansikComboBox1.setBounds(280, 118, 32, 23);
		hansikMenuPanel1.add(hansikComboBox1);

		
		/**********************생성자 끝************************/
		/*
		 * Service객체 생성
		 */
		
		
		/*
		 * loginMember 객체 생성
		 */
		loginUser = new User("asas","1111","가가가","제주","012-345-6789");
		
		//메소드 사용

	}
	
	/*
	 * 메소드
	 */
	
	/*
	 * hansikMenuPanel1, hansikMenuPanel2, hansikMenuPanel3 각각 선택 시, 각 상품 상세페이지로 이동
	 */
	public Product productDetail(String p_name) throws Exception{
		return frame.productService.findByName(p_name);
	}
	
	/*
	 * 콤보박스로 선택한 수량만큼 상품을 카트에 담기
	 */
	private void menuToCart1(String p_name) throws Exception {
		/*
		Cart cartInMenu1 = new Cart(0, (int)hansikComboBox1.getSelectedItem(), loginUser.getM_id(), productService.findByName(p_name));
		if(hansikNameLB1.getText().equals(p_name)) {
			cartService.addCartInProduct(cartInMenu1);
		}
	}
	public void ProductList() {
		List<Product>
		
		JPanel hansikMenuPanel1 = new JPanel();
		hansikMenuPanel1.setLayout(null);
		hansikMenuPanel1.setBounds(12, 10, 350, 167);
		HansikList.add(hansikMenuPanel1);
		
		JLabel hansikImageLB1 = new JLabel("");
		hansikImageLB1.setBounds(0, 0, 234, 167);
		hansikMenuPanel1.add(hansikImageLB1);
		
		JLabel hansikNameLB1_1 = new JLabel("순대국밥");
		hansikNameLB1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikNameLB1_1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		hansikNameLB1_1.setBounds(229, 36, 109, 30);
		hansikMenuPanel1.add(hansikNameLB1_1);
		
		JLabel hansikPriceLB1 = new JLabel("\\ 9,000");
		hansikPriceLB1.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikPriceLB1.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		hansikPriceLB1.setBounds(263, 76, 75, 24);
		hansikMenuPanel1.add(hansikPriceLB1);
		
		JLabel hansikCartLB1 = new JLabel("");
		hansikCartLB1.setBounds(311, 114, 27, 27);
		hansikMenuPanel1.add(hansikCartLB1);
		
		JComboBox hansikComboBox1_1 = new JComboBox();
		hansikComboBox1_1.setBounds(263, 118, 32, 23);
		hansikMenuPanel1.add(hansikComboBox1_1);
		*/
	}
}
