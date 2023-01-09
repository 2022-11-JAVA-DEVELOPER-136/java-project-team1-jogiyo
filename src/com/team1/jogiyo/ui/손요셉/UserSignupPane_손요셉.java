package com.team1.jogiyo.ui.손요셉;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class UserSignupPane_손요셉 extends JPanel {
	private JTextField textField_id;
	private JTextField textField_password;
	private JTextField textField_name;
	private JTextField textField_loc;
	private JTextField textField_phone;

	/**
	 * Create the panel.
	 */
	public UserSignupPane_손요셉() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblNewLabel_ID = new JLabel("아이디");
		lblNewLabel_ID.setBounds(37, 131, 57, 15);
		add(lblNewLabel_ID);
		
		textField_id = new JTextField();
		textField_id.setBounds(106, 128, 142, 21);
		add(textField_id);
		textField_id.setColumns(10);
		
		JLabel lblNewLabel_password = new JLabel("비밀번호");
		lblNewLabel_password.setBounds(37, 177, 57, 15);
		add(lblNewLabel_password);
		
		textField_password = new JTextField();
		textField_password.setColumns(10);
		textField_password.setBounds(106, 174, 142, 21);
		add(textField_password);
		
		JLabel lblNewLabel_name = new JLabel("이름");
		lblNewLabel_name.setBounds(37, 227, 57, 15);
		add(lblNewLabel_name);
		
		textField_name = new JTextField();
		textField_name.setColumns(10);
		textField_name.setBounds(106, 224, 142, 21);
		add(textField_name);
		
		JLabel lblNewLabel_loc = new JLabel("주소");
		lblNewLabel_loc.setBounds(37, 275, 57, 15);
		add(lblNewLabel_loc);
		
		textField_loc = new JTextField();
		textField_loc.setColumns(10);
		textField_loc.setBounds(106, 272, 142, 21);
		add(textField_loc);
		
		JLabel lblNewLabel_phone = new JLabel("핸드폰번호");
		lblNewLabel_phone.setBounds(23, 331, 71, 15);
		add(lblNewLabel_phone);
		
		textField_phone = new JTextField();
		textField_phone.setColumns(10);
		textField_phone.setBounds(106, 328, 142, 21);
		add(textField_phone);
		
		JButton btnNewButton = new JButton("중복확인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//중복확인 사용가능 or 불가능합니다
			}
		});
		btnNewButton.setBounds(256, 127, 82, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("가입");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//가입시 SQL로 정보 보내고 가입완료시 로그인창으로 화면전환
			}
		});
		btnNewButton_1.setBounds(37, 412, 97, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("취소");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//취소시 로그인창으로 화면전환 
			}
		});
		btnNewButton_2.setBounds(199, 412, 97, 23);
		add(btnNewButton_2);
		
		JLabel lblNewLabel_로고 = new JLabel("");
		lblNewLabel_로고.setIcon(new ImageIcon(UserSignupPane_손요셉.class.getResource("/com/team1/jogiyo/ui/손요셉/image/smile (4) (1).png")));
		lblNewLabel_로고.setBounds(129, 38, 93, 45);
		add(lblNewLabel_로고);

	}

}
