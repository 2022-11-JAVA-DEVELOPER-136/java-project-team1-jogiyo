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
import java.awt.Cursor;

public class JoongsikPanel_이은지 extends JPanel {
	/**************************************/
	/*
	 * Service 객체선언
	 */
	JogiyoMainFrame frame;
	public void setFrame(JogiyoMainFrame frame) {
		this.frame = frame;
	}
	
	/*
	 * loginMember 객체선언
	 */
	User loginUser=null;
	public void setUser(User loginUser) {
		this.loginUser=loginUser;
	}
	
	JPanel joongsikMenuPanel1;
	JPanel joongsikMenuPanel2;
	JPanel joongsikMenuPanel3;
	JComboBox joongsikComboBox1;
	JComboBox joongsikComboBox2;
	JComboBox joongsikComboBox3;
	JLabel joongsikNameLB1;
	JLabel joongsikNameLB2;
	JLabel joongsikNameLB3;
	

	/**
	 * Create the panel.
	 */
	public JoongsikPanel_이은지() throws Exception {
		setLayout(null);
		
		JScrollPane joongsikListScrollPane = new JScrollPane();
		joongsikListScrollPane.setBounds(0, 498, 350, -496);
		add(joongsikListScrollPane);
		
		//패널생성
		JPanel joongsikMenuPanel1 = new JPanel();
		joongsikMenuPanel1.setBounds(0, 0, 400, 167);
		add(joongsikMenuPanel1);
		joongsikMenuPanel1.setLayout(null);
		
		JLabel joongsikImageLB1 = new JLabel("");
		joongsikImageLB1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		joongsikImageLB1.setBounds(0, 0, 208, 167);
		joongsikImageLB1.setIcon(new ImageIcon(JoongsikPanel_이은지.class.getResource("/images/productList/p_image4.jpg")));
		joongsikMenuPanel1.add(joongsikImageLB1);
		
		/*
		 * 클릭 시 상세보기로 이동
		 */
		JLabel joongsikNameLB1 = new JLabel("자장면");
		joongsikNameLB1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					System.out.println("자장면 상세보기로 이동");
					Product clickedProduct=productDetail(joongsikNameLB1.getText());
					frame.changePanel(frame.PRODUCTDETAILPANE,clickedProduct);
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		joongsikNameLB1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		joongsikNameLB1.setHorizontalAlignment(SwingConstants.RIGHT);
		joongsikNameLB1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		joongsikNameLB1.setBounds(261, 52, 109, 30);
		joongsikMenuPanel1.add(joongsikNameLB1);
		
		JLabel joongsikPriceLB1 = new JLabel("\\ 8,000");
		joongsikPriceLB1.setHorizontalAlignment(SwingConstants.RIGHT);
		joongsikPriceLB1.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		joongsikPriceLB1.setBounds(295, 92, 75, 24);
		joongsikMenuPanel1.add(joongsikPriceLB1);
		
		
		JPanel joongsikMenuPanel2 = new JPanel();
		joongsikMenuPanel2.setLayout(null);
		joongsikMenuPanel2.setBounds(0, 166, 400, 167);
		add(joongsikMenuPanel2);
		
		JLabel joongsikImageLB2 = new JLabel("");
		joongsikImageLB2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		joongsikImageLB2.setIcon(new ImageIcon(JoongsikPanel_이은지.class.getResource("/images/productList/p_image5.jpg")));
		joongsikImageLB2.setBounds(0, 0, 208, 167);
		joongsikMenuPanel2.add(joongsikImageLB2);
		
		/*
		 * 클릭 시 상세보기로 이동
		 */
		JLabel joongsikNameLB2 = new JLabel("삼선짬뽕");
		joongsikNameLB2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					System.out.println("삼선짬뽕 상세보기로 이동");
					Product clickedProduct=productDetail(joongsikNameLB2.getText());
					frame.changePanel(frame.PRODUCTDETAILPANE,clickedProduct);
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		joongsikNameLB2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		joongsikNameLB2.setHorizontalAlignment(SwingConstants.RIGHT);
		joongsikNameLB2.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		joongsikNameLB2.setBounds(261, 52, 109, 30);
		joongsikMenuPanel2.add(joongsikNameLB2);
		
		JLabel joongsikPriceLB2 = new JLabel("\\ 12,000");
		joongsikPriceLB2.setHorizontalAlignment(SwingConstants.RIGHT);
		joongsikPriceLB2.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		joongsikPriceLB2.setBounds(295, 92, 75, 24);
		joongsikMenuPanel2.add(joongsikPriceLB2);
		
		
		JPanel joongsikMenuPanel3 = new JPanel();
		joongsikMenuPanel3.setLayout(null);
		joongsikMenuPanel3.setBounds(0, 333, 400, 167);
		add(joongsikMenuPanel3);
		
		JLabel joongsikImageLB3 = new JLabel("");
		joongsikImageLB3.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		joongsikImageLB3.setIcon(new ImageIcon(JoongsikPanel_이은지.class.getResource("/images/productList/p_image6.jpg")));
		joongsikImageLB3.setBounds(0, 0, 208, 167);
		joongsikMenuPanel3.add(joongsikImageLB3);
		
		/*
		 * 클릭 시 상세보기로 이동
		 */
		JLabel joongsikNameLB3 = new JLabel("탕수육");
		joongsikNameLB3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					System.out.println("탕수육 상세보기로 이동");
					Product clickedProduct=productDetail(joongsikNameLB3.getText());
					frame.changePanel(frame.PRODUCTDETAILPANE,clickedProduct);
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		joongsikNameLB3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		joongsikNameLB3.setHorizontalAlignment(SwingConstants.RIGHT);
		joongsikNameLB3.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		joongsikNameLB3.setBounds(263, 36, 109, 30);
		joongsikMenuPanel3.add(joongsikNameLB3);
		
		JLabel joongsikPriceLB3 = new JLabel("\\ 25,000");
		joongsikPriceLB3.setHorizontalAlignment(SwingConstants.RIGHT);
		joongsikPriceLB3.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		joongsikPriceLB3.setBounds(297, 76, 75, 24);
		joongsikMenuPanel3.add(joongsikPriceLB3);

		
		/**********************생성자 끝************************/
		
	}
	
	/*
	 * 메뉴 이름 클릭 시, 각 상품 상세 페이지로 이동
	 */
	public Product productDetail(String p_name) throws Exception{
		return frame.productService.findByName(p_name);
	}
	
	
}
