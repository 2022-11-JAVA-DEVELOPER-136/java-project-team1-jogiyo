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

public class JoongsikPanel extends JPanel {
	private final JPanel joongsikMenuPanel = new JPanel();

	/**
	 * Create the panel.
	 */
	public JoongsikPanel() {
		setLayout(null);
		
		JScrollPane joongsikListScrollPane = new JScrollPane();
		joongsikListScrollPane.setBounds(0, 498, 350, -496);
		add(joongsikListScrollPane);
		joongsikMenuPanel.setBounds(0, 0, 350, 167);
		add(joongsikMenuPanel);
		joongsikMenuPanel.setLayout(null);
		
		/*
		 * 해당 패널 클릭 시 상품 상세보기로 이동
		 */
		JLabel joongsikImageLB = new JLabel("");
		joongsikImageLB.setBounds(0, 0, 229, 167);
		joongsikImageLB.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\p_image4.jpg"));
		joongsikMenuPanel.add(joongsikImageLB);
		
		JLabel joongsikNameLB = new JLabel("자장면");
		joongsikNameLB.setHorizontalAlignment(SwingConstants.RIGHT);
		joongsikNameLB.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		joongsikNameLB.setBounds(229, 49, 109, 30);
		joongsikMenuPanel.add(joongsikNameLB);
		
		JLabel joongsikPriceLB = new JLabel("\\ 8,000");
		joongsikPriceLB.setHorizontalAlignment(SwingConstants.RIGHT);
		joongsikPriceLB.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		joongsikPriceLB.setBounds(263, 89, 75, 24);
		joongsikMenuPanel.add(joongsikPriceLB);

	}
}
