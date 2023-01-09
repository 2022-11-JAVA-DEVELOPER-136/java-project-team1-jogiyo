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

public class HansikPanel extends JPanel {
	private final JPanel hansikMenuPanel = new JPanel();

	/**
	 * Create the panel.
	 */
	public HansikPanel() {
		setLayout(null);
		
		JScrollPane hansikListScrollPane = new JScrollPane();
		hansikListScrollPane.setBounds(0, 498, 350, -496);
		add(hansikListScrollPane);
		hansikMenuPanel.setBounds(0, 0, 350, 167);
		add(hansikMenuPanel);
		hansikMenuPanel.setLayout(null);
		
		/*
		 * 해당 패널 클릭 시 상품 상세보기로 이동
		 */
		JLabel hansikImageLB = new JLabel("");
		hansikImageLB.setBounds(0, 0, 251, 167);
		hansikImageLB.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\p_image1 (2).jpg"));
		hansikMenuPanel.add(hansikImageLB);
		
		
		JLabel hansikNameLB = new JLabel("순대국밥");
		hansikNameLB.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		hansikNameLB.setBounds(229, 49, 109, 30);
		hansikNameLB.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikMenuPanel.add(hansikNameLB);
		
		JLabel hansikPriceLB = new JLabel("\\ 9,000");
		hansikPriceLB.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		hansikPriceLB.setHorizontalAlignment(SwingConstants.RIGHT);
		hansikPriceLB.setBounds(263, 89, 75, 24);
		hansikMenuPanel.add(hansikPriceLB);

	}
}
