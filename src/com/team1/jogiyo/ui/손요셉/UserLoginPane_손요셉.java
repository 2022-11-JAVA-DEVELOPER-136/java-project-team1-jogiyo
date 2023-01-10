 package com.team1.jogiyo.ui.손요셉;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import com.team1.jogiyo.user.User;
import com.team1.jogiyo.user.UserService;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;



public class UserLoginPane_손요셉 extends JPanel {
	private UserService userService;
	private User loginUser;
	
	private JTextField loginIdTF;
	private JTextField loginPasswordTF;
	private JButton loginbutton;
	private JButton signupbutton;
	private JButton idfindbutton;
	
	//객체 선언
	
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
				//카테고리 화면으로 전환
				try {
					userLogin();
					if(userLogin()==1) {
						loginProcess(loginIdTF.getText());
					}
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
				
			}
		});
		loginbutton.setIcon(new ImageIcon(UserLoginPane_손요셉.class.getResource("/com/team1/jogiyo/ui/손요셉/image/smile (3) (1).png")));
		loginbutton.setBounds(0, 369, 350, 42);
		add(loginbutton);
		
		signupbutton = new JButton("회원가입");
		signupbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//회원가입 화면으로 전환
				
			}
		});
		signupbutton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		signupbutton.setBounds(25, 439, 97, 23);
		add(signupbutton);
		
		idfindbutton = new JButton("아이디/비밀번호찾기");
		idfindbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//안살릴듯?
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
	private int userLogin() {
		int result=0;
		try {
			String id=loginIdTF.getText();
			String password=loginPasswordTF.getText();
			result=userService.login(id, password);
			
			if(result==1) {
				//로그인 성공시
				loginProcess(id);
				loginIdTF.setText("");
				loginPasswordTF.setText("");
			} else {
				JOptionPane.showMessageDialog(null,"아이디/비밀번호를 확인하세요.");
				loginIdTF.setSelectionStart(0);
				loginIdTF.setSelectionEnd(id.length());
				loginIdTF.requestFocus();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
	private void loginProcess(String sUserid) throws Exception{
		this.loginUser=userService.findUser(sUserid);
	}
}
