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
	private JTextField idTF;
	private JTextField passwordTF;
	private JTextField nameTF;
	private JTextField addressTF;
	private JTextField phoneTF;
	private JButton joinBtn;
	private JButton cancelBtn;
	private JButton idcheakBtn;

	/**
	 * Create the panel.
	 */
	public UserSignupPane_손요셉() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblNewLabel_ID = new JLabel("아이디");
		lblNewLabel_ID.setBounds(37, 131, 57, 15);
		add(lblNewLabel_ID);
		
		idTF = new JTextField();
		idTF.setBounds(106, 128, 142, 21);
		add(idTF);
		idTF.setColumns(10);
		
		JLabel lblNewLabel_password = new JLabel("비밀번호");
		lblNewLabel_password.setBounds(37, 177, 57, 15);
		add(lblNewLabel_password);
		
		passwordTF = new JTextField();
		passwordTF.setColumns(10);
		passwordTF.setBounds(106, 174, 142, 21);
		add(passwordTF);
		
		JLabel lblNewLabel_name = new JLabel("이름");
		lblNewLabel_name.setBounds(37, 227, 57, 15);
		add(lblNewLabel_name);
		
		nameTF = new JTextField();
		nameTF.setColumns(10);
		nameTF.setBounds(106, 224, 142, 21);
		add(nameTF);
		
		JLabel lblNewLabel_loc = new JLabel("주소");
		lblNewLabel_loc.setBounds(37, 275, 57, 15);
		add(lblNewLabel_loc);
		
		addressTF = new JTextField();
		addressTF.setColumns(10);
		addressTF.setBounds(106, 272, 142, 21);
		add(addressTF);
		
		JLabel lblNewLabel_phone = new JLabel("핸드폰번호");
		lblNewLabel_phone.setBounds(23, 331, 71, 15);
		add(lblNewLabel_phone);
		
		phoneTF = new JTextField();
		phoneTF.setColumns(10);
		phoneTF.setBounds(106, 328, 142, 21);
		add(phoneTF);
		
		idcheakBtn = new JButton("중복확인");
		idcheakBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//중복확인 사용가능 or 불가능합니다
			}
		});
		idcheakBtn.setBounds(256, 127, 82, 23);
		add(idcheakBtn);
		
		joinBtn = new JButton("가입");
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//가입시 SQL로 정보 보내고 가입완료시 로그인창으로 화면전환
			}
		});
		joinBtn.setBounds(37, 412, 97, 23);
		add(joinBtn);
		
		cancelBtn = new JButton("취소");
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//취소시 로그인창으로 화면전환 
			}
		});
		cancelBtn.setBounds(199, 412, 97, 23);
		add(cancelBtn);
		
		JLabel lblNewLabel_로고 = new JLabel("");
		lblNewLabel_로고.setIcon(new ImageIcon("C:\\Program Files\\2022-11-java\\git-reposi\\java-project-team1-jogiyo\\bin\\com\\team1\\jogiyo\\ui\\손요셉\\image\\smile (4).png"));
		lblNewLabel_로고.setBounds(119, 21, 93, 67);
		add(lblNewLabel_로고);

	}

}
