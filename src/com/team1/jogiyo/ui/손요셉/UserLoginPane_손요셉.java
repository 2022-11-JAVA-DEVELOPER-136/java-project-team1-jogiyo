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
	private JButton loginbutton;
	private JButton signupbutton;
	private JPasswordField loginPasswordF;
	
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
						loginPasswordF.setText("비밀번호");
					}
				} catch (Exception e1) {
					e1.getMessage();
				}
				
			}
		});
		loginbutton.setIcon(new ImageIcon(UserLoginPane_손요셉.class.getResource("/images/로그인1.png")));
		loginbutton.setBounds(36, 368, 292, 41);
		add(loginbutton);
		
		signupbutton = new JButton("");
		signupbutton.setBackground(new Color(255, 255, 255));
		signupbutton.setIcon(new ImageIcon(UserLoginPane_손요셉.class.getResource("/images/제목 없는 디자인 (2) (1).png")));
		signupbutton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		signupbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//회원가입 화면으로 전환
				frame.changePanel(frame.USERSIGNUPPANE, null);
				
			}
		});
		signupbutton.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		signupbutton.setBounds(85, 430, 194, 32);
		add(signupbutton);
		

		
		loginIdTF = new JTextField();
		loginIdTF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				loginIdTF.setText("");
			}
		});
		loginIdTF.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		loginIdTF.setBounds(155, 264, 151, 32);
		add(loginIdTF);
		loginIdTF.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UserLoginPane_손요셉.class.getResource("/com/team1/jogiyo/ui/손요셉/image/1 (1) (2).png")));
		lblNewLabel.setBounds(85, 28, 194, 216);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setBounds(62, 264, 66, 32);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1.setBounds(62, 306, 66, 32);
		add(lblNewLabel_1_1);
		
		loginPasswordF = new JPasswordField();
		loginPasswordF.setBounds(155, 306, 151, 30);
		add(loginPasswordF);

	}
	
	
	private int userLogin() {
		int result=0;
		try {
			String id=loginIdTF.getText();
			String password=loginPasswordF.getText();
			result=frame.userService.login(id, password);
			if(result==1) {
				//로그인 성공시
				frame.loginUser=frame.userService.findUser(id);
				frame.setTitle(id+"님 로그인");
				loginIdTF.setEnabled(false);
				loginPasswordF.setEnabled(false);
				loginbutton.setEnabled(false);
				
			} else {
				JOptionPane.showMessageDialog(null,"아이디/비밀번호를 확인하세요.");
				loginIdTF.setText("아이디");
				loginIdTF.setSelectionStart(0);
				loginIdTF.setSelectionEnd(id.length());
				loginIdTF.requestFocus();
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
