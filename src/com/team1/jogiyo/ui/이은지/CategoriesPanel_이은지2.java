package com.team1.jogiyo.ui.이은지;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import com.team1.jogiyo.ui.*;
import com.team1.jogiyo.user.User;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class CategoriesPanel_이은지2 extends JPanel {
	/**************************************/
	/*
	 * Service 객체선언
	 */
	User loginUser=null;
	JogiyoMainFrame frame;
	public void setFrame(JogiyoMainFrame frame) {
		this.frame = frame;
	}
	public void setUser(User loginUser) {
		this.loginUser=loginUser;
	}
	
	private JScrollPane categoriesListScrollPane;

	/**
	 * Create the panel.
	 */
	public CategoriesPanel_이은지2() {
		setLayout(null);
		
		categoriesListScrollPane = new JScrollPane();
		categoriesListScrollPane.setBounds(0, 503, 350, -501);
		add(categoriesListScrollPane);
		
		//패널생성
		JPanel hansikPanel = new JPanel();
		hansikPanel.setBounds(0, 0, 350, 166);
		add(hansikPanel);
		hansikPanel.setLayout(null);
		

		/*
		 * 클릭 시 한식리스트로 이동
		 */
		JLabel hansikLB = new JLabel("  한식");
		hansikLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("한식리스트로 이동");
				frame.changePanel(frame.HANSIKPANE, null);
			}
		});
		hansikLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hansikLB.setBounds(0, 0, 350, 166);
		hansikLB.setHorizontalAlignment(SwingConstants.CENTER);
		hansikPanel.add(hansikLB);
		hansikLB.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		hansikLB.setIcon(new ImageIcon("C:\\2022-11-JAVA-DEVELOPER\\git-repositories-home\\java-project-team1-jogiyo\\src\\images\\categories\\1한식 (2).png"));
		
		
		JPanel joongsikPanel = new JPanel();
		joongsikPanel.setBounds(0, 166, 350, 171);
		add(joongsikPanel);
		joongsikPanel.setLayout(null);
		
		/*
		 * 클릭 시 중식리스트로 이동
		 */
		JLabel joongsikLB = new JLabel("   중식");
		joongsikLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		joongsikLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("중식리스트로 이동");
				frame.changePanel(frame.JOONGSIKPANE,null);
			}
		});
		joongsikLB.setBounds(0, 0, 350, 166);
		joongsikLB.setIcon(new ImageIcon("C:\\2022-11-JAVA-DEVELOPER\\git-repositories-home\\java-project-team1-jogiyo\\src\\images\\categories\\1중식.png"));
		joongsikLB.setHorizontalAlignment(SwingConstants.CENTER);
		joongsikLB.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		joongsikPanel.add(joongsikLB);
		
		JPanel bunsikPanel = new JPanel();
		bunsikPanel.setBounds(0, 334, 350, 166);
		add(bunsikPanel);
		bunsikPanel.setLayout(null);
		
		/*
		 * 클릭 시 분식리스트로 이동
		 */
		JLabel bunsikLB = new JLabel("  분식");
		bunsikLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bunsikLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("분식리스트로 이동");
				frame.changePanel(frame.BUNSIKPANE, null);
			}
		});
		bunsikLB.setBounds(0, 0, 350, 166);
		bunsikLB.setIcon(new ImageIcon("C:\\2022-11-JAVA-DEVELOPER\\git-repositories-home\\java-project-team1-jogiyo\\src\\images\\categories\\1분식.png"));
		bunsikLB.setHorizontalAlignment(SwingConstants.CENTER);
		bunsikLB.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		bunsikPanel.add(bunsikLB);

	}
	
	
	
}
