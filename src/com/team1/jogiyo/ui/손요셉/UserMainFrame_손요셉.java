package com.team1.jogiyo.ui.손요셉;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.team1.jogiyo.user.User;
import com.team1.jogiyo.user.UserService;

import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		userMainPane_손요셉.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		tabbedPane.addTab("메인", null, userMainPane_손요셉, null);
		
		UserLoginPane_손요셉 userLoginPane_손요셉 = new UserLoginPane_손요셉();
		tabbedPane.addTab("로그인", null, userLoginPane_손요셉, null);
		
		UserSignupPane_손요셉 userSignupPane_손요셉 = new UserSignupPane_손요셉();
		tabbedPane.addTab("회원가입", null, userSignupPane_손요셉, null);
		
		UserViewDetail_손요셉 userViewDetail_손요셉 = new UserViewDetail_손요셉();
		tabbedPane.addTab("회원정보", null, userViewDetail_손요셉, null);
	}
}
