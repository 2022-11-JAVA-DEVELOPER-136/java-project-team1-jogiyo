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

import com.team1.jogiyo.ui.JogiyoMainFrame;
import com.team1.jogiyo.ui.이다은.*;
import com.team1.jogiyo.user.User;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import java.awt.Color;

public class BunsikPanel_이은지 extends JPanel {
	JogiyoMainFrame frame;
	User loginUser=null;
	public void setFrame(JogiyoMainFrame frame) {
		this.frame = frame;
	}
	public void setUser(User loginUser) {
		this.loginUser=loginUser;
	}
	
	

	JPanel bunsikMenuPanel1;
	JPanel bunsikMenuPanel2;
	JPanel bunsikMenuPanel3;
	JLabel bunsikNameLB1;
	JLabel bunsikNameLB2;
	JLabel bunsikNameLB3;

	/**
	 * Create the panel.
	 */
	public BunsikPanel_이은지() throws Exception {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JScrollPane bunsikListScrollPane = new JScrollPane();
		bunsikListScrollPane.setBounds(0, 499, 400, -497);
		add(bunsikListScrollPane);
		
		//패널생성
		JPanel bunsikPanel1 = new JPanel();
		bunsikPanel1.setBackground(new Color(255, 255, 255));
		bunsikPanel1.setBounds(10, 10, 349, 144);
		add(bunsikPanel1);
		bunsikPanel1.setLayout(null);
		
		JLabel bunsikImageLB1 = new JLabel("");
		bunsikImageLB1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		bunsikImageLB1.setBounds(0, 0, 236, 167);
		bunsikImageLB1.setIcon(new ImageIcon(BunsikPanel_이은지.class.getResource("/images/productList/p_image7.jpg")));
		bunsikPanel1.add(bunsikImageLB1);
		
		/*
		 * 클릭 시 상세보기로 이동
		 */
		JLabel bunsikNameLB1 = new JLabel("떡볶이");
		bunsikNameLB1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					System.out.println("떡볶이 상세보기로 이동");
					Product clickedProduct=productDetail(bunsikNameLB1.getText());
					frame.changePanel(frame.PRODUCTDETAILPANE,clickedProduct);
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		bunsikNameLB1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bunsikNameLB1.setHorizontalAlignment(SwingConstants.RIGHT);
		bunsikNameLB1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		bunsikNameLB1.setBounds(237, 51, 109, 30);
		bunsikPanel1.add(bunsikNameLB1);
		
		JLabel bunsikPriceLB1 = new JLabel("\\ 5,000");
		bunsikPriceLB1.setHorizontalAlignment(SwingConstants.RIGHT);
		bunsikPriceLB1.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		bunsikPriceLB1.setBounds(271, 91, 75, 24);
		bunsikPanel1.add(bunsikPriceLB1);
		
		
		JPanel bunsikPanel2 = new JPanel();
		bunsikPanel2.setBackground(new Color(255, 255, 255));
		bunsikPanel2.setLayout(null);
		bunsikPanel2.setBounds(20, 167, 339, 123);
		add(bunsikPanel2);
		
		JLabel bunsikImageLB2 = new JLabel("");
		bunsikImageLB2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		bunsikImageLB2.setIcon(new ImageIcon(BunsikPanel_이은지.class.getResource("/images/productList/p_image8.jpg")));
		bunsikImageLB2.setBounds(0, 0, 236, 167);
		bunsikPanel2.add(bunsikImageLB2);
		
		/*
		 * 클릭 시 상세보기로 이동
		 */
		JLabel bunsikNameLB2 = new JLabel("어묵");
		bunsikNameLB2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					System.out.println("어묵 상세보기로 이동");
					Product clickedProduct=productDetail(bunsikNameLB2.getText());
					frame.changePanel(frame.PRODUCTDETAILPANE,clickedProduct);
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		bunsikNameLB2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bunsikNameLB2.setHorizontalAlignment(SwingConstants.RIGHT);
		bunsikNameLB2.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		bunsikNameLB2.setBounds(238, 50, 109, 30);
		bunsikPanel2.add(bunsikNameLB2);
		
		JLabel bunsikPriceLB2 = new JLabel("\\ 4,000");
		bunsikPriceLB2.setHorizontalAlignment(SwingConstants.RIGHT);
		bunsikPriceLB2.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		bunsikPriceLB2.setBounds(272, 90, 75, 24);
		bunsikPanel2.add(bunsikPriceLB2);
		
		
		JPanel bunsikPanel3 = new JPanel();
		bunsikPanel3.setBackground(new Color(255, 255, 255));
		bunsikPanel3.setLayout(null);
		bunsikPanel3.setBounds(0, 333, 371, 167);
		add(bunsikPanel3);
		
		JLabel bunsikImageLB3 = new JLabel("");
		bunsikImageLB3.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		bunsikImageLB3.setIcon(new ImageIcon(BunsikPanel_이은지.class.getResource("/images/productList/p_image9.jpg")));
		bunsikImageLB3.setBounds(0, 0, 208, 167);
		bunsikPanel3.add(bunsikImageLB3);
		
		/*
		 * 클릭 시 상세보기로 이동
		 */
		JLabel bunsikNameLB3 = new JLabel("순대");
		bunsikNameLB3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					System.out.println("순대 상세보기로 이동");
					Product clickedProduct=productDetail(bunsikNameLB3.getText());
					frame.changePanel(frame.PRODUCTDETAILPANE,clickedProduct);
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		bunsikNameLB3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bunsikNameLB3.setHorizontalAlignment(SwingConstants.RIGHT);
		bunsikNameLB3.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		bunsikNameLB3.setBounds(237, 52, 109, 30);
		bunsikPanel3.add(bunsikNameLB3);
		
		JLabel bunsikPriceLB3 = new JLabel("\\ 6,000");
		bunsikPriceLB3.setHorizontalAlignment(SwingConstants.RIGHT);
		bunsikPriceLB3.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		bunsikPriceLB3.setBounds(271, 92, 75, 24);
		bunsikPanel3.add(bunsikPriceLB3);

		
		/**********************생성자 끝************************/
		
	}
	
	/*
	 * 메뉴 이름 클릭 시, 각 상품 상세 페이지로 이동
	 */
	public Product productDetail(String p_name) throws Exception{
		return frame.productService.findByName(p_name);
	}
	
	
}
