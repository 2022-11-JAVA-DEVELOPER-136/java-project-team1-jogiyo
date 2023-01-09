package com.team1.jogiyo.ui.손요셉;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserViewDetail_손요셉 extends JPanel {
	private JTextField txtVjvjdid;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public UserViewDetail_손요셉() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UserViewDetail_손요셉.class.getResource("/com/team1/jogiyo/ui/손요셉/image/free-icon-user-profile-5951752 (1).png")));
		lblNewLabel.setBounds(40, 77, 80, 85);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setIcon(new ImageIcon(UserViewDetail_손요셉.class.getResource("/com/team1/jogiyo/ui/손요셉/image/free-icon-house-1009900.png")));
		lblNewLabel_1.setBounds(51, 285, 20, 20);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(UserViewDetail_손요셉.class.getResource("/com/team1/jogiyo/ui/손요셉/image/free-icon-mobile-phone-7513561.png")));
		lblNewLabel_2.setBounds(51, 336, 20, 20);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(UserViewDetail_손요셉.class.getResource("/com/team1/jogiyo/ui/손요셉/image/free-icon-name-1828439.png")));
		lblNewLabel_3.setBounds(51, 238, 27, 20);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(UserViewDetail_손요셉.class.getResource("/com/team1/jogiyo/ui/손요셉/image/free-icon-password-6772359.png")));
		lblNewLabel_4.setBounds(51, 193, 27, 15);
		add(lblNewLabel_4);
		
		txtVjvjdid = new JTextField();
		txtVjvjdid.setFont(new Font("Arial Black", Font.BOLD, 20));
		txtVjvjdid.setText("vjvjdid");
		txtVjvjdid.setBounds(132, 94, 146, 52);
		add(txtVjvjdid);
		txtVjvjdid.setColumns(10);
		
		textField = new JTextField();
		textField.setText("비밀번호");
		textField.setBounds(89, 187, 146, 21);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("이름");
		textField_1.setColumns(10);
		textField_1.setBounds(89, 237, 146, 21);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("주소");
		textField_2.setColumns(10);
		textField_2.setBounds(89, 284, 146, 21);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("핸드폰번호");
		textField_3.setColumns(10);
		textField_3.setBounds(89, 336, 146, 21);
		add(textField_3);
		
		JButton btnNewButton = new JButton("수정");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//수정클릭시 SQL 정보 업데이트
			}
		});
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnNewButton.setBounds(40, 406, 97, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//취소시 로그인 화면으로 전환
			}
		});
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		btnNewButton_1.setBounds(202, 406, 97, 23);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_5 = new JLabel("회원정보/수정");
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		lblNewLabel_5.setBounds(119, 21, 122, 23);
		add(lblNewLabel_5);

	}

}
