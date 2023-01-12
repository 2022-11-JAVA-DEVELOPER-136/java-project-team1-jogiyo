package com.team1.jogiyo.ui.손요셉;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.team1.jogiyo.order.OrderService;
import com.team1.jogiyo.ui.JogiyoMainFrame;
import com.team1.jogiyo.user.User;
import com.team1.jogiyo.user.UserService;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class UserSignupPane_손요셉 extends JPanel {
	JogiyoMainFrame frame;
	User loginUser=null;
	public void setFrame(JogiyoMainFrame frame) {
		this.frame = frame;
	}
	public void setUser(User loginUser) {
		this.loginUser=loginUser;
	}
	
	private JTextField idTF;
	private JTextField passwordTF;
	private JTextField nameTF;
	private JTextField addressTF;
	private JTextField phoneTF;
	private JButton joinBtn;
	private JButton cancelBtn;
	private JButton idcheakBtn;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public UserSignupPane_손요셉() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JLabel lblNewLabel_ID = new JLabel("아이디");
		lblNewLabel_ID.setBounds(22, 131, 57, 15);
		add(lblNewLabel_ID);
		
		idTF = new JTextField();
		idTF.setBounds(116, 128, 132, 21);
		add(idTF);
		idTF.setColumns(10);
		
		JLabel lblNewLabel_password = new JLabel("비밀번호");
		lblNewLabel_password.setBounds(22, 171, 57, 15);
		add(lblNewLabel_password);
		
		passwordTF = new JTextField();
		passwordTF.setColumns(10);
		passwordTF.setBounds(116, 168, 132, 21);
		add(passwordTF);
		
		JLabel lblNewLabel_name = new JLabel("이름");
		lblNewLabel_name.setBounds(22, 251, 57, 15);
		add(lblNewLabel_name);
		
		nameTF = new JTextField();
		nameTF.setColumns(10);
		nameTF.setBounds(116, 248, 132, 21);
		add(nameTF);
		
		JLabel lblNewLabel_loc = new JLabel("주소");
		lblNewLabel_loc.setBounds(22, 293, 57, 15);
		add(lblNewLabel_loc);
		
		addressTF = new JTextField();
		addressTF.setColumns(10);
		addressTF.setBounds(116, 290, 132, 21);
		add(addressTF);
		
		JLabel lblNewLabel_phone = new JLabel("핸드폰번호");
		lblNewLabel_phone.setBounds(22, 333, 71, 15);
		add(lblNewLabel_phone);
		
		phoneTF = new JTextField();
		phoneTF.setColumns(10);
		phoneTF.setBounds(116, 330, 132, 21);
		add(phoneTF);
		
		idcheakBtn = new JButton("중복확인");
		idcheakBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		idcheakBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
					String m_id = idTF.getText();
					boolean isSuccess = frame.userService.isDuplicateId(m_id);
					if(isSuccess==false) {
						JOptionPane.showMessageDialog(null, "사용 가능한 아이디입니다");
						passwordTF.requestFocus();
						}else if(isSuccess==true) {
						JOptionPane.showMessageDialog(null, "존재하는 아이디입니다.");
						}
					}catch(Exception e1) {
					}
			}
		});
		
	
		idcheakBtn.setBounds(255, 127, 91, 23);
		add(idcheakBtn);
		
		joinBtn = new JButton("가입");
		joinBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//로그인창으로 화면전환
				try {
					if(newUser()>0) {
						JOptionPane.showMessageDialog(null, "가입을 축하드립니다.");
						deleteContext();
						frame.changePanel(12, null);
					}
				}catch(Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		joinBtn.setBounds(37, 412, 97, 23);
		add(joinBtn);
		
		cancelBtn = new JButton("취소");
		cancelBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//취소시 로그인창으로 화면전환
				deleteContext();
				frame.changePanel(12, null);
			}
		});
		cancelBtn.setBounds(199, 412, 97, 23);
		add(cancelBtn);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UserSignupPane_손요셉.class.getResource("/com/team1/jogiyo/ui/손요셉/image/조기요.png")));
		lblNewLabel.setBounds(127, 26, 97, 40);
		add(lblNewLabel);
		
		JButton idcheakBtn_1 = new JButton("확인");
		idcheakBtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		idcheakBtn_1.setBounds(257, 209, 91, 23);
		add(idcheakBtn_1);
		
		JLabel lblNewLabel_password_1 = new JLabel("비밀번호 확인");
		lblNewLabel_password_1.setBounds(22, 213, 81, 15);
		add(lblNewLabel_password_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(116, 210, 132, 21);
		add(textField);
/*******************************생성자끝**************************************/
		
		
	}
	

	public int newUser() throws Exception {
		int result=0;
		String m_id = idTF.getText();
		String m_password = passwordTF.getText();
		String m_name = nameTF.getText();
		String m_address = addressTF.getText();
		String m_phone = phoneTF.getText();
		System.out.println(m_id);
		result=frame.userService.create(new User(m_id,m_password,m_name,m_address,m_phone));
		return result;
	}
	
	public void deleteContext() {
		idTF.setText("");
		passwordTF.setText("");
		nameTF.setText("");
		addressTF.setText("");
		phoneTF.setText("");
	}
}
