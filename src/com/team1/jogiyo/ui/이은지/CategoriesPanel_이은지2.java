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
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class CategoriesPanel_이은지2 extends JPanel {
	
	private JScrollPane categoriesListScrollPane;

	/**
	 * Create the panel.
	 */
	public CategoriesPanel_이은지2() {
		setLayout(null);
		
		categoriesListScrollPane = new JScrollPane();
		categoriesListScrollPane.setBounds(0, 503, 350, -501);
		add(categoriesListScrollPane);
		
		/*
		 * 해당 패널 클릭 시 한식리스트 보기
		 */
		JPanel hansikPanel = new JPanel();
		hansikPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hansikPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("한식리스트로 이동");
			}
		});
		hansikPanel.setBounds(0, 0, 350, 166);
		add(hansikPanel);
		hansikPanel.setLayout(null);
		
		JLabel hansikLB = new JLabel("  한식");
		hansikLB.setBounds(0, 0, 350, 166);
		hansikLB.setHorizontalAlignment(SwingConstants.CENTER);
		hansikPanel.add(hansikLB);
		hansikLB.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		hansikLB.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\1한식 (2).png"));
		
		/*
		 * 해당 패널 클릭 시 중식리스트 보기
		 */
		JPanel joongsikPanel = new JPanel();
		joongsikPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		joongsikPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("중식리스트로 이동");
			}
		});
		joongsikPanel.setBounds(0, 166, 350, 171);
		add(joongsikPanel);
		joongsikPanel.setLayout(null);
		
		JLabel joongsikLB = new JLabel("   중식");
		joongsikLB.setBounds(0, 0, 350, 166);
		joongsikLB.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\1중식.png"));
		joongsikLB.setHorizontalAlignment(SwingConstants.CENTER);
		joongsikLB.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		joongsikPanel.add(joongsikLB);
		
		/*
		 * 해당 패널 클릭 시 분식리스트 보기
		 */
		JPanel bunsikPanel = new JPanel();
		bunsikPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bunsikPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("분식리스트로 이동");
			}
		});
		bunsikPanel.setBounds(0, 334, 350, 166);
		add(bunsikPanel);
		bunsikPanel.setLayout(null);
		
		JLabel bunsikLB = new JLabel("  분식");
		bunsikLB.setBounds(0, 0, 350, 166);
		bunsikLB.setIcon(new ImageIcon("C:\\Users\\itwill\\Downloads\\1분식.png"));
		bunsikLB.setHorizontalAlignment(SwingConstants.CENTER);
		bunsikLB.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		bunsikPanel.add(bunsikLB);

	}
	
}
