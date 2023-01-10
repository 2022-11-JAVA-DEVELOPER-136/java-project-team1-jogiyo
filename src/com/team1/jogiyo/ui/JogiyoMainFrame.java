package com.team1.jogiyo.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import java.awt.Cursor;
import com.team1.jogiyo.ui.손요셉.UserMainPane_손요셉;
import com.team1.jogiyo.user.User;
import com.team1.jogiyo.user.UserService;
import com.team1.jogiyo.cart.CartService;
import com.team1.jogiyo.order.OrderService;
import com.team1.jogiyo.product.ProductService;
import com.team1.jogiyo.ui.손요셉.UserLoginPane_손요셉;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.team1.jogiyo.ui.조성동.OrderHistoryTabbedPanel_조성동;
import com.team1.jogiyo.ui.조성동.OrderHistoryDetailTabbedPanel_조성동;
import com.team1.jogiyo.ui.정유나.CartListTabbedPanel_정유나;
import com.team1.jogiyo.ui.손요셉.UserSignupPane_손요셉;
import com.team1.jogiyo.ui.이은지.CategoriesPanel_이은지;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import com.team1.jogiyo.ui.이은지.HansikPanel_이은지;
import com.team1.jogiyo.ui.이은지.JoongsikPanel_이은지;
import com.team1.jogiyo.ui.이은지.BunsikPanel_이은지;

public class JogiyoMainFrame extends JFrame {
	/****************1. Service 멤버필드 선언********************/
	private UserService userService;
	private ProductService productService;
	private CartService cartService;
	private OrderService orderService;
	
	User loginUser=null;
	/****************2. tap페이지 상수 선언********************/
	private static int USERTABBEDPANE_P=1;
	private static int USERMAINPANE=11; 
	private static int USERLOGINPANE=12; 
	private static int USERSIGNUPPPANE=13; 
	private static int USERVIEWDETAILPANE=14; 

	private static int PRODUCTTABBEDPANE_P=2;
	private static int PRODUCTCATEGOTYPANE=21; 
	private static int HANSIKPANE=22; 
	private static int JOONGSIKPANE=23; 
	private static int BUNSIKPANE=24;
	private static int PRODUCTDETAILPANE=25;

