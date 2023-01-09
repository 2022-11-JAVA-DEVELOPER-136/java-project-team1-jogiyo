package com.team1.jogiyo.ui.손요셉;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;



public class UserLoginPane_손요셉 extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Create the panel.
	 */
	public UserLoginPane_손요셉() {
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		setLayout(null);
		
		JButton loginbutton = new JButton("");//로그인버튼
		loginbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//카테고리 화면 전환
				
			}
		});
		loginbutton.setIcon(new ImageIcon(UserLoginPane_손요셉.class.getResource("/com/team1/jogiyo/ui/손요셉/image/smile (3) (1).png")));
		loginbutton.setBounds(0, 369, 350, 42);
		add(loginbutton);
		
		JButton signupbutton = new JButton("회원가입");
		signupbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//회원가입으로 화면 전환
			}
		});
		signupbutton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		signupbutton.setBounds(25, 439, 97, 23);
		add(signupbutton);
		
		JButton idfindbutton = new JButton("아이디/비밀번호찾기");
		idfindbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//??
			}
		});
		idfindbutton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		idfindbutton.setBounds(167, 439, 163, 23);
		add(idfindbutton);
		
		textField = new JTextField();
		textField.setText("아이디");
		textField.setFont(new Font("굴림", Font.PLAIN, 16));
		textField.setBounds(85, 264, 194, 32);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("굴림", Font.PLAIN, 16));
		textField_1.setText("비밀번호");
		textField_1.setBounds(85, 306, 194, 32);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UserLoginPane_손요셉.class.getResource("/com/team1/jogiyo/ui/손요셉/image/1 (1) (2).png")));
		lblNewLabel.setBounds(85, 0, 194, 216);
		add(lblNewLabel);
		
	
		
	}
}
