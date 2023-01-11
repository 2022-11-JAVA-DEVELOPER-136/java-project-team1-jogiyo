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
import com.team1.jogiyo.ui.JogiyoMainFrame;
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
public class HansikPanel_이은지 extends JPanel {
	JogiyoMainFrame frame;
	public void setFrame(JogiyoMainFrame frame) {
		this.frame = frame;
	}
	User loginUser=null;
	public void setUser(User loginUser) {
		this.loginUser=loginUser;
	}

	JPanel hansikMenuPanel1;
	JPanel hansikMenuPanel2;
	JPanel hansikMenuPanel3;
	JComboBox hansikComboBox1;
	JComboBox hansikComboBox2;
	JComboBox hansikComboBox3;
	JLabel hansikNameLB1;
	JLabel hansikNameLB2;
	JLabel hansikNameLB3;
	
	
	/**
	 * Create the panel.
	 */
	
	public HansikPanel_이은지() throws Exception {
		
		setLayout(null);
		
		JScrollPane hansikListScrollPane = new JScrollPane();
		hansikListScrollPane.setBounds(0, 496, 400, -494);
		add(hansikListScrollPane);
		
		//패널생성
		JPanel hansikMenuPanel1 = new JPanel();
		hansikMenuPanel1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		hansikMenuPanel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("순대국밥 상세보기로 이동");
				//frame.
				
				
				
			}
		});
		hansikMenuPanel1.setBounds(0, 0, 400, 167);
		add(hansikMenuPanel1);
		hansikMenuPanel1.setLayout(null);
		
		
		JLabel hansikImageLB1 = new JLabel("");
		hansikImageLB1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		hansikImageLB1.setBounds(0, 0, 234, 167);
		hansikImageLB1.setIcon(new ImageIcon("C:\\2022-11-JAVA-DEVELOPER\\git-repositories-home\\java-project-team1-jogiyo\\src\\images\\productList\\p_image1.jpg"));
		hansikMenuPanel1.add(hansikImageLB1);
		
		
		JLabel hansikNameLB1 = new JLabel("순대국밥");
		hansikNameLB1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					System.out.println("순대국밥 상세보기로 이동");
					Product clickedProduct=productDetail(hansikNameLB1.getText());
					frame.changePanel(25,clickedProduct);
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		hansikNameLB1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hansikNameLB1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		hansikNameLB1.setBounds(261, 36, 109, 30);
		hansikNameLB1.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikMenuPanel1.add(hansikNameLB1);
		
		JLabel hansikPriceLB1 = new JLabel("\\ 9,000");
		hansikPriceLB1.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		hansikPriceLB1.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikPriceLB1.setBounds(295, 76, 75, 24);
		hansikMenuPanel1.add(hansikPriceLB1);
		
		/*
		 * 해당 라벨 클릭 시 장바구니에 상품 추가
		 */
		JLabel hansikCartLB1 = new JLabel("");
		hansikCartLB1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//장바구니에 상품 추가
			}
		});
		hansikCartLB1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		hansikCartLB1.setBounds(343, 114, 27, 27);
		hansikMenuPanel1.add(hansikCartLB1);
		hansikCartLB1.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\cart.png"));
		
		JComboBox hansikComboBox1 = new JComboBox();
		hansikComboBox1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		hansikComboBox1.setBounds(295, 118, 32, 23);
		hansikMenuPanel1.add(hansikComboBox1);
		
		/*
		 * 해당 패널 클릭 시 김치찜 상세보기로 이동
		 */
		JPanel hansikMenuPanel2 = new JPanel();
		hansikMenuPanel2.setLayout(null);
		hansikMenuPanel2.setBounds(0, 166, 400, 167);
		add(hansikMenuPanel2);
		
		JLabel hansikImageLB2 = new JLabel("");
		hansikImageLB2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		hansikImageLB2.setIcon(new ImageIcon("C:\\2022-11-JAVA-DEVELOPER\\git-repositories-home\\java-project-team1-jogiyo\\src\\images\\productList\\p_image2.jpg"));
		hansikImageLB2.setBounds(0, 0, 251, 167);
		hansikMenuPanel2.add(hansikImageLB2);
		
		JLabel hansikNameLB2 = new JLabel("김치찜");
		hansikNameLB2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					System.out.println("김치찜 상세보기로 이동");
					Product clickedProduct=productDetail(hansikNameLB2.getText());
					frame.changePanel(25,clickedProduct);
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		hansikNameLB2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hansikNameLB2.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikNameLB2.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		hansikNameLB2.setBounds(263, 36, 109, 30);
		hansikMenuPanel2.add(hansikNameLB2);
		
		JLabel hansikPriceLB2 = new JLabel("\\ 24,000");
		hansikPriceLB2.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikPriceLB2.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		hansikPriceLB2.setBounds(297, 76, 75, 24);
		hansikMenuPanel2.add(hansikPriceLB2);
		
		/*
		 * 해당 라벨 클릭 시 장바구니에 상품 추가
		 */
		JLabel hansikCartLB2 = new JLabel("");
		hansikCartLB2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hansikCartLB2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//장바구니에 상품 추가
			}
		});
		hansikCartLB2.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\cart.png"));
		hansikCartLB2.setBounds(345, 114, 27, 27);
		hansikMenuPanel2.add(hansikCartLB2);
		
		JComboBox hansikComboBox2 = new JComboBox();
		hansikComboBox2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		hansikComboBox2.setBounds(297, 118, 32, 23);
		hansikMenuPanel2.add(hansikComboBox2);
		
		/*
		 * 해당 패널 클릭 시 삼겹살 상세보기로 이동
		 */
		JPanel hansikMenuPanel3 = new JPanel();
		hansikMenuPanel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("삼겹살 상세보기로 이동");
			}
		});
		hansikMenuPanel3.setLayout(null);
		hansikMenuPanel3.setBounds(0, 333, 400, 167);
		add(hansikMenuPanel3);
		
		JLabel hansikImageLB3 = new JLabel("");
		hansikImageLB3.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		hansikImageLB3.setIcon(new ImageIcon("C:\\2022-11-JAVA-DEVELOPER\\git-repositories-home\\java-project-team1-jogiyo\\src\\images\\productList\\p_image3.jpg"));
		hansikImageLB3.setBounds(0, 0, 251, 167);
		hansikMenuPanel3.add(hansikImageLB3);
		
		JLabel hansikNameLB3 = new JLabel("삼겹살");
		hansikNameLB3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					System.out.println("삼겹살 상세보기로 이동");
					Product clickedProduct=productDetail(hansikNameLB3.getText());
					frame.changePanel(25,clickedProduct);
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		hansikNameLB3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hansikNameLB3.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikNameLB3.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		hansikNameLB3.setBounds(263, 36, 109, 30);
		hansikMenuPanel3.add(hansikNameLB3);
		
		JLabel hansikPriceLB3 = new JLabel("\\ 15,000");
		hansikPriceLB3.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikPriceLB3.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		hansikPriceLB3.setBounds(297, 76, 75, 24);
		hansikMenuPanel3.add(hansikPriceLB3);
		
		/*
		 * 해당 라벨 클릭 시 장바구니에 상품 추가
		 */
		JLabel hansikCartLB3 = new JLabel("");
		hansikCartLB3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hansikCartLB3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//장바구니에 상품 추가
			}
		});
		hansikCartLB3.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\cart.png"));
		hansikCartLB3.setBounds(345, 114, 27, 27);
		hansikMenuPanel3.add(hansikCartLB3);
		
		JComboBox hansikComboBox3 = new JComboBox();
		hansikComboBox3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		hansikComboBox3.setBounds(297, 118, 32, 23);
		hansikMenuPanel3.add(hansikComboBox3);

		

	}
	/**********************생성자 끝************************/
	
	/*
	 * 메소드
	 */
	
	/*
	 * 메뉴 이름 클릭 시, 각 상품 상세 페이지로 이동
	 */
	public Product productDetail(String p_name) throws Exception{
		return frame.productService.findByName(p_name);
	}
	
	
	
	/*
	 * 콤보박스로 선택한 수량만큼 카트에 상품 담기
	 */
	
	private void hansikToCart1(String p_name) throws Exception {
		
		Cart menuToCart1 = new Cart(0, (int)hansikComboBox1.getSelectedItem(), loginUser.getM_id(), frame.productService.findByName(p_name));
		if(hansikNameLB1.getText().equals(p_name)) {
			frame.cartService.addCartInProduct(menuToCart1);
		}
		
		JLabel hansikCartLB1 = new JLabel("");
		hansikCartLB1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					hansikToCart1(hansikNameLB1.getText());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		hansikCartLB1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		hansikCartLB1.setBounds(343, 114, 27, 27);
		hansikMenuPanel1.add(hansikCartLB1);
		hansikCartLB1.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\cart.png"));
		
	}
	
	private void hansikToCart2(String p_name) throws Exception {
		
		Cart menuToCart2 = new Cart(0, (int)hansikComboBox2.getSelectedItem(), loginUser.getM_id(), frame.productService.findByName(p_name));
		if(hansikNameLB2.getText().equals(p_name)) {
			frame.cartService.addCartInProduct(menuToCart2);
		}
		
		JLabel hansikCartLB2 = new JLabel("");
		hansikCartLB2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					hansikToCart2(hansikNameLB2.getText());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		hansikCartLB2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		hansikCartLB2.setBounds(343, 114, 27, 27);
		hansikMenuPanel1.add(hansikCartLB2);
		hansikCartLB2.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\cart.png"));
		
	}
	
		private void hansikToCart3(String p_name) throws Exception {
		
		Cart menuToCart13 = new Cart(0, (int)hansikComboBox3.getSelectedItem(), loginUser.getM_id(), frame.productService.findByName(p_name));
		if(hansikNameLB3.getText().equals(p_name)) {
			frame.cartService.addCartInProduct(menuToCart13);
		}
		
		JLabel hansikCartLB3 = new JLabel("");
		hansikCartLB3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					hansikToCart3(hansikNameLB3.getText());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		hansikCartLB3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		hansikCartLB3.setBounds(343, 114, 27, 27);
		hansikMenuPanel3.add(hansikCartLB3);
		hansikCartLB3.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\cart.png"));
		
	}
		
	
	
}
