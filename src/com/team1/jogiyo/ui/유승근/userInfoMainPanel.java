package com.team1.jogiyo.ui.유승근;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class userInfoMainPanel extends JPanel {
	private JTextField userInfoIdTF;
	private JPasswordField passwordField;
	private JTextField userInfoNameTF;
	private JTextField userInfoAddressTF;
	private JTextField userInfoPhoneTF;

	/**
	 * Create the panel.
	 */
	public userInfoMainPanel() {
		setBackground(new Color(255, 128, 128));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(35, 98, 57, 15);
		add(lblNewLabel);
		
		userInfoIdTF = new JTextField();
		userInfoIdTF.setColumns(10);
		userInfoIdTF.setBounds(132, 95, 116, 21);
		add(userInfoIdTF);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(132, 139, 151, 21);
		add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(35, 142, 57, 15);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(35, 189, 57, 15);
		add(lblNewLabel_2);
		
		userInfoNameTF = new JTextField();
		userInfoNameTF.setColumns(10);
		userInfoNameTF.setBounds(132, 186, 116, 21);
		add(userInfoNameTF);
		
		userInfoAddressTF = new JTextField();
		userInfoAddressTF.setColumns(10);
		userInfoAddressTF.setBounds(132, 233, 116, 21);
		add(userInfoAddressTF);
		
		JLabel lblNewLabel_3 = new JLabel("주소");
		lblNewLabel_3.setBounds(35, 236, 57, 15);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("전화번호");
		lblNewLabel_4.setBounds(35, 286, 57, 15);
		add(lblNewLabel_4);
		
		userInfoPhoneTF = new JTextField();
		userInfoPhoneTF.setColumns(10);
		userInfoPhoneTF.setBounds(132, 283, 116, 21);
		add(userInfoPhoneTF);
		
		JButton userInfoIdBtn = new JButton("수정");
		userInfoIdBtn.setBounds(35, 392, 97, 23);
		add(userInfoIdBtn);
		
		JButton userInfoIdCancelBtn = new JButton("취소");
		userInfoIdCancelBtn.setBounds(198, 392, 97, 23);
		add(userInfoIdCancelBtn);

	}

}
