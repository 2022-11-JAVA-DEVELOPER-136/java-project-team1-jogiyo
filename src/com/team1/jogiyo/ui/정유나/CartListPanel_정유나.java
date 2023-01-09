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

public class CartListPanel_정유나 extends JPanel {

	/**
	 * Create the panel.
	 */
	public CartListPanel_정유나() {
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 56, 326, 346);
		add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("장바구니");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(84, 7, 142, 46);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("뒤로가기");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 10));
		btnNewButton.setBounds(12, 23, 73, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(224, 26, 57, 15);
		add(lblNewLabel_1);

	}
}
