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
	private JTextField loginIdTF;
	private JTextField loginPasswordTF;
	private JButton loginbutton;
	private JButton signupbutton;
	private JButton idfindbutton;
	/**
	 * Create the panel.
	 */
	public UserLoginPane_손요셉() {
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		setLayout(null);
		
		loginbutton = new JButton("");//로그인버튼
		loginbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//카테고리 화면 전환
				
			}
		});
		loginbutton.setIcon(new ImageIcon(UserLoginPane_손요셉.class.getResource("/com/team1/jogiyo/ui/손요셉/image/smile (3) (1).png")));
		loginbutton.setBounds(0, 369, 350, 42);
		add(loginbutton);
		
		signupbutton = new JButton("회원가입");
		signupbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//회원가입으로 화면 전환
			}
		});
		signupbutton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		signupbutton.setBounds(25, 439, 97, 23);
		add(signupbutton);
		
		idfindbutton = new JButton("아이디/비밀번호찾기");
		idfindbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//??
			}
		});
		idfindbutton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		idfindbutton.setBounds(167, 439, 163, 23);
		add(idfindbutton);
		
		loginIdTF = new JTextField();
		loginIdTF.setText("아이디");
		loginIdTF.setFont(new Font("굴림", Font.PLAIN, 16));
		loginIdTF.setBounds(85, 264, 194, 32);
		add(loginIdTF);
		loginIdTF.setColumns(10);
		
		loginPasswordTF = new JTextField();
		loginPasswordTF.setFont(new Font("굴림", Font.PLAIN, 16));
		loginPasswordTF.setText("비밀번호");
		loginPasswordTF.setBounds(85, 306, 194, 32);
		add(loginPasswordTF);
		loginPasswordTF.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UserLoginPane_손요셉.class.getResource("/com/team1/jogiyo/ui/손요셉/image/1 (1) (2).png")));
		lblNewLabel.setBounds(85, 0, 194, 216);
		add(lblNewLabel);
		
	
		
	}
}
