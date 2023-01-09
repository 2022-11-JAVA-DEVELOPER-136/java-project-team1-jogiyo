package com.team1.jogiyo.ui.정유나;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;

public class CartListPanel_정유나 extends JPanel {

	/**
	 * Create the panel.
	 */
	public CartListPanel_정유나() {
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 36, 326, 375);
		add(scrollPane);
		
		JButton orderAllBtn = new JButton("전체주문");
		orderAllBtn.setBounds(75, 446, 97, 23);
		add(orderAllBtn);
		
		JButton orderSelectionBtn = new JButton("선택주문");
		orderSelectionBtn.setBounds(201, 446, 97, 23);
		add(orderSelectionBtn);
		
		JLabel lblNewLabel_2 = new JLabel("총 금액 : ");
		lblNewLabel_2.setBounds(75, 421, 57, 15);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(167, 421, 135, 15);
		add(lblNewLabel_3);

	}
}
