package com.team1.jogiyo.ui.이은지;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BunsikPanel_이은지 extends JPanel {
	private final JPanel bunsikPanel1 = new JPanel();
	private JLabel bunsikCartLB1;
	private JComboBox bunsikComboBox1;
	private JLabel bunsikCartLB2;
	private JComboBox bunsikComboBox2;
	private JLabel bunsikCartLB3;
	private JComboBox bunsikComboBox3;

	/**
	 * Create the panel.
	 */
	public BunsikPanel_이은지() {
		setLayout(null);
		
		/*
		 * 해당 패널 클릭 시 떡볶이 상세보기로 이동
		 */
		JScrollPane bunsikListScrollPane = new JScrollPane();
		bunsikListScrollPane.setBounds(0, 498, 350, -496);
		add(bunsikListScrollPane);
		bunsikPanel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("떡볶이 상세보기로 이동");
			}
		});
		bunsikPanel1.setBounds(0, 0, 350, 167);
		add(bunsikPanel1);
		bunsikPanel1.setLayout(null);
		
		JLabel bunsikImageLB1 = new JLabel("");
		bunsikImageLB1.setBounds(0, 0, 236, 167);
		bunsikImageLB1.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\p_image7.jpg"));
		bunsikPanel1.add(bunsikImageLB1);
		
		JLabel bunsikNameLB1 = new JLabel("떡볶이");
		bunsikNameLB1.setHorizontalAlignment(SwingConstants.RIGHT);
		bunsikNameLB1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		bunsikNameLB1.setBounds(229, 35, 109, 30);
		bunsikPanel1.add(bunsikNameLB1);
		
		JLabel bunsikPriceLB1 = new JLabel("\\ 5,000");
		bunsikPriceLB1.setHorizontalAlignment(SwingConstants.RIGHT);
		bunsikPriceLB1.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		bunsikPriceLB1.setBounds(263, 75, 75, 24);
		bunsikPanel1.add(bunsikPriceLB1);
		
		/*
		 * 해당 라벨 클릭 시 장바구니에 상품 추가
		 */
		JLabel bunsikCartLB1 = new JLabel("");
		bunsikCartLB1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		bunsikCartLB1 = new JLabel("");
		bunsikCartLB1.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\cart.png"));
		bunsikCartLB1.setBounds(311, 113, 27, 27);
		bunsikPanel1.add(bunsikCartLB1);
		
		bunsikComboBox1 = new JComboBox();
		bunsikComboBox1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		bunsikComboBox1.setBounds(263, 117, 32, 23);
		bunsikPanel1.add(bunsikComboBox1);
		
		/*
		 * 해당 패널 클릭 시 어묵 상세보기로 이동
		 */
		JPanel bunsikPanel2 = new JPanel();
		bunsikPanel2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("어묵 상세보기로 이동");
			}
		});
		bunsikPanel2.setLayout(null);
		bunsikPanel2.setBounds(0, 167, 350, 167);
		add(bunsikPanel2);
		
		JLabel bunsikImageLB2 = new JLabel("");
		bunsikImageLB2.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\p_image8.jpg"));
		bunsikImageLB2.setBounds(0, 0, 236, 167);
		bunsikPanel2.add(bunsikImageLB2);
		
		JLabel bunsikNameLB2 = new JLabel("어묵");
		bunsikNameLB2.setHorizontalAlignment(SwingConstants.RIGHT);
		bunsikNameLB2.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		bunsikNameLB2.setBounds(229, 35, 109, 30);
		bunsikPanel2.add(bunsikNameLB2);
		
		JLabel bunsikPriceLB2 = new JLabel("\\ 4,000");
		bunsikPriceLB2.setHorizontalAlignment(SwingConstants.RIGHT);
		bunsikPriceLB2.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		bunsikPriceLB2.setBounds(263, 75, 75, 24);
		bunsikPanel2.add(bunsikPriceLB2);
		
		/*
		 * 해당 라벨 클릭 시 장바구니에 상품 추가
		 */
		JLabel bunsikCartLB2 = new JLabel("");
		bunsikCartLB2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		bunsikCartLB2 = new JLabel("");
		bunsikCartLB2.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\cart.png"));
		bunsikCartLB2.setBounds(311, 113, 27, 27);
		bunsikPanel2.add(bunsikCartLB2);
		
		bunsikComboBox2 = new JComboBox();
		bunsikComboBox2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		bunsikComboBox2.setBounds(263, 117, 32, 23);
		bunsikPanel2.add(bunsikComboBox2);
		
		/*
		 * 해당 패널 클릭 시 순대 상세보기로 이동
		 */
		JPanel bunsikPanel3 = new JPanel();
		bunsikPanel3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("순대 상세보기로 이동");
			}
		});
		bunsikPanel3.setLayout(null);
		bunsikPanel3.setBounds(0, 333, 350, 167);
		add(bunsikPanel3);
		
		JLabel bunsikImageLB3 = new JLabel("");
		bunsikImageLB3.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\p_image9.jpg"));
		bunsikImageLB3.setBounds(0, 0, 236, 167);
		bunsikPanel3.add(bunsikImageLB3);
		
		JLabel bunsikNameLB3 = new JLabel("순대");
		bunsikNameLB3.setHorizontalAlignment(SwingConstants.RIGHT);
		bunsikNameLB3.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		bunsikNameLB3.setBounds(229, 35, 109, 30);
		bunsikPanel3.add(bunsikNameLB3);
		
		JLabel bunsikPriceLB3 = new JLabel("\\ 6,000");
		bunsikPriceLB3.setHorizontalAlignment(SwingConstants.RIGHT);
		bunsikPriceLB3.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		bunsikPriceLB3.setBounds(263, 75, 75, 24);
		bunsikPanel3.add(bunsikPriceLB3);
		
		/*
		 * 해당 라벨 클릭 시 장바구니에 상품 추가
		 */
		JLabel bunsikCartLB3 = new JLabel("");
		bunsikCartLB3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		bunsikCartLB3 = new JLabel("");
		bunsikCartLB3.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\cart.png"));
		bunsikCartLB3.setBounds(311, 113, 27, 27);
		bunsikPanel3.add(bunsikCartLB3);
		
		bunsikComboBox3 = new JComboBox();
		bunsikComboBox3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		bunsikComboBox3.setBounds(263, 117, 32, 23);
		bunsikPanel3.add(bunsikComboBox3);

	}
}
