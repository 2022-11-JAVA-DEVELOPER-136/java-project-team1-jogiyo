package com.team1.jogiyo.ui.손요셉;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import com.team1.jogiyo.user.User;
import com.team1.jogiyo.user.UserDao;
import com.team1.jogiyo.user.UserService;

import com.team1.jogiyo.ui.JogiyoMainFrame;
import com.team1.jogiyo.user.User;
import com.team1.jogiyo.user.UserService;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserViewDetail_손요셉 extends JPanel {

	private int selected_index = 0;
	/***********************************************/

	JogiyoMainFrame frame;
	User loginUser = null;

	public void setFrame(JogiyoMainFrame frame) {
		this.frame = frame;
	}

	public void setUser(User loginUser) {
		this.loginUser = loginUser;
	}

	private JTextField txtVjvjdid;
	private JTextField detailpasswordTF;
	private JTextField detailIdTF_1;

	private JTextField detailnameTF;
	private JTextField detailAddressTF;
	private JTextField detailPhoneTF;
	private JButton userViewUpdateBtn;
	private JButton userViewCancelBtn;

	/**
	 * Create the panel.
	 * 
	 * @throws Exception
	 */
	public UserViewDetail_손요셉() throws Exception {
		setBackground(Color.WHITE);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UserViewDetail_손요셉.class
				.getResource("/com/team1/jogiyo/ui/손요셉/image/free-icon-user-profile-5951752 (1).png")));
		lblNewLabel.setBounds(40, 77, 80, 85);
		add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setIcon(new ImageIcon(
				UserViewDetail_손요셉.class.getResource("/com/team1/jogiyo/ui/손요셉/image/free-icon-house-1009900.png")));
		lblNewLabel_1.setBounds(51, 285, 20, 20);
		add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(UserViewDetail_손요셉.class
				.getResource("/com/team1/jogiyo/ui/손요셉/image/free-icon-mobile-phone-7513561.png")));
		lblNewLabel_2.setBounds(51, 336, 20, 20);
		add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(
				UserViewDetail_손요셉.class.getResource("/com/team1/jogiyo/ui/손요셉/image/free-icon-name-1828439.png")));
		lblNewLabel_3.setBounds(51, 238, 27, 20);
		add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(
				UserViewDetail_손요셉.class.getResource("/com/team1/jogiyo/ui/손요셉/image/free-icon-password-6772359.png")));
		lblNewLabel_4.setBounds(51, 193, 27, 15);
		add(lblNewLabel_4);
		detailpasswordTF = new JTextField();
		detailpasswordTF.setEditable(false);
		detailpasswordTF.setText("비밀번호");
		detailpasswordTF.setBounds(89, 187, 146, 21);
		add(detailpasswordTF);
		detailpasswordTF.setColumns(10);
		
		detailIdTF_1 = new JTextField();
		detailIdTF_1.setEditable(false);
		detailIdTF_1.setText("이름");
		detailIdTF_1.setColumns(10);
		detailIdTF_1.setBounds(89, 237, 146, 21);
		add(detailIdTF_1);
		
		detailAddressTF = new JTextField();
		detailAddressTF.setEditable(false);
		detailAddressTF.setText("주소");
		detailAddressTF.setColumns(10);
		detailAddressTF.setBounds(89, 284, 146, 21);
		add(detailAddressTF);
		
		detailPhoneTF = new JTextField();
		detailPhoneTF.setEditable(false);
		detailPhoneTF.setText("핸드폰번호");
		detailPhoneTF.setColumns(10);
		detailPhoneTF.setBounds(89, 336, 146, 21);
		add(detailPhoneTF);
 
		
		userViewUpdateBtn = new JButton("수정");
		userViewUpdateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//수정클릭시 SQL 정보 업데이트 ==> 메쏘드 불러오기
				// 수정클릭시 SQL 정보 업데이트
				changeUpdateBtn(true);
				editUserInfo();
				
			}
		});
		userViewUpdateBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		userViewUpdateBtn.setBounds(40, 406, 97, 23);
		add(userViewUpdateBtn);

		userViewCancelBtn = new JButton("취소");
		userViewCancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 취소시 로그인 화면으로 전환
				userInfo(loginUser);
				frame.changePanel(12, null);
			}
		});
		userViewCancelBtn.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		userViewCancelBtn.setBounds(202, 406, 97, 23);
		add(userViewCancelBtn);

		JLabel lblNewLabel_5 = new JLabel("회원정보/수정");
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		lblNewLabel_5.setBounds(119, 21, 122, 23);
		add(lblNewLabel_5);

		/********************************************************/
}
	/*메소드*/
	public void userInfo(User user) {
		detailIdTF_1.setText(user.getM_id());		
		detailpasswordTF.setText(user.getM_password());				
		detailnameTF.setText(user.getM_name());				
		detailAddressTF.setText(user.getM_loc());				
		detailPhoneTF.setText(user.getM_phone());
		
	}
	
	public void editUserInfo() {
		try {
			String id = detailIdTF.getText();
			String name = detailIdTF_1.getText();
			String password = new String(detailpasswordTF.getText());
			String loc = detailAddressTF.getText();
			String phone = detailPhoneTF.getText();
			
			User updateUser = new User(id, password, name, loc, phone);
			frame.userService.update(updateUser);
			loginUser = frame.userService.findUser(id);
			
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
	}
	
	public void changeUpdateBtn(boolean b) {
		if(b) {
			detailpasswordTF.setEditable(true);
			detailnameTF.setEditable(true);
			detailAddressTF.setEditable(true);
			detailPhoneTF.setEditable(true);
			userViewUpdateBtn.setText("수정완료");
		} else {
			detailIdTF_1.setEditable(false);
			detailpasswordTF.setEditable(false);
			detailnameTF.setEditable(false);
			detailAddressTF.setEditable(false);
			detailPhoneTF.setEditable(false);
		}
	}
}


