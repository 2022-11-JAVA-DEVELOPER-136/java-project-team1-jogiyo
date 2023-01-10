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

public class JoongsikPanel_이은지 extends JPanel {
	/*
	 * 해당 패널 클릭 시 자장면 상세보기로 이동
	 */
	private final JPanel joongsikMenuPanel1 = new JPanel();

	/**
	 * Create the panel.
	 */
	public JoongsikPanel_이은지() {
		setLayout(null);
		
		JScrollPane joongsikListScrollPane = new JScrollPane();
		joongsikListScrollPane.setBounds(0, 498, 350, -496);
		add(joongsikListScrollPane);
		joongsikMenuPanel1.setBounds(0, 0, 350, 167);
		add(joongsikMenuPanel1);
		joongsikMenuPanel1.setLayout(null);
		
		JLabel joongsikImageLB1 = new JLabel("");
		joongsikImageLB1.setBounds(0, 0, 229, 167);
		joongsikImageLB1.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\p_image4.jpg"));
		joongsikMenuPanel1.add(joongsikImageLB1);
		
		JLabel hansikNameLB1 = new JLabel("자장면");
		hansikNameLB1.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikNameLB1.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		hansikNameLB1.setBounds(229, 36, 109, 30);
		joongsikMenuPanel1.add(hansikNameLB1);
		
		JLabel hansikPriceLB1 = new JLabel("\\ 8,000");
		hansikPriceLB1.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikPriceLB1.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		hansikPriceLB1.setBounds(263, 76, 75, 24);
		joongsikMenuPanel1.add(hansikPriceLB1);
		
		/*
		 * 해당 라벨 클릭 시 장바구니에 상품 추가
		 */
		JLabel joongsikCartLB1 = new JLabel("");
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
		joongsikImageLB2.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\p_image5.jpg"));
		joongsikImageLB2.setBounds(0, 0, 229, 167);
		joongsikMenuPanel2.add(joongsikImageLB2);
		
		JLabel hansikNameLB2 = new JLabel("삼선짬뽕");
		hansikNameLB2.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikNameLB2.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		hansikNameLB2.setBounds(229, 36, 109, 30);
		joongsikMenuPanel2.add(hansikNameLB2);
		
		JLabel hansikPriceLB2 = new JLabel("\\ 12,000");
		hansikPriceLB2.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikPriceLB2.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		hansikPriceLB2.setBounds(263, 76, 75, 24);
		joongsikMenuPanel2.add(hansikPriceLB2);
		
		/*
		 * 해당 라벨 클릭 시 장바구니에 상품 추가
		 */
		JLabel joongsikCartLB2 = new JLabel("");
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
		joongsikImageLB3.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\p_image6.jpg"));
		joongsikImageLB3.setBounds(0, 0, 229, 167);
		joongsikMenuPanel3.add(joongsikImageLB3);
		
		JLabel hansikNameLB3 = new JLabel("탕수육");
		hansikNameLB3.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikNameLB3.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		hansikNameLB3.setBounds(229, 36, 109, 30);
		joongsikMenuPanel3.add(hansikNameLB3);
		
		JLabel hansikPriceLB3 = new JLabel("\\ 25,000");
		hansikPriceLB3.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikPriceLB3.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		hansikPriceLB3.setBounds(263, 76, 75, 24);
		joongsikMenuPanel3.add(hansikPriceLB3);
		
		/*
		 * 해당 라벨 클릭 시 장바구니에 상품 추가
		 */
		JLabel joongsikCartLB3 = new JLabel("");
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

	}
}
