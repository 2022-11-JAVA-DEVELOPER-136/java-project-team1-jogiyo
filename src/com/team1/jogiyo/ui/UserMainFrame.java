package com.team1.jogiyo.ui;
import java.awt.EventQueue;


import com.team1.jogiyo.user.User;
import com.team1.jogiyo.user.UserService;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Vector;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class UserMainFrame extends JFrame {
	
	private static final String memberList = null;

	private UserService userService;
	
	/*****로그인한회원*******/
private User loginMember=null;
	
	private int selected_index = 0;
	
	private JPanel contentPane;
	private JTextField idTF;
	private JPasswordField passTF;
	private JTextField nameTF;
	private JTextField locTF;
	private JLabel idMsgLB;
	private JTextField loginIdTF;
	private JPasswordField loginPassTF;
	private JTextField infoIdTF;
	private JPasswordField infoPassTF;
	private JTextField infoNameTF;
	private JTextField infoAddressTF;
	private JTabbedPane memberTabbedPane;
	private JComboBox infoAgeCB;
	private JCheckBox infoMarriedCK;
	private JMenuItem loginMenuItem;
	private JMenuItem joinMenuItem;
	private JMenuItem logoutMenuItem;
	private JButton updateFormBtn;
	private JButton updateBtn;
	private JTable memberListTB;
	private JButton memberDeleteBtn;
	private JList memberListLT;
	private JComboBox memberListCB;
	private JTextField textField;

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
		setBounds(100, 100, 420, 574);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("D2Coding", Font.BOLD, 13));
		setJMenuBar(menuBar);
		
		JMenu memberMenu = new JMenu("회원");
		menuBar.add(memberMenu);
		
		loginMenuItem = new JMenuItem("로그인");
		loginMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberTabbedPane.setSelectedIndex(1);
			}
		});
		memberMenu.add(loginMenuItem);
		
		joinMenuItem = new JMenuItem("가입");
		joinMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberTabbedPane.setSelectedIndex(2);
			}
			
		});
		memberMenu.add(joinMenuItem);
		
		logoutMenuItem = new JMenuItem("로그아웃");
		logoutMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logoutProcess();
			}
		});
		memberMenu.add(logoutMenuItem);
		
		JSeparator separator = new JSeparator();
		memberMenu.add(separator);
		
		JMenuItem exitMenuItem = new JMenuItem("종료");
		exitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		memberMenu.add(exitMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		memberTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		memberTabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int selectedTabIndex=memberTabbedPane.getSelectedIndex();
				if(selectedTabIndex==4) {
					displayMemberList();
				}
			}
		});
		
		memberTabbedPane.setFont(new Font("D2Coding", Font.BOLD, 13));
		contentPane.add(memberTabbedPane, BorderLayout.CENTER);
		
		JPanel memberMainPanel = new JPanel();
		memberTabbedPane.addTab("회원메인", null, memberMainPanel, null);
		memberMainPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel memberMainLB = new JLabel("");
		memberMainLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(loginMember==null) {
					memberTabbedPane.setSelectedIndex(1);
				}else {
					memberTabbedPane.setSelectedIndex(3);
				}
			}
		});
		memberMainLB.setHorizontalAlignment(SwingConstants.CENTER);
		memberMainPanel.add(memberMainLB, BorderLayout.CENTER);
		
		JPanel memberLoginPanel = new JPanel();
		memberLoginPanel.setBackground(Color.WHITE);
		memberTabbedPane.addTab("회원로그인", null, memberLoginPanel, null);
		memberLoginPanel.setLayout(null);
		
		JLabel passwordLB = new JLabel("아이디");
		passwordLB.setBounds(67, 211, 57, 15);
		memberLoginPanel.add(passwordLB);
		
		JLabel lblNewLabel_6 = new JLabel("패쓰워드");
		lblNewLabel_6.setBounds(67, 252, 57, 15);
		memberLoginPanel.add(lblNewLabel_6);
		
		loginIdTF = new JTextField();
		loginIdTF.setBounds(136, 208, 116, 21);
		memberLoginPanel.add(loginIdTF);
		loginIdTF.setColumns(10);
		
		loginPassTF = new JPasswordField();
		loginPassTF.setBounds(136, 249, 116, 21);
		memberLoginPanel.add(loginPassTF);
		
		JButton loginBtn = new JButton("로그인");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/***********회원로그인************/
				try {
					String m_id = loginIdTF.getText();
					String m_password=new String(loginPassTF.getPassword());
					
					int result = userService.login(m_id, m_password);
					if(result==0) {
						//로그인성공
						loginProcess(m_id);
						loginIdTF.setText("");
						loginPassTF.setText("");
					}else {
						JOptionPane.showMessageDialog(null, "아이디또는 비밀번호를 확인하세요");
						loginIdTF.setSelectionStart(0);
						loginIdTF.setSelectionEnd(m_id.length());
						loginIdTF.requestFocus();
					}
					
					
					
				}catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		loginBtn.setBounds(67, 305, 97, 23);
		memberLoginPanel.add(loginBtn);
		
		JButton joinBtn = new JButton("회원가입");
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberTabbedPane.setSelectedIndex(1);
			}
		});
		joinBtn.setBounds(236, 305, 97, 23);
		memberLoginPanel.add(joinBtn);
		
		JLabel lblNewLabel_5 = new JLabel("로그인");
		lblNewLabel_5.setFont(new Font("HY견고딕", Font.PLAIN, 40));
		lblNewLabel_5.setBounds(135, 47, 133, 113);
		memberLoginPanel.add(lblNewLabel_5);
		
		JPanel memberJoinPanel = new JPanel();
		memberJoinPanel.setBackground(Color.WHITE);
		memberTabbedPane.addTab("회원가입", null, memberJoinPanel, null);
		memberJoinPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(53, 101, 57, 15);
		memberJoinPanel.add(lblNewLabel);
		
		idTF = new JTextField();
		idTF.setBounds(131, 98, 116, 21);
		memberJoinPanel.add(idTF);
		idTF.setColumns(10);
		
		JLabel 패쓰워드 = new JLabel("패쓰워드");
		패쓰워드.setBounds(53, 150, 57, 15);
		memberJoinPanel.add(패쓰워드);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(53, 203, 57, 15);
		memberJoinPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("주소");
		lblNewLabel_3.setBounds(53, 246, 57, 15);
		memberJoinPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("핸드폰 번호");
		lblNewLabel_4.setBounds(36, 290, 74, 15);
		memberJoinPanel.add(lblNewLabel_4);
		

		
		passTF = new JPasswordField();
		passTF.setBounds(131, 148, 116, 18);
		memberJoinPanel.add(passTF);
		
		nameTF = new JTextField();
		nameTF.setBounds(131, 200, 116, 21);
		memberJoinPanel.add(nameTF);
		nameTF.setColumns(10);
		
		locTF = new JTextField();
		locTF.setBounds(131, 243, 116, 21);
		memberJoinPanel.add(locTF);
		locTF.setColumns(10);
		
		
		
		
		
		JButton memberJoinBtn = new JButton("가입완료");
		memberJoinBtn.setFont(new Font("굴림", Font.BOLD, 20));
		memberJoinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*********** 회원가입 ************/
				try {
					/******TextField로 부터 데이타얻기*****/
					String id = idTF.getText();
					String password=new String(passTF.getPassword());
					String name=nameTF.getText();
					String address=locTF.getText();
					/***********유효성체크****************/
					if(id.equals("")) {
						 idMsgLB.setText("아이디를 입력하세요.");
						 idTF.requestFocus();
						return;
					}
					
					
					
					User newUser=new User(id,password,name,loc,phone);
					boolean isAdd = userService.addUser(newUser);
					if(isAdd) {
						//로그인화면전환
						 memberTabbedPane.setSelectedIndex(1);
					}else {
						JOptionPane.showMessageDialog(null, "이미사용하고있는 아이디입니다.");
						idTF.requestFocus();
						idTF.setSelectionStart(0);
						idTF.setSelectionEnd(id.length());
					}
				}catch (Exception e1) {
					System.out.println("회원가입-->"+e1.getMessage());
				}
			}
		});
		memberJoinBtn.setBounds(130, 332, 176, 38);
		memberJoinPanel.add(memberJoinBtn);
		
		JButton memberCancleBtn = new JButton("취소");
		memberCancleBtn.setBounds(179, 395, 97, 23);
		memberJoinPanel.add(memberCancleBtn);
		
		idMsgLB = new JLabel("");
		idMsgLB.setForeground(Color.RED);
		idMsgLB.setBounds(131, 88, 116, 15);
		memberJoinPanel.add(idMsgLB);
		
		textField = new JTextField();
		textField.setBounds(131, 287, 116, 21);
		memberJoinPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("회원가입");
		lblNewLabel_7.setFont(new Font("HY헤드라인M", Font.PLAIN, 30));
		lblNewLabel_7.setBounds(134, 11, 123, 54);
		memberJoinPanel.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("중복확인");
		btnNewButton.setBounds(259, 97, 81, 23);
		memberJoinPanel.add(btnNewButton);
		
		JPanel memberInfoPanel = new JPanel();
		memberInfoPanel.setBackground(Color.LIGHT_GRAY);
		memberTabbedPane.addTab("회원정보", null, memberInfoPanel, null);
		memberInfoPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setBounds(45, 48, 57, 15);
		memberInfoPanel.add(lblNewLabel_1);
		
		infoIdTF = new JTextField();
		infoIdTF.setEnabled(false);
		infoIdTF.setColumns(10);
		infoIdTF.setBounds(123, 45, 116, 21);
		memberInfoPanel.add(infoIdTF);
		
		JLabel 패쓰워드_1 = new JLabel("패쓰워드");
		패쓰워드_1.setBounds(45, 97, 57, 15);
		memberInfoPanel.add(패쓰워드_1);
		
		infoPassTF = new JPasswordField();
		infoPassTF.setEditable(false);
		infoPassTF.setBounds(123, 95, 116, 18);
		memberInfoPanel.add(infoPassTF);
		
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(45, 150, 57, 15);
		memberInfoPanel.add(lblNewLabel_2_1);
		
		infoNameTF = new JTextField();
		infoNameTF.setEditable(false);
		infoNameTF.setColumns(10);
		infoNameTF.setBounds(123, 147, 116, 21);
		memberInfoPanel.add(infoNameTF);
		
		JLabel lblNewLabel_3_1 = new JLabel("주소");
		lblNewLabel_3_1.setBounds(45, 193, 57, 15);
		memberInfoPanel.add(lblNewLabel_3_1);
		
		infoAddressTF = new JTextField();
		infoAddressTF.setEditable(false);
		infoAddressTF.setColumns(10);
		infoAddressTF.setBounds(123, 190, 116, 21);
		memberInfoPanel.add(infoAddressTF);
		
		JLabel lblNewLabel_4_1 = new JLabel("핸드폰번호");
		lblNewLabel_4_1.setBounds(45, 252, 57, 15);
		memberInfoPanel.add(lblNewLabel_4_1);
		
		infoAgeCB = new JComboBox();
		infoAgeCB.setEnabled(false);
		infoAgeCB.setModel(new DefaultComboBoxModel(new String[] {"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34"}));
		infoAgeCB.setBounds(123, 248, 116, 23);
		memberInfoPanel.add(infoAgeCB);
		
		
		infoMarriedCK = new JCheckBox("");
		infoMarriedCK.setEnabled(false);
		infoMarriedCK.setBounds(123, 310, 27, 19);
		memberInfoPanel.add(infoMarriedCK);
		
		updateFormBtn = new JButton("수정폼");
		updateFormBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnText=updateFormBtn.getText();
				if(btnText.equals("수정폼")) {
					updateFormEnable(true);
				}else if(btnText.equals("수정취소")) {
					displayMemberInfo(loginMember);
					updateFormEnable(false);
				}
				
				
			}
		});
		updateFormBtn.setBounds(38, 377, 97, 23);
		memberInfoPanel.add(updateFormBtn);
		
		updateBtn = new JButton("수정");
		updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**************** 회원수정 ***************/
				try {
					/******TextField로 부터 데이타얻기*****/
					String id = infoIdTF.getText();
					String password=new String(infoPassTF.getPassword());
					String name=infoNameTF.getText();
					String address=infoAddressTF.getText();
					
					String ageStr=(String)infoAgeCB.getSelectedItem();
					int age = Integer.parseInt(ageStr);
					String married="";
					if(infoMarriedCK.isSelected()) {
						married="T";
					}else {
						married="F";
					}
					User member=new User(id,password,name,loc,phone);
					userService.update(member);
					loginMember = userService.findUser(id);
					updateFormEnable(false);
				}catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		updateBtn.setBounds(147, 377, 97, 23);
		memberInfoPanel.add(updateBtn);
		
		JPanel memberAdminPanel = new JPanel();
		memberTabbedPane.addTab("회원관리", null, memberAdminPanel, null);
		memberAdminPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 365, 347);
		memberAdminPanel.add(scrollPane);
		
		memberListTB = new JTable();
		memberListTB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selected_index = memberListTB.getSelectedRow();
				memberDeleteBtn.setEnabled(true);
				
			}
		});
		memberListTB.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"\uC544\uC774\uB514", "\uD328\uC4F0\uC6CC\uB4DC", "\uC774\uB984", "\uC8FC\uC18C", "\uB098\uC774"
			}
		) {
			Class[] columnTypes = new Class[] {
				Long.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(memberListTB);
		
		JButton memberListBtn = new JButton("회원리스트");
		memberListBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayMemberList();
			}
		});
		memberListBtn.setBounds(52, 388, 104, 23);
		memberAdminPanel.add(memberListBtn);
		
		memberDeleteBtn = new JButton("회원삭제");
		memberDeleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int selectedRow = memberListTB.getSelectedRow();
					if(selected_index >= 0) {
						String selectedId=(String)memberListTB.getValueAt(selectedRow, 0);
						userService.remove(selectedId);
						displayMemberList();
					}else {
						memberDeleteBtn.setEnabled(false);
						
					}
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		memberDeleteBtn.setEnabled(false);
		memberDeleteBtn.setBounds(242, 388, 97, 23);
		memberAdminPanel.add(memberDeleteBtn);
		
		/******2.MemberService멤버필드객체생성*********/
		userService=new UserService();
		logoutProcess();
		
	}//생성자끝
	
	/*****************************************************/
	private void displayMemberList() {
		
		try {
			List<User> memberList = userService.userList();
			/***************회원리스트보기[JTable]************/
			Vector  columnVector=new Vector();
			columnVector.add("아이디");
			columnVector.add("패쓰워드");
			columnVector.add("이름");
			columnVector.add("주소");
			columnVector.add("핸드폰");
			
			Vector  tableVector=new Vector();
			
			for(User user : memberList) {
				Vector rowVector=new Vector();
				rowVector.add(user.getM_id());
				rowVector.add(user.getM_password());
				rowVector.add(user.getM_name());
				rowVector.add(user.getM_loc());
				rowVector.add(user.getM_phone());
				tableVector.add(rowVector);
			}
			DefaultTableModel tableModel=
					new DefaultTableModel(tableVector, columnVector);
			
			memberListTB.setModel(tableModel);
			memberDeleteBtn.setEnabled(false);	
			
			/***************회원리스트보기[JList]****************/
			DefaultListModel listModel=new DefaultListModel();
			for(User member:memberList) {
				listModel.addElement(member.getM_id());
			}
			memberListLT.setModel(listModel);
			/***************회원리스트보기[JCombobox]************/
			DefaultComboBoxModel  comboBoxModel=new DefaultComboBoxModel();
			for (User member : memberList) {
				comboBoxModel.addElement(member.getM_name()+"["+member.getM_id()+"]");
			}
			memberListCB.setModel(comboBoxModel);
			
			
		}catch(Exception e1) {
			System.out.println(e1.getMessage());
		}
		
	}
	
	/*************회원수정폼활성화 불활성화****************/
	private void updateFormEnable(boolean b) {
		if(b) {
			//활성화
			//infoIdTF.setEnabled(true);
			//infoPassTF.setEnabled(true);
			infoNameTF.setEditable(true);
			infoAddressTF.setEditable(true);
			infoAgeCB.setEnabled(true);
			infoMarriedCK.setEnabled(true);
			
			updateFormBtn.setText("수정취소");
			updateBtn.setEnabled(true);
		}else {
			//불활성화
			infoIdTF.setEnabled(false);
			infoPassTF.setEnabled(false);
			infoNameTF.setEditable(false);
			infoAddressTF.setEditable(false);
			infoAgeCB.setEnabled(false);
			infoMarriedCK.setEnabled(false);
			
			updateFormBtn.setText("수정폼");
			updateBtn.setEnabled(false);
		}
		
	}
	
	
	/**************로그아웃시   호출할메쏘드***************/
	private void logoutProcess() {
		/***********로그아웃시 해야할일***********
		 1.로그인성공한 멤버객체 멤버필드에서제거
		 2.MemberMainFrame타이틀변경
		 3.로그인,회원가입탭 활성화,회원정보탭 불활성화
		   로그인,회원가입 메뉴아이템 활성화
		   로그아웃 메뉴아이템 불활성화
		 
		 4.메인 화면전환
		********************************************/
		this.loginMember=null;
		setTitle("회원관리");
		
		memberTabbedPane.setEnabledAt(1, true);
		memberTabbedPane.setEnabledAt(2, true);
		memberTabbedPane.setEnabledAt(3, false);
		loginMenuItem.setEnabled(true);
		joinMenuItem.setEnabled(true);
		logoutMenuItem.setEnabled(false);
		
		memberTabbedPane.setSelectedIndex(0);
	}
	/**************로그인성공시 호출할메쏘드***************/
	private void loginProcess(String id) throws Exception{
		/***********로그인성공시 해야할일***********
		 1.로그인성공한 멤버객체 멤버필드에저장
		 2.MemberMainFrame타이틀변경
		 3.로그인,회원가입탭 불활성화
		   로그인,회원가입 메뉴아이템 불활성화
		   로그아웃 메뉴아이템 활성화
		 4.회원정보보기 화면전환
		********************************************/
		//1.로그인성공한 멤버객체 멤버필드에저장
		this.loginMember = userService.findUser(id);
		//2.MemberMainFrame타이틀변경
		setTitle(id+" 님 로그인");
		// 3.로그인,회원가입탭 불활성화
		memberTabbedPane.setEnabledAt(1, false);
		memberTabbedPane.setEnabledAt(2, false);
		memberTabbedPane.setEnabledAt(3, true);
		loginMenuItem.setEnabled(false);
		joinMenuItem.setEnabled(false);
		logoutMenuItem.setEnabled(true);
		
		
		// 4.회원정보보기 화면전환
		memberTabbedPane.setSelectedIndex(3);
		displayMemberInfo(this.loginMember);
		updateFormEnable(false);
	}
	
	private void displayMemberInfo(User user) {
		/****회원상세데이타보여주기*****/
		infoIdTF.setText(user.getM_id());
		infoPassTF.setText(user.getM_password());
		infoNameTF.setText(user.getM_name());
		infoAddressTF.setText(user.getM_loc());
		infoAgeCB.setSelectedItem(user.getM_phone()+"");
		
		
	}
}

	

