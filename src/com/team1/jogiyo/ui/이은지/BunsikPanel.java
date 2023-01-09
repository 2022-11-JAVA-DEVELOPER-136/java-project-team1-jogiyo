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

public class BunsikPanel extends JPanel {
	private final JPanel bunsikPanel = new JPanel();

	/**
	 * Create the panel.
	 */
	public BunsikPanel() {
		setLayout(null);
		
		/*
		 * 해당 패널 클릭 시 상품 상세보기로 이동
		 */
		JScrollPane bunsikListScrollPane = new JScrollPane();
		bunsikListScrollPane.setBounds(0, 498, 350, -496);
		add(bunsikListScrollPane);
		bunsikPanel.setBounds(0, 0, 350, 167);
		add(bunsikPanel);
		bunsikPanel.setLayout(null);
		
		JLabel bunsikImageLB = new JLabel("");
		bunsikImageLB.setBounds(0, 0, 236, 167);
		bunsikImageLB.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\p_image7.jpg"));
		bunsikPanel.add(bunsikImageLB);
		
		JLabel bunsikNameLB = new JLabel("떡볶이");
		bunsikNameLB.setBounds(238, 49, 100, 34);
		bunsikNameLB.setHorizontalAlignment(SwingConstants.RIGHT);
		bunsikNameLB.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		bunsikPanel.add(bunsikNameLB);
		
		JLabel bunsikPriceLB = new JLabel("\\ 5,000");
		bunsikPriceLB.setBounds(287, 93, 51, 21);
		bunsikPriceLB.setHorizontalAlignment(SwingConstants.RIGHT);
		bunsikPriceLB.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		bunsikPanel.add(bunsikPriceLB);

	}
}
