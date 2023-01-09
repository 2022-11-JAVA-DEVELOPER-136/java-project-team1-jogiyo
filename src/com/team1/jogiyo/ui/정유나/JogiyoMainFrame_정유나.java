package com.team1.jogiyo.ui.정유나;

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
import com.team1.jogiyo.ui.정유나.CartListPanel_정유나;
import java.awt.Cursor;
import com.team1.jogiyo.ui.조성동.OrderHistoryPanel_조성동;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JogiyoMainFrame_정유나 extends JFrame{

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel SouthPanel;
	private JPanel NorthPanel;
	private JLabel representLB;
	private JLabel findLB;
	private JLabel cartLB;
	private JLabel userInfoLB;
	private JLabel homeLB;
	private JLabel orderLB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JogiyoMainFrame_정유나 frame = new JogiyoMainFrame_정유나();
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
	public JogiyoMainFrame_정유나() throws Exception {
		setTitle("JOGIYO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		NorthPanel = new JPanel();
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
		
		SouthPanel = new JPanel();
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
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JTabbedPane userTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("회원", null, userTabbedPane, null);
		
		JTabbedPane productTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("제품", null, productTabbedPane, null);
		
		CartListPanel_정유나 cartListPanel_정유나 = new CartListPanel_정유나();
		cartListPanel_정유나.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		tabbedPane.addTab("New tab", null, cartListPanel_정유나, null);
		
		OrderHistoryPanel_조성동 orderHistoryPanel_조성동 = new OrderHistoryPanel_조성동();
		tabbedPane.addTab("New tab", null, orderHistoryPanel_조성동, null);
	}
}
