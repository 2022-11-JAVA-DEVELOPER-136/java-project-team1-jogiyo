package com.team1.jogiyo.ui.이은지;

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

public class JogiyoMainFrame_이은지 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JogiyoMainFrame_이은지 frame = new JogiyoMainFrame_이은지();
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
	public JogiyoMainFrame_이은지() throws Exception {
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
		
		JLabel representLB = new JLabel("[조기요]");
		representLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		NorthPanel.add(representLB);
		
		JLabel findLB = new JLabel("검색");
		NorthPanel.add(findLB);
		
		JLabel cartLB = new JLabel("[CART]");
		cartLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		NorthPanel.add(cartLB);
		
		JPanel SouthPanel = new JPanel();
		SouthPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.add(SouthPanel, BorderLayout.SOUTH);
		SouthPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 70, 5));
		
		JLabel userInfoLB = new JLabel("MY");
		userInfoLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SouthPanel.add(userInfoLB);
		
		JLabel homeLB = new JLabel("HOME");
		homeLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SouthPanel.add(homeLB);
		
		JLabel orderLB = new JLabel("ORDER");
		orderLB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SouthPanel.add(orderLB);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JTabbedPane userTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("회원", null, userTabbedPane, null);
		
		JTabbedPane productTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("제품", null, productTabbedPane, null);
		
		CategoriesPanel categoriesPanel = new CategoriesPanel();
		productTabbedPane.addTab("New tab", null, categoriesPanel, null);
		
		HansikPanel_이은지 hansikPanel = new HansikPanel_이은지();
		productTabbedPane.addTab("New tab", null, hansikPanel, null);
		
		JoongsikPanel_이은지 joongsikPanel = new JoongsikPanel_이은지();
		productTabbedPane.addTab("New tab", null, joongsikPanel, null);
		
		BunsikPanel_이은지 bunsikPanel = new BunsikPanel_이은지();
		productTabbedPane.addTab("New tab", null, bunsikPanel, null);
		

		JTabbedPane cartListPanel = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("카트", null, cartListPanel, null);
		
		JTabbedPane orderTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("주문내역", null, orderTabbedPane, null);
		
		JTabbedPane orderHistoryDetail = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("주문상세", null,orderHistoryDetail,null);
	}
}
