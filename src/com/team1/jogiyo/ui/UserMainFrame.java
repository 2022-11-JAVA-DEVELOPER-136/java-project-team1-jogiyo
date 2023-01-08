package com.team1.jogiyo.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.team1.jogiyo.user.User;
import com.team1.jogiyo.user.UserService;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserMainFrame extends JFrame {
	
	private UserService userService;
	
	/*****로그인한회원*******/
	private User loginUser=null;
	
	

	private JPanel contentPane;
	private JPasswordField mpassword;
	private JTextField idTF;
	private JPasswordField passwordTF;
	private JTextField nameTF;
	private JTextField addressTF;
	private JTextField phoneTF;
	private JTextField infoIdTF;
	private JPasswordField infoPassTF;
	private JTextField infoNameTF;
	private JTextField infoAddressTF;
	private JTextField infoPhoneTF;
	private JTextField mid;
	private JTabbedPane userTabbedPane;
	private JMenuItem logoutMenuItem;
	private JMenuItem exitMenuItem;
	private JPanel userMainLB;
	private JPanel userJoinPanel;
	private JLabel idMsgLB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserMainFrame frame = new UserMainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public UserMainFrame()throws Exception {
		setTitle("회원관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 689);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu userMeun = new JMenu("회원");
		menuBar.add(userMeun);
		
		logoutMenuItem = new JMenuItem("로그아웃");
		logoutMenuItem.setEnabled(false);
		userMeun.add(logoutMenuItem);
		
		exitMenuItem = new JMenuItem("종료");
		userMeun.add(exitMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		userTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(userTabbedPane, BorderLayout.CENTER);
		
		userMainLB = new JPanel();
		userMainLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(loginUser==null) {
					
				}
			}
		});
		userTabbedPane.addTab("회원메인", null, userMainLB, null);
		userMainLB.setLayout(new BorderLayout(0, 0));
		
		JPanel userLoginPanel = new JPanel();
		userTabbedPane.addTab("회원로그인", null, userLoginPanel, null);
		userLoginPanel.setLayout(null);
		
		JLabel loginLB = new JLabel("로 그 인");
		loginLB.setFont(new Font("휴먼가는팸체", Font.PLAIN, 53));
		loginLB.setBounds(139, 123, 208, 97);
		userLoginPanel.add(loginLB);
		
		mid = new JTextField();
		mid.setBounds(112, 231, 194, 43);
		userLoginPanel.add(mid);
		mid.setColumns(10);
		
		mpassword = new JPasswordField();
		mpassword.setBounds(112, 297, 194, 43);
		userLoginPanel.add(mpassword);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*****************회원로그인**************/
				try {
					String m_id = mid.getText();
					String m_pass=new String(mpassword.getPassword());
					
					int result = userService.login(m_id, m_pass);
					if(result == 0) {
						//로그인 성공
						loginProcess(m_id);
						mid.setText("");
						mpassword.setText("");
					}else{
						JOptionPane.showMessageDialog(null, "아이디또는 비밀번호를 확인하세요");
						mid.setSelectionStart(1);
						mid.setSelectionEnd(m_id.length());
						mid.requestFocus();
						}
					
				}catch(Exception e1) {
					
				}
			}
		});
		
		loginBtn.setFont(new Font("휴먼굵은팸체", Font.PLAIN, 17));
		loginBtn.setBounds(165, 374, 91, 28);
		userLoginPanel.add(loginBtn);
		
		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.setFont(new Font("휴먼굵은팸체", Font.PLAIN, 17));
		btnNewButton.setBounds(167, 413, 89, 23);
		userLoginPanel.add(btnNewButton);

		
	

		
		userJoinPanel = new JPanel();
		userTabbedPane.addTab("회원가입", null, userJoinPanel, null);
		userJoinPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("휴먼굵은팸체", Font.BOLD, 30));
		lblNewLabel.setBounds(49, 185, 75, 38);
		userJoinPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setFont(new Font("휴먼굵은팸체", Font.BOLD, 30));
		lblNewLabel_1.setBounds(49, 234, 69, 38);
		userJoinPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이 름");
		lblNewLabel_2.setFont(new Font("휴먼굵은팸체", Font.BOLD, 30));
		lblNewLabel_2.setBounds(49, 283, 69, 48);
		userJoinPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("주 소");
		lblNewLabel_3.setFont(new Font("휴먼굵은팸체", Font.BOLD, 30));
		lblNewLabel_3.setBounds(55, 341, 69, 28);
		userJoinPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("전화번호");
		lblNewLabel_4.setFont(new Font("휴먼굵은팸체", Font.BOLD, 30));
		lblNewLabel_4.setBounds(49, 380, 80, 48);
		userJoinPanel.add(lblNewLabel_4);
		
		idTF = new JTextField();
		idTF.setBounds(143, 185, 180, 28);
		userJoinPanel.add(idTF);
		idTF.setColumns(10);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(143, 234, 207, 28);
		userJoinPanel.add(passwordTF);
		
		nameTF = new JTextField();
		nameTF.setBounds(143, 283, 207, 28);
		userJoinPanel.add(nameTF);
		nameTF.setColumns(10);
		
		addressTF = new JTextField();
		addressTF.setBounds(143, 341, 207, 28);
		userJoinPanel.add(addressTF);
		addressTF.setColumns(10);
		
		phoneTF = new JTextField();
		phoneTF.setBounds(143, 395, 207, 28);
		userJoinPanel.add(phoneTF);
		phoneTF.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("회원가입");
		lblNewLabel_5.setFont(new Font("휴먼굵은팸체", Font.PLAIN, 53));
		lblNewLabel_5.setBounds(132, 43, 150, 110);
		userJoinPanel.add(lblNewLabel_5);
		
		JButton idCK = new JButton("아이디 중복체크");
		idCK.setFont(new Font("휴먼굵은팸체", Font.PLAIN, 11));
		idCK.setBounds(326, 185, 101, 28);
		userJoinPanel.add(idCK);
		
		JButton userJoinBtn = new JButton("가입");
		userJoinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/***********************회원가입**************************/
				try {
					String id = idTF.getText();
				
					/*************유효성체크**************/
					if(id.equals("")) {
						idMsgLB.setText("아이디를 입력하세요");
						idTF.requestFocus();
						return;
					}
					boolean isAdd = userService.isDuplicateId(id);
					if(isAdd) {
						//로그인화면전환
					userTabbedPane.setSelectedIndex(1);
				}else{
					JOptionPane.showMessageDialog(null, "이미사용중인 아이디입니다.");
					idTF.requestFocus();
					idTF.setSelectionStart(0);
					idTF.setSelectionEnd(id.length());
				}
				}catch(Exception e1) {
					System.out.println("회원가입:"+e1.getMessage());
				};
			}
		});
		userJoinBtn.setFont(new Font("휴먼굵은팸체", Font.PLAIN, 15));
		userJoinBtn.setBounds(90, 478, 89, 23);
		userJoinPanel.add(userJoinBtn);
		String id = idTF.getText();
		String password = new String(passwordTF.getPassword());
		String name=nameTF.getText();
		String address = addressTF.getText();
		String phone = phoneTF.getText();
		
		JButton userCancleBtn = new JButton("취소");
		userCancleBtn.setFont(new Font("휴먼굵은팸체", Font.PLAIN, 15));
		userCancleBtn.setBounds(261, 478, 89, 23);
		userJoinPanel.add(userCancleBtn);
		
		idMsgLB = new JLabel("");
		idMsgLB.setBounds(143, 164, 180, 14);
		userJoinPanel.add(idMsgLB);
		
		JPanel userInfoPanel = new JPanel();
		userTabbedPane.addTab("회원정보", null, userInfoPanel, null);
		userInfoPanel.setLayout(null);
		
		JLabel lblNewLabel_5_1 = new JLabel("회원정보");
		lblNewLabel_5_1.setFont(new Font("휴먼굵은팸체", Font.PLAIN, 53));
		lblNewLabel_5_1.setBounds(154, 46, 150, 110);
		userInfoPanel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6 = new JLabel("아이디");
		lblNewLabel_6.setFont(new Font("휴먼굵은팸체", Font.BOLD, 30));
		lblNewLabel_6.setBounds(71, 188, 75, 38);
		userInfoPanel.add(lblNewLabel_6);
		
		infoIdTF = new JTextField();
		infoIdTF.setColumns(10);
		infoIdTF.setBounds(165, 188, 207, 28);
		userInfoPanel.add(infoIdTF);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1.setFont(new Font("휴먼굵은팸체", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(71, 237, 69, 38);
		userInfoPanel.add(lblNewLabel_1_1);
		
		infoPassTF = new JPasswordField();
		infoPassTF.setBounds(165, 237, 207, 28);
		userInfoPanel.add(infoPassTF);
		
		JLabel lblNewLabel_2_1 = new JLabel("이 름");
		lblNewLabel_2_1.setFont(new Font("휴먼굵은팸체", Font.BOLD, 30));
		lblNewLabel_2_1.setBounds(71, 286, 69, 48);
		userInfoPanel.add(lblNewLabel_2_1);
		
		infoNameTF = new JTextField();
		infoNameTF.setColumns(10);
		infoNameTF.setBounds(165, 286, 207, 28);
		userInfoPanel.add(infoNameTF);
		
		JLabel lblNewLabel_3_1 = new JLabel("주 소");
		lblNewLabel_3_1.setFont(new Font("휴먼굵은팸체", Font.BOLD, 30));
		lblNewLabel_3_1.setBounds(77, 344, 69, 28);
		userInfoPanel.add(lblNewLabel_3_1);
		
		infoAddressTF = new JTextField();
		infoAddressTF.setColumns(10);
		infoAddressTF.setBounds(165, 344, 207, 28);
		userInfoPanel.add(infoAddressTF);
		
		JLabel lblNewLabel_4_1 = new JLabel("전화번호");
		lblNewLabel_4_1.setFont(new Font("휴먼굵은팸체", Font.BOLD, 30));
		lblNewLabel_4_1.setBounds(71, 383, 80, 48);
		userInfoPanel.add(lblNewLabel_4_1);
		
		infoPhoneTF = new JTextField();
		infoPhoneTF.setColumns(10);
		infoPhoneTF.setBounds(165, 398, 207, 28);
		userInfoPanel.add(infoPhoneTF);
		
		JButton updateFormBtn = new JButton("수정폼");
		updateFormBtn.setFont(new Font("휴먼굵은팸체", Font.PLAIN, 15));
		updateFormBtn.setBounds(112, 481, 89, 23);
		userInfoPanel.add(updateFormBtn);
		
		JButton updateBtn = new JButton("수정");
		updateBtn.setFont(new Font("휴먼굵은팸체", Font.PLAIN, 15));
		updateBtn.setBounds(283, 481, 89, 23);
		userInfoPanel.add(updateBtn);
	}//생성자끝
		
		/***************로그인성공시 호출할메쏘드********************/
		private void loginProcess(String m_id) throws Exception {
			//1. 로그인 성공한 멤버객체 멤버필드에 저장
			this.loginUser = userService.findUser(m_id);
			//2.UserMainFrame 타이틀변경
			setTitle(m_id+"님 로그인");
			userTabbedPane.setEnabledAt(1,false);
			userTabbedPane.setEnabledAt(2,false);
			userTabbedPane.setEnabledAt(3,true);
			logoutMenuItem.setEnabled(true);
			}
	}


	

