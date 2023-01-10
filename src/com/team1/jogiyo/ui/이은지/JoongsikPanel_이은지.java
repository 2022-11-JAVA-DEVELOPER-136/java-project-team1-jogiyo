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
		joongsikMenuPanel1.setBounds(0, 0, 350, 167);
		add(joongsikMenuPanel1);
		joongsikMenuPanel1.setLayout(null);
		
		JLabel joongsikImageLB1 = new JLabel("");
		joongsikImageLB1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		joongsikImageLB1.setBounds(0, 0, 229, 167);
		joongsikImageLB1.setIcon(new ImageIcon("C:\\2022-11-JAVA-DEVELOPER\\git-repositories-home\\java-project-team1-jogiyo\\src\\images\\productList\\p_image4.jpg"));
		joongsikMenuPanel1.add(joongsikImageLB1);
		
		JLabel joongsikNameLB1 = new JLabel("자장면");
		joongsikNameLB1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					System.out.println("자장면 상세보기로 이동");
					Product clickedProduct=productDetail(joongsikNameLB1.getText());
					frame.changePanel(25,clickedProduct);
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		joongsikNameLB1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		joongsikNameLB1.setHorizontalAlignment(SwingConstants.RIGHT);
		joongsikNameLB1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		joongsikNameLB1.setBounds(229, 36, 109, 30);
		joongsikMenuPanel1.add(joongsikNameLB1);
		
		JLabel joongsikPriceLB1 = new JLabel("\\ 8,000");
		joongsikPriceLB1.setHorizontalAlignment(SwingConstants.RIGHT);
		joongsikPriceLB1.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		joongsikPriceLB1.setBounds(263, 76, 75, 24);
		joongsikMenuPanel1.add(joongsikPriceLB1);
		
		/*
		 * 해당 라벨 클릭 시 장바구니에 상품 추가
		 */
		JLabel joongsikCartLB1 = new JLabel("");
		joongsikCartLB1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		joongsikCartLB1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		joongsikCartLB1.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\cart.png"));
		joongsikCartLB1.setBounds(311, 114, 27, 27);
		joongsikMenuPanel1.add(joongsikCartLB1);
		
		JComboBox joongsikComboBox1 = new JComboBox();
		joongsikComboBox1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		joongsikComboBox1.setBounds(263, 118, 32, 23);
		joongsikMenuPanel1.add(joongsikComboBox1);
		
		/*
		 * 해당 패널 클릭 시 삼선짬뽕 상세보기로 이동
		 */
		JPanel joongsikMenuPanel2 = new JPanel();
		joongsikMenuPanel2.setLayout(null);
		joongsikMenuPanel2.setBounds(0, 166, 350, 167);
		add(joongsikMenuPanel2);
		
		JLabel joongsikImageLB2 = new JLabel("");
		joongsikImageLB2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		joongsikImageLB2.setIcon(new ImageIcon("C:\\2022-11-JAVA-DEVELOPER\\git-repositories-home\\java-project-team1-jogiyo\\src\\images\\productList\\p_image5.jpg"));
		joongsikImageLB2.setBounds(0, 0, 229, 167);
		joongsikMenuPanel2.add(joongsikImageLB2);
		
		JLabel joongsikNameLB2 = new JLabel("삼선짬뽕");
		joongsikNameLB2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		joongsikNameLB2.setHorizontalAlignment(SwingConstants.RIGHT);
		joongsikNameLB2.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		joongsikNameLB2.setBounds(229, 36, 109, 30);
		joongsikMenuPanel2.add(joongsikNameLB2);
		
		JLabel joongsikPriceLB2 = new JLabel("\\ 12,000");
		joongsikPriceLB2.setHorizontalAlignment(SwingConstants.RIGHT);
		joongsikPriceLB2.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		joongsikPriceLB2.setBounds(263, 76, 75, 24);
		joongsikMenuPanel2.add(joongsikPriceLB2);
		
		/*
		 * 해당 라벨 클릭 시 장바구니에 상품 추가
		 */
		JLabel joongsikCartLB2 = new JLabel("");
		joongsikCartLB2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		joongsikCartLB2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		joongsikCartLB2.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\cart.png"));
		joongsikCartLB2.setBounds(311, 114, 27, 27);
		joongsikMenuPanel2.add(joongsikCartLB2);
		
		JComboBox joongsikComboBox2 = new JComboBox();
		joongsikComboBox2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		joongsikComboBox2.setBounds(263, 118, 32, 23);
		joongsikMenuPanel2.add(joongsikComboBox2);
		
		/*
		 * 해당 패널 클릭 시 탕수육 상세보기로 이동
		 */
		JPanel joongsikMenuPanel3 = new JPanel();
		joongsikMenuPanel3.setLayout(null);
		joongsikMenuPanel3.setBounds(0, 333, 350, 167);
		add(joongsikMenuPanel3);
		
		JLabel joongsikImageLB3 = new JLabel("");
		joongsikImageLB3.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		joongsikImageLB3.setIcon(new ImageIcon("C:\\2022-11-JAVA-DEVELOPER\\git-repositories-home\\java-project-team1-jogiyo\\src\\images\\productList\\p_image6.jpg"));
		joongsikImageLB3.setBounds(0, 0, 229, 167);
		joongsikMenuPanel3.add(joongsikImageLB3);
		
		JLabel joongsikNameLB3 = new JLabel("탕수육");
		joongsikNameLB3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		joongsikNameLB3.setHorizontalAlignment(SwingConstants.RIGHT);
		joongsikNameLB3.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		joongsikNameLB3.setBounds(229, 36, 109, 30);
		joongsikMenuPanel3.add(joongsikNameLB3);
		
		JLabel joongsikPriceLB3 = new JLabel("\\ 25,000");
		joongsikPriceLB3.setHorizontalAlignment(SwingConstants.RIGHT);
		joongsikPriceLB3.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		joongsikPriceLB3.setBounds(263, 76, 75, 24);
		joongsikMenuPanel3.add(joongsikPriceLB3);
		
		/*
		 * 해당 라벨 클릭 시 장바구니에 상품 추가
		 */
		JLabel joongsikCartLB3 = new JLabel("");
		joongsikCartLB3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		joongsikCartLB3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		joongsikCartLB3.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\cart.png"));
		joongsikCartLB3.setBounds(311, 114, 27, 27);
		joongsikMenuPanel3.add(joongsikCartLB3);
		
		JComboBox joongsikComboBox3 = new JComboBox();
		joongsikComboBox3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		joongsikComboBox3.setBounds(263, 118, 32, 23);
		joongsikMenuPanel3.add(joongsikComboBox3);

		
		/**********************생성자 끝************************/
		
	}
	
	/*
	 * 메뉴 이름 클릭 시, 각 상품 상세 페이지로 이동
	 */
	public Product productDetail(String p_name) throws Exception{
		return frame.productService.findByName(p_name);
	}
	
	
	
}
