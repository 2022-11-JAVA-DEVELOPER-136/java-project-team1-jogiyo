 package com.team1.jogiyo.ui.손요셉;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import com.team1.jogiyo.ui.JogiyoMainFrame;
import com.team1.jogiyo.user.User;
import com.team1.jogiyo.user.UserService;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class UserLoginPane_손요셉 extends JPanel {
	JogiyoMainFrame frame;
	public void setFrame(JogiyoMainFrame frame) {
		this.frame = frame;
	}
	User loginUser=null;
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
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		loginbutton = new JButton("");//로그인버튼
		loginbutton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		loginbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//카테고리 화면으로 전환
				
				try {
					if(userLogin()==1) {
						frame.changePanel(frame.PRODUCTCATEGORYPANE,loginProcess(loginIdTF.getText()));
						loginIdTF.setText("아이디");
						loginPasswordTF.setText("비밀번호");
					}
				} catch (Exception e1) {
					e1.getMessage();
				}
				
			}
		});
		loginbutton.setIcon(new ImageIcon(UserLoginPane_손요셉.class.getResource("/com/team1/jogiyo/ui/손요셉/image/smile (3) (1).png")));
		loginbutton.setBounds(42, 367, 291, 42);
		add(loginbutton);
		
		signupbutton = new JButton("회원가입");
		signupbutton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		signupbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//회원가입 화면으로 전환
				frame.changePanel(frame.USERSIGNUPPANE, null);
				
			}
		});
		signupbutton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		signupbutton.setBounds(42, 439, 97, 23);
		add(signupbutton);
		
		idfindbutton = new JButton("로그아웃");
		idfindbutton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		idfindbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}	
		});
		idfindbutton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		idfindbutton.setBounds(220, 439, 113, 23);
		add(idfindbutton);
		
		loginIdTF = new JTextField();
		loginIdTF.setText("아이디");
		loginIdTF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				loginIdTF.setText("");
			}
		});
		loginIdTF.setFont(new Font("굴림", Font.PLAIN, 16));
		loginIdTF.setBounds(85, 264, 194, 32);
		add(loginIdTF);
		loginIdTF.setColumns(10);
		
		loginPasswordTF = new JTextField();
		loginPasswordTF.setText("비밀번호");
		loginPasswordTF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				loginPasswordTF.setText("");
			}
		});
		loginPasswordTF.setFont(new Font("굴림", Font.PLAIN, 16));
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
			result=frame.userService.login(id, password);
			if(result==1) {
				//로그인 성공시
				frame.loginUser=frame.userService.findUser(id);
				frame.setTitle(id+"님 로그인");
			} else {
				JOptionPane.showMessageDialog(null,"아이디/비밀번호를 확인하세요.");
				loginIdTF.setText("아이디");
				loginIdTF.setSelectionStart(0);
				loginIdTF.setSelectionEnd(id.length());
				loginIdTF.requestFocus();
				loginPasswordTF.setText("비밀번호");
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return result;
	}
	private User loginProcess(String sUserid) throws Exception{
		 return frame.userService.findUser(sUserid);
	}
	
}
