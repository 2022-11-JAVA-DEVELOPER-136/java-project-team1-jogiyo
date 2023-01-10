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

public class JogiyoMainFrame extends JFrame {
	/****************1. Service 멤버필드 선언********************/
	private UserService userService;
	private ProductService productService;
	private CartService cartService;
	private OrderService orderService;
	
	private User loginUser=null;
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
	private UserLoginPane_손요셉 userLoginPane_손요셉;
	private JTabbedPane userTabbedPane;
	private JLabel representLB;
	private JLabel findLB;
	private JLabel cartLB;
	private JLabel userInfoLB;
	private JLabel homeLB;
	private JLabel orderLB;
	private JTabbedPane parentTabbedPane;
	private UserMainPane_손요셉 userMainPane_손요셉;
	private JTabbedPane productTabbedPane;
	private CartListTabbedPanel_정유나 cartListTabbedPanel_정유나;
	private OrderHistoryTabbedPanel_조성동 orderHistoryTabbedPanel_조성동;
	private OrderHistoryDetailTabbedPanel_조성동 orderHistoryDetailTabbedPanel_조성동;

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
		contentPane.add(NorthPanel, BorderLayout.NORTH);
		NorthPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 60, 5));
		
		representLB = new JLabel("[조기요]");
		representLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		NorthPanel.add(representLB);
		
		findLB = new JLabel("검색");
		NorthPanel.add(findLB);
		
		cartLB = new JLabel("[CART]");
		cartLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		NorthPanel.add(cartLB);
		
		JPanel SouthPanel = new JPanel();
		SouthPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.add(SouthPanel, BorderLayout.SOUTH);
		SouthPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 70, 5));
		
		userInfoLB = new JLabel("MY");
		userInfoLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SouthPanel.add(userInfoLB);
		
		homeLB = new JLabel("HOME");
		homeLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SouthPanel.add(homeLB);
		
		orderLB = new JLabel("ORDER");
		orderLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SouthPanel.add(orderLB);
		
		parentTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(parentTabbedPane, BorderLayout.CENTER);
		
		userTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		parentTabbedPane.addTab("회원", null, userTabbedPane, null);
		
		userMainPane_손요셉 = new UserMainPane_손요셉();
		userMainPane_손요셉.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				userTabbedPane.setSelectedComponent(userLoginPane_손요셉);
			}
		});
		userTabbedPane.addTab("회원메인", null, userMainPane_손요셉, null);
		
		userLoginPane_손요셉 = new UserLoginPane_손요셉();
		userLoginPane_손요셉.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//회원 로그인
			}
		});
		userTabbedPane.addTab("로그인", null, userLoginPane_손요셉, null);
		
		UserSignupPane_손요셉 userSignupPane_손요셉 = new UserSignupPane_손요셉();
		userTabbedPane.addTab("회원가입", null, userSignupPane_손요셉, null);
		
		productTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		parentTabbedPane.addTab("제품", null, productTabbedPane, null);
		
		CategoriesPanel_이은지 categoriesPanel_이은지 = new CategoriesPanel_이은지();
		productTabbedPane.addTab("카테고리", null, categoriesPanel_이은지, null);
		
		OrderHistoryTabbedPanel_조성동 orderHistoryPanel_조성동 = new OrderHistoryTabbedPanel_조성동();
		parentTabbedPane.addTab("주문내역", null, orderHistoryPanel_조성동, null);
		
		cartListTabbedPanel_정유나 = new CartListTabbedPanel_정유나();
		parentTabbedPane.addTab("카트", null, cartListTabbedPanel_정유나, null);
		
		orderHistoryTabbedPanel_조성동 = new OrderHistoryTabbedPanel_조성동();
		parentTabbedPane.addTab("주문내역", null, orderHistoryTabbedPanel_조성동, null);
		
		orderHistoryDetailTabbedPanel_조성동 = new OrderHistoryDetailTabbedPanel_조성동();
		parentTabbedPane.addTab("주문상세", null, orderHistoryDetailTabbedPanel_조성동, null);
	}	
}
