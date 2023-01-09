package com.team1.jogiyo.ui.유승근;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class userLoginMainPanel extends JPanel {
	private JPasswordField userLoginPasswordTF;
	private JTextField userLoginIdTF;

	/**
	 * Create the panel.
	 */
	public userLoginMainPanel() {
		setBackground(new Color(204, 255, 204));
		setLayout(null);
		
		JLabel userLoginIdLB = new JLabel("아이디");
		userLoginIdLB.setBounds(52, 136, 112, 31);
		add(userLoginIdLB);
		
		JLabel userLoginPasswordLB = new JLabel("비밀번호");
		userLoginPasswordLB.setBounds(52, 216, 57, 15);
		add(userLoginPasswordLB);
		
		userLoginPasswordTF = new JPasswordField();
		userLoginPasswordTF.setBounds(181, 213, 163, 21);
		add(userLoginPasswordTF);
		
		userLoginIdTF = new JTextField();
		userLoginIdTF.setBounds(176, 141, 168, 21);
		add(userLoginIdTF);
		userLoginIdTF.setColumns(10);
		
		JButton userLoginBtn = new JButton("로그인");
		userLoginBtn.setBounds(63, 394, 112, 21);
		add(userLoginBtn);
		
		JButton userLoginJoinBtn = new JButton("회원가입");
		userLoginJoinBtn.setBounds(217, 393, 97, 23);
		add(userLoginJoinBtn);
		
		JButton userLoginFindIdPasswordBtn = new JButton("아이디/비밀번호 찾기");
		userLoginFindIdPasswordBtn.setBounds(100, 430, 200, 23);
		add(userLoginFindIdPasswordBtn);

	}
}
