package com.team1.jogiyo.ui.유승근;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class userJoinMainPanel extends JPanel {
	private JPasswordField passwordField;
	private JTextField userJoinIdTF;
	private JTextField userJoinnameTF;
	private JTextField userJoinAddressTF;
	private JTextField userJoinPhoneTF;

	/**
	 * Create the panel.
	 */
	public userJoinMainPanel() {
		setBackground(new Color(255, 255, 128));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(42, 93, 57, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(42, 137, 57, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(42, 184, 57, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("주소");
		lblNewLabel_3.setBounds(42, 231, 57, 15);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("전화번호");
		lblNewLabel_4.setBounds(42, 281, 57, 15);
		add(lblNewLabel_4);
		
		JButton userJoinBtn = new JButton("회원가입");
		userJoinBtn.setBounds(67, 387, 97, 23);
		add(userJoinBtn);
		
		JButton userJoinCancelBtn = new JButton("취소");
		userJoinCancelBtn.setBounds(211, 387, 97, 23);
		add(userJoinCancelBtn);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(157, 134, 151, 21);
		add(passwordField);
		
		userJoinIdTF = new JTextField();
		userJoinIdTF.setBounds(157, 90, 116, 21);
		add(userJoinIdTF);
		userJoinIdTF.setColumns(10);
		
		userJoinnameTF = new JTextField();
		userJoinnameTF.setBounds(157, 181, 116, 21);
		add(userJoinnameTF);
		userJoinnameTF.setColumns(10);
		
		userJoinAddressTF = new JTextField();
		userJoinAddressTF.setBounds(157, 228, 116, 21);
		add(userJoinAddressTF);
		userJoinAddressTF.setColumns(10);
		
		userJoinPhoneTF = new JTextField();
		userJoinPhoneTF.setBounds(157, 278, 116, 21);
		add(userJoinPhoneTF);
		userJoinPhoneTF.setColumns(10);
		
		JButton userJoinFindIdBtn = new JButton("중복확인");
		userJoinFindIdBtn.setBounds(291, 89, 97, 23);
		add(userJoinFindIdBtn);

	}

}
