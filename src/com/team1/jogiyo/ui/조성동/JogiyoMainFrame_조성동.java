package com.team1.jogiyo.ui.조성동;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.team1.jogiyo.ui.정유나.CartListTabbedPanel_정유나;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import java.awt.Cursor;

public class JogiyoMainFrame_조성동 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JogiyoMainFrame_조성동 frame = new JogiyoMainFrame_조성동();
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
	public JogiyoMainFrame_조성동() throws Exception {
		setTitle("JOGIYO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 700);
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
		
		JTabbedPane cartListPanel = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("카트", null, cartListPanel, null);
		
		//JTabbedPane orderTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		OrderHistoryTabbedPanel_조성동  orderTabbedPane = new OrderHistoryTabbedPanel_조성동();
		tabbedPane.addTab("주문내역", null, orderTabbedPane, null);
		
		OrderHistoryDetailTabbedPanel_조성동 orderHistoryDetailPanel_조성동 = new OrderHistoryDetailTabbedPanel_조성동();
		tabbedPane.addTab("주문상세", null,orderHistoryDetailPanel_조성동,null);
	}

}
