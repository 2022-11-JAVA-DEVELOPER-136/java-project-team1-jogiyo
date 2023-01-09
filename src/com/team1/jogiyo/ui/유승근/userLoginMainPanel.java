package com.team1.jogiyo.ui.유승근;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.team1.jogiyo.user.User;
import com.team1.jogiyo.user.UserService;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class userLoginMainPanel extends JPanel {
	private JPasswordField userLoginPasswordTF;
	private JTextField userLoginIdTF;
	
	/*
	 * Service 객체 생성
	 */
	UserService userService=null;
	User user=null;
	
	/*********************************************/
	
	
	

	/**
	 * Create the panel.
	 * 
	 */
	public userLoginMainPanel() throws Exception {
		setBackground(new Color(204, 255, 204));
		setLayout(null);
		
		JLabel userLoginIdLB = new JLabel("아이디");
		userLoginIdLB.setBounds(39, 136, 57, 31);
		add(userLoginIdLB);
		
		JLabel userLoginPasswordLB = new JLabel("비밀번호");
		userLoginPasswordLB.setBounds(39, 216, 57, 15);
		add(userLoginPasswordLB);
		
		userLoginPasswordTF = new JPasswordField();
		userLoginPasswordTF.setBounds(132, 213, 163, 21);
		add(userLoginPasswordTF);
		
		userLoginIdTF = new JTextField();
		userLoginIdTF.setBounds(132, 141, 168, 21);
		add(userLoginIdTF);
		userLoginIdTF.setColumns(10);
		
		JButton userLoginBtn = new JButton("로그인");
		userLoginBtn.setBounds(39, 379, 112, 21);
		add(userLoginBtn);
		
		JButton userLoginJoinBtn = new JButton("회원가입");
		userLoginJoinBtn.setBounds(200, 378, 97, 23);
		add(userLoginJoinBtn);
		
		JButton userLoginFindIdPasswordBtn = new JButton("아이디/비밀번호 찾기");
		userLoginFindIdPasswordBtn.setBounds(78, 425, 200, 23);
		add(userLoginFindIdPasswordBtn);
		
		/****************************************/
		userService=new UserService();
		user=new User("aaaa", null, null, "주소", "폰넘버");
		
		findUser("aaaa");
	}
	
	private void findUser(String sUserId) throws Exception {
		userService.findUser(sUserId);

	}
}
