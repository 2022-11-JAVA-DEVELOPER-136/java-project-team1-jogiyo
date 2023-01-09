package com.team1.jogiyo.ui.손요셉;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class UserMainFrame_손요셉 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserMainFrame_손요셉 frame = new UserMainFrame_손요셉();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserMainFrame_손요셉() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane);
		
		UserMainPane_손요셉 userMainPane_손요셉 = new UserMainPane_손요셉();
		tabbedPane.addTab("New tab", null, userMainPane_손요셉, null);
		
		UserLoginPane_손요셉 userLoginPane_손요셉 = new UserLoginPane_손요셉();
		tabbedPane.addTab("New tab", null, userLoginPane_손요셉, null);
		
		UserSignupPane_손요셉 userSignupPane_손요셉 = new UserSignupPane_손요셉();
		tabbedPane.addTab("New tab", null, userSignupPane_손요셉, null);
		
		UserViewDetail_손요셉 userViewDetail_손요셉 = new UserViewDetail_손요셉();
		tabbedPane.addTab("New tab", null, userViewDetail_손요셉, null);
	}
}
