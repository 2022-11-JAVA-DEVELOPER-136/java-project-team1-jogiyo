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
import com.team1.jogiyo.order.Order;
import com.team1.jogiyo.order.OrderService;
import com.team1.jogiyo.product.Product;
import com.team1.jogiyo.product.ProductService;
import com.team1.jogiyo.ui.손요셉.UserLoginPane_손요셉;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.team1.jogiyo.ui.조성동.OrderHistoryTabbedPanel_조성동;
import com.team1.jogiyo.ui.조성동.OrderHistoryDetailTabbedPanel_조성동;
import com.team1.jogiyo.ui.정유나.CartListTabbedPanel_정유나;
import com.team1.jogiyo.ui.손요셉.UserSignupPane_손요셉;

import com.team1.jogiyo.ui.이은지.*;

import com.team1.jogiyo.ui.손요셉.UserViewDetail_손요셉;
import com.team1.jogiyo.ui.이은지.CategoriesPanel_이은지;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import com.team1.jogiyo.ui.이다은.ProductDetailPanel_이다은;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class JogiyoMainFrame extends JFrame {
	/****************1. Service 멤버필드 선언********************/
	public UserService userService;
	public ProductService productService;
	public CartService cartService;
	public OrderService orderService;
	
	public User loginUser=null;

	/****************2. tap페이지 상수 선언********************/
	public static int USERTABBEDPANE_P=1;
	public static int USERMAINPANE=11; 
	public static int USERLOGINPANE=12; 
	public static int USERSIGNUPPANE=13; 
	public static int USERVIEWDETAILPANE=14; 

	public static int PRODUCTTABBEDPANE_P=2;
	public static int PRODUCTCATEGORYPANE=21; 
	public static int HANSIKPANE=22; 
	public static int JOONGSIKPANE=23; 
	public static int BUNSIKPANE=24;
	public static int PRODUCTDETAILPANE=25;

	public static int CARTTABBEDPANE_P=3;
	public static int ORDERTABBEDPANE_P=4;
	public static int ORDERDETAILTABBEDPANE_P=5;
	/***********************************************************/
	private JPanel contentPane;
	private UserLoginPane_손요셉 userLoginPanel_손요셉;
	private JTabbedPane userTabbedPanel;
	private JLabel representLB;
	private JLabel cartLB;
	private JLabel userInfoLB;
	private JLabel homeLB;
	private JLabel exitLB;
	private UserMainPane_손요셉 userMainPanel_손요셉;
	private CartListTabbedPanel_정유나 cartListTabbedPanel_정유나;
	private OrderHistoryTabbedPanel_조성동 orderHistoryTabbedPanel_조성동;
	private OrderHistoryDetailTabbedPanel_조성동 orderHistoryDetailTabbedPanel_조성동;
	private JTabbedPane parentTabbedPanel;
	private JTabbedPane productTabbedPanel;
	private UserSignupPane_손요셉 userSignupPanel_손요셉;
	private JPanel panel;
	private JTextField findProductTL;
	private JLabel findProductIconLB;
	private UserViewDetail_손요셉 userViewDetail_손요셉;
	private CategoriesPanel_이은지2 categoriesPanel_이은지2;
	private ProductDetailPanel_이다은 productDetailPanel_이다은;
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
		
		JPanel northPanel = new JPanel();
		northPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(northPanel, BorderLayout.NORTH);
		
		representLB = new JLabel("");

		representLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.print("발생");
				changePanel(USERMAINPANE, null);
				
			}
		});
		northPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 5));
		representLB.setIcon(new ImageIcon(JogiyoMainFrame.class.getResource("/com/team1/jogiyo/ui/손요셉/image/smile (4).png")));
		representLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		northPanel.add(representLB);
		
		cartLB = new JLabel("");
		cartLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changePanel(CARTTABBEDPANE_P, null);
			}
		});
		
		panel = new JPanel();
		northPanel.add(panel);
		
		findProductTL = new JTextField();
		panel.add(findProductTL);
		findProductTL.setColumns(10);
		
		findProductIconLB = new JLabel("");
		findProductIconLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Product searchedProduct=productService.findByName(findProductTL.getText());
					changePanel(PRODUCTDETAILPANE,searchedProduct);
				} catch(Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		findProductIconLB.setIcon(new ImageIcon(JogiyoMainFrame.class.getResource("/images/search_20px.png")));
		panel.add(findProductIconLB);
		cartLB.setIcon(new ImageIcon(JogiyoMainFrame.class.getResource("/images/3cart_30px.png")));
		cartLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		northPanel.add(cartLB);
		
		JPanel southPanel = new JPanel();
		southPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.add(southPanel, BorderLayout.SOUTH);
		southPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 70, 5));
		
		userInfoLB = new JLabel("");
		userInfoLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changePanel(USERVIEWDETAILPANE, null);
			}
		});
		userInfoLB.setHorizontalTextPosition(SwingConstants.CENTER);
		userInfoLB.setVerticalTextPosition(SwingConstants.BOTTOM);
		userInfoLB.setHorizontalAlignment(SwingConstants.CENTER);
		userInfoLB.setIcon(new ImageIcon(JogiyoMainFrame.class.getResource("/images/3my_50px.png")));
		userInfoLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		southPanel.add(userInfoLB);
		
		homeLB = new JLabel("");
		homeLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changePanel(PRODUCTCATEGORYPANE, null);
			}
		});
		homeLB.setHorizontalTextPosition(SwingConstants.CENTER);
		homeLB.setVerticalTextPosition(SwingConstants.BOTTOM);
		homeLB.setIcon(new ImageIcon(JogiyoMainFrame.class.getResource("/images/3home_50px.png")));
		homeLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		southPanel.add(homeLB);
		
		exitLB = new JLabel("");
		exitLB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.exit(0);
			}
		});
		exitLB.setVerticalTextPosition(SwingConstants.BOTTOM);
		exitLB.setHorizontalTextPosition(SwingConstants.CENTER);
		exitLB.setIcon(new ImageIcon(JogiyoMainFrame.class.getResource("/images/50exit.png")));
		exitLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		southPanel.add(exitLB);
		
		parentTabbedPanel = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(parentTabbedPanel, BorderLayout.CENTER);
		
		userTabbedPanel = new JTabbedPane(JTabbedPane.TOP);
		parentTabbedPanel.addTab("회원", null, userTabbedPanel, null);
		
		userMainPanel_손요셉 = new UserMainPane_손요셉();
		userMainPanel_손요셉.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changePanel(USERLOGINPANE, null);
			}
		});
		userTabbedPanel.addTab("회원메인", null, userMainPanel_손요셉, null);
		
		userLoginPanel_손요셉 = new UserLoginPane_손요셉();
		
		userTabbedPanel.addTab("로그인", null, userLoginPanel_손요셉, null);
		
		userSignupPanel_손요셉 = new UserSignupPane_손요셉();
		userTabbedPanel.addTab("회원가입", null, userSignupPanel_손요셉, null);
		
		productTabbedPanel = new JTabbedPane(JTabbedPane.TOP);
		parentTabbedPanel.addTab("제품", null, productTabbedPanel, null);
		
		categoriesPanel_이은지2 = new CategoriesPanel_이은지2();
		productTabbedPanel.addTab("카테고리", null, categoriesPanel_이은지2, null);
		
		hansikPanel_이은지 = new HansikPanel_이은지();
		productTabbedPanel.addTab("한식", null, hansikPanel_이은지, null);
		
		joongsikPanel_이은지 = new JoongsikPanel_이은지();
		productTabbedPanel.addTab("중식", null, joongsikPanel_이은지, null);
		
		bunsikPanel_이은지 = new BunsikPanel_이은지();
		productTabbedPanel.addTab("분식", null, bunsikPanel_이은지, null);
		
		productDetailPanel_이다은 = new ProductDetailPanel_이다은();
		productTabbedPanel.addTab("상세설명", null, productDetailPanel_이다은, null);
		
		cartListTabbedPanel_정유나 = new CartListTabbedPanel_정유나();
		parentTabbedPanel.addTab("카트", null, cartListTabbedPanel_정유나, null);
		
		orderHistoryTabbedPanel_조성동 = new OrderHistoryTabbedPanel_조성동();
		parentTabbedPanel.addTab("주문내역", null, orderHistoryTabbedPanel_조성동, null);
		
		orderHistoryDetailTabbedPanel_조성동 = new OrderHistoryDetailTabbedPanel_조성동();
		parentTabbedPanel.addTab("주문상세", null, orderHistoryDetailTabbedPanel_조성동, null);
		
		userViewDetail_손요셉 = new UserViewDetail_손요셉();
		userTabbedPanel.addTab("회원정보", null, userViewDetail_손요셉, null);

		/*
		 * 3. Service 객체 생성
		 */
		userService =new UserService();
		productService =new ProductService();
		cartService = new CartService();
		orderService = new OrderService();
		loginUser=new User();

		/*
		 * JogiyoMainFrame 참조를 Panel에 넘겨줌
		 */
		/*
		userLoginPanel_손요셉.setFrame(this);
		userMainPanel_손요셉.setFrame(this);
		userSignupPanel_손요셉.setFrame(this);
		userViewDetail_손요셉.setFrame(this);
		orderHistoryTabbedPanel_조성동.setFrame(this);
		orderHistoryDetailTabbedPanel_조성동.setFrame(this);
		*/
		userMainPanel_손요셉.setFrame(this);
		userSignupPanel_손요셉.setFrame(this);
		userViewDetail_손요셉.setFrame(this);
		categoriesPanel_이은지2.setFrame(this);
		hansikPanel_이은지.setFrame(this);
		joongsikPanel_이은지.setFrame(this);
		bunsikPanel_이은지.setFrame(this);
		productDetailPanel_이다은.setFrame(this);
		cartListTabbedPanel_정유나.setFrame(this);
		orderHistoryTabbedPanel_조성동.setFrame(this);
		orderHistoryDetailTabbedPanel_조성동.setFrame(this);

	}
	public void changePanel(int panel_no,Object data){
		if(panel_no==USERTABBEDPANE_P) {
			parentTabbedPanel.setSelectedIndex(0);
		} else if(panel_no==USERMAINPANE) {
			parentTabbedPanel.setSelectedIndex(0);
			userTabbedPanel.setSelectedIndex(0);
		} else if(panel_no==USERLOGINPANE){
			parentTabbedPanel.setSelectedIndex(0);
			userTabbedPanel.setSelectedIndex(1);
		} else if(panel_no==USERSIGNUPPANE){
			parentTabbedPanel.setSelectedIndex(0);
			userTabbedPanel.setSelectedIndex(2);
		} else if(panel_no==USERVIEWDETAILPANE){
			parentTabbedPanel.setSelectedIndex(0);
			userTabbedPanel.setSelectedIndex(3);
			userTabbedPanel.setSelectedIndex(4);
		} else if(panel_no==PRODUCTTABBEDPANE_P){
			parentTabbedPanel.setSelectedIndex(1);
		} else if(panel_no==PRODUCTCATEGORYPANE){
			loginUser= (User)data;
			try {
				transferLoginUser(loginUser);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			parentTabbedPanel.setSelectedIndex(1);
			productTabbedPanel.setSelectedIndex(0);
		} else if(panel_no==HANSIKPANE){
			parentTabbedPanel.setSelectedIndex(1);
			productTabbedPanel.setSelectedIndex(1);
		} else if(panel_no==JOONGSIKPANE){
			parentTabbedPanel.setSelectedIndex(1);
			productTabbedPanel.setSelectedIndex(2);
		} else if(panel_no==BUNSIKPANE){
			parentTabbedPanel.setSelectedIndex(1);
			productTabbedPanel.setSelectedIndex(3);
		} else if(panel_no==PRODUCTDETAILPANE){
			try {
				transferHansikProduct((Product)data);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			parentTabbedPanel.setSelectedIndex(1);
			productTabbedPanel.setSelectedIndex(4);
		} else if(panel_no==CARTTABBEDPANE_P){
			parentTabbedPanel.setSelectedIndex(2);
		} else if(panel_no==ORDERTABBEDPANE_P){
			parentTabbedPanel.setSelectedIndex(3);
		} else if(panel_no==ORDERDETAILTABBEDPANE_P){
			try {
				transferOrder((Order)data);
			} catch (Exception e) {
				e.printStackTrace();
			}
			parentTabbedPanel.setSelectedIndex(4);
		}
	}
	
	public void transferLoginUser(User user) throws Exception {
		System.out.println("user :"+user);
		userMainPanel_손요셉.setUser(user);
		userSignupPanel_손요셉.setUser(user);
		userViewDetail_손요셉.setUser(user);
		categoriesPanel_이은지2.setUser(user);
		hansikPanel_이은지.setUser(user);
		joongsikPanel_이은지.setUser(user);
		bunsikPanel_이은지.setUser(user);
		productDetailPanel_이다은.setUser(user);
		cartListTabbedPanel_정유나.setUser(user);
		orderHistoryTabbedPanel_조성동.setUser(user);
		orderHistoryDetailTabbedPanel_조성동.setUser(user);
	}
	
	
	public void transferOrder(Order order) throws Exception {
		orderHistoryDetailTabbedPanel_조성동.setOrder(order);
	}
	
	public void transferHansikProduct(Product product) throws Exception{
		//productDetailPanel_이다은.setProduct(product);
	}		//한식,중식,분식
}