	private static int CARTTABBEDPANE_P=3;
	private static int ORDERTABBEDPANE_P=4;
	private static int ORDERHISTORYDETAILTABBEDPANE_P=5;
	/***********************************************************/
	private JPanel contentPane;
	private UserLoginPane_손요셉 userLoginPanel_손요셉;
	private JTabbedPane userTabbedPanel;
	private JLabel representLB;
	private JLabel cartLB;
	private JLabel userInfoLB;
	private JLabel homeLB;
	private JLabel orderLB;
	private UserMainPane_손요셉 userMainPanel_손요셉;
	private CartListTabbedPanel_정유나 cartListTabbedPanel_정유나;
	private OrderHistoryTabbedPanel_조성동 orderHistoryTabbedPanel_조성동;
	private OrderHistoryDetailTabbedPanel_조성동 orderHistoryDetailTabbedPanel_조성동;
	private CategoriesPanel_이은지 categoriesPanel_이은지;
	private JTabbedPane parentTabbedPanel;
	private JTabbedPane productTabbedPanel;
	private UserSignupPane_손요셉 userSignupPanel_손요셉;
	private JPanel panel;
	private JTextField findProductTL;
	private JLabel findProductIconLB;
	private HansikPanel_이은지 hansikPanel_이은지;
	private JoongsikPanel_이은지 joongsikPanel_이은지;
	private BunsikPanel_이은지 bunsikPanel_이은지;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JogiyoMainFrame frame = new JogiyoMainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public JogiyoMainFrame() throws Exception {
		setTitle("JOGIYO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel NorthPanel = new JPanel();
		NorthPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(NorthPanel, BorderLayout.NORTH);
		
		representLB = new JLabel("");
		representLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				userTabbedPanel.setSelectedComponent(categoriesPanel_이은지);
			}
		});
		NorthPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 5));
		representLB.setIcon(new ImageIcon(JogiyoMainFrame.class.getResource("/com/team1/jogiyo/ui/손요셉/image/smile (4).png")));
		representLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		NorthPanel.add(representLB);
		
		cartLB = new JLabel("");
		cartLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				userTabbedPanel.setSelectedComponent(cartListTabbedPanel_정유나);
			}
		});
		
		panel = new JPanel();
		NorthPanel.add(panel);
		
		findProductTL = new JTextField();
		panel.add(findProductTL);
		findProductTL.setColumns(10);
		
		findProductIconLB = new JLabel("");
		findProductIconLB.setIcon(new ImageIcon(JogiyoMainFrame.class.getResource("/images/search_20px.png")));
		panel.add(findProductIconLB);
		cartLB.setIcon(new ImageIcon(JogiyoMainFrame.class.getResource("/images/3cart_30px.png")));
		cartLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		NorthPanel.add(cartLB);
		
		JPanel SouthPanel = new JPanel();
		SouthPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.add(SouthPanel, BorderLayout.SOUTH);
		SouthPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 70, 5));
		
		userInfoLB = new JLabel("");
		userInfoLB.setHorizontalTextPosition(SwingConstants.CENTER);
		userInfoLB.setVerticalTextPosition(SwingConstants.BOTTOM);
		userInfoLB.setHorizontalAlignment(SwingConstants.CENTER);
		userInfoLB.setIcon(new ImageIcon(JogiyoMainFrame.class.getResource("/images/3my_50px.png")));
		userInfoLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SouthPanel.add(userInfoLB);
		
		homeLB = new JLabel("");
		homeLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				userTabbedPanel.setSelectedComponent(userMainPanel_손요셉);
			}
		});
		homeLB.setHorizontalTextPosition(SwingConstants.CENTER);
		homeLB.setVerticalTextPosition(SwingConstants.BOTTOM);
		homeLB.setIcon(new ImageIcon(JogiyoMainFrame.class.getResource("/images/3home_50px.png")));
		homeLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SouthPanel.add(homeLB);
		
		orderLB = new JLabel("");
		orderLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.exit(0);
			}
		});
		orderLB.setVerticalTextPosition(SwingConstants.BOTTOM);
		orderLB.setHorizontalTextPosition(SwingConstants.CENTER);
		orderLB.setIcon(new ImageIcon(JogiyoMainFrame.class.getResource("/images/50exit.png")));
		orderLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SouthPanel.add(orderLB);
		
		parentTabbedPanel = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(parentTabbedPanel, BorderLayout.CENTER);
		
		userTabbedPanel = new JTabbedPane(JTabbedPane.TOP);
		parentTabbedPanel.addTab("회원", null, userTabbedPanel, null);
		
		userMainPanel_손요셉 = new UserMainPane_손요셉();
		userMainPanel_손요셉.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				userTabbedPanel.setSelectedComponent(userLoginPanel_손요셉);
			}
		});
		userTabbedPanel.addTab("회원메인", null, userMainPanel_손요셉, null);
		
		userLoginPanel_손요셉 = new UserLoginPane_손요셉();
		
		userTabbedPanel.addTab("로그인", null, userLoginPanel_손요셉, null);
		
		userSignupPanel_손요셉 = new UserSignupPane_손요셉();
		userTabbedPanel.addTab("회원가입", null, userSignupPanel_손요셉, null);
		
		productTabbedPanel = new JTabbedPane(JTabbedPane.TOP);
		parentTabbedPanel.addTab("제품", null, productTabbedPanel, null);
		
		categoriesPanel_이은지 = new CategoriesPanel_이은지();
		productTabbedPanel.addTab("카테고리", null, categoriesPanel_이은지, null);
		
		hansikPanel_이은지 = new HansikPanel_이은지();
		productTabbedPanel.addTab("한식", null, hansikPanel_이은지, null);
		
		joongsikPanel_이은지 = new JoongsikPanel_이은지();
		productTabbedPanel.addTab("중식", null, joongsikPanel_이은지, null);
		
		bunsikPanel_이은지 = new BunsikPanel_이은지();
		productTabbedPanel.addTab("분식", null, bunsikPanel_이은지, null);
		
		cartListTabbedPanel_정유나 = new CartListTabbedPanel_정유나();
		parentTabbedPanel.addTab("카트", null, cartListTabbedPanel_정유나, null);
		
		orderHistoryTabbedPanel_조성동 = new OrderHistoryTabbedPanel_조성동();
		parentTabbedPanel.addTab("주문내역", null, orderHistoryTabbedPanel_조성동, null);
		
		orderHistoryDetailTabbedPanel_조성동 = new OrderHistoryDetailTabbedPanel_조성동();
		parentTabbedPanel.addTab("주문상세", null, orderHistoryDetailTabbedPanel_조성동, null);
		
		/*
		 * 3. Service 객체 생성
		 */
		userService =new UserService();
		productService =new ProductService();
		cartService = new CartService();
		orderService = new OrderService();
	}
}
